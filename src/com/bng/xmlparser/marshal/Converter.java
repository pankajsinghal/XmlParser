package com.bng.xmlparser.marshal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import com.bng.xmlparser.unmarshal.MxCellSCP;
import com.bng.xmlparser.unmarshal.MxGraphModel;
import com.bng.xmlparser.unmarshal.MxParamsSCP;
import com.bng.xmlparser.unmarshal.Rec;

public class Converter {

	public static BnGModel convert(MxGraphModel mxGraphModel) {
		BnGModel bnGModel = new BnGModel();

		bnGModel.setConnect(mxGraphModel.getConnect());
		bnGModel.setFold(mxGraphModel.getFold());
		bnGModel.setGrid(mxGraphModel.getGrid());
		bnGModel.setGuides(mxGraphModel.getGuides());
		bnGModel.setPage(mxGraphModel.getPage());
		bnGModel.setPageHeight(mxGraphModel.getPageHeight());
		bnGModel.setPageScale(mxGraphModel.getPageScale());
		bnGModel.setPageWidth(mxGraphModel.getPageWidth());
		bnGModel.setTooltips(mxGraphModel.getTooltips());
		bnGModel.setMxCellList(convert(mxGraphModel.getMxCellList()));

		return bnGModel;
	}

	private static ArrayList<MxCellCoreEngine> convert(
			ArrayList<MxCellSCP> mxCellList) {

		ArrayList<MxCellCoreEngine> mxCellCoreEngineList = new ArrayList<MxCellCoreEngine>();
		try {
			for (MxCellSCP mxCellSCP : mxCellList) {
				MxCellCoreEngine mxCellCoreEngine = new MxCellCoreEngine();
				mxCellCoreEngine.setId(mxCellSCP.getId());
				mxCellCoreEngine.setSource(mxCellSCP.getSource());
				mxCellCoreEngine.setTarget(mxCellSCP.getTarget());
				mxCellCoreEngine.setType(mxCellSCP.getType());
				mxCellCoreEngine.setValue(mxCellSCP.getValue()==null?null:mxCellSCP.getValue().toLowerCase().split("\\|")[mxCellSCP.getValue().toLowerCase().split("\\|").length-1]);
				// try catch because sometimes mxCellSCP.getType() is null and
				// throws exception while performing @equalsIgnoreCase on that
				// object
				try {
					if (mxCellSCP.getType().equalsIgnoreCase("db")
							|| mxCellSCP.getType().equalsIgnoreCase("dtmf")
							|| mxCellSCP.getType().equalsIgnoreCase("normal")
							|| mxCellSCP.getType().equalsIgnoreCase("check"))
						throw new Exception();
					else if (mxCellSCP.getType().equalsIgnoreCase("Processing")){
						mxCellCoreEngine.setMxParamList(convert(mxCellSCP
								.getMxparams(), mxCellSCP.getValue()
								.toLowerCase().split("\\|")));
//						System.out.println(mxCellSCP.getValue()
//								.toLowerCase());
//						System.out.println("entered processing : " + Arrays.toString(mxCellSCP.getValue()
//								.toLowerCase().split("\\|")));
						}
					else
						mxCellCoreEngine.setMxParamList(convert(mxCellSCP
								.getMxparams()));

				} catch (Exception e) {
					// e.printStackTrace();
					mxCellCoreEngine.setMxParamList(null);
				}

				// mxCellCoreEngine
				// .setMxParamList(convert(mxCellSCP.getMxparams()));

				mxCellCoreEngineList.add(mxCellCoreEngine);
			}
		} catch (NullPointerException e) {
			System.out.println("error: " + e.getMessage());
		}
		return mxCellCoreEngineList;
	}

	private static ArrayList<MxParamsCoreEngine> convert(
			MxParamsSCP mxParamsSCP, String... strings) {
		int size = 1;
		String mulId = "";
		ArrayList<MxParamsCoreEngine> mxParamsList = new ArrayList<MxParamsCoreEngine>();
		ArrayList<Rec> recList;
		try {
			recList = mxParamsSCP.getRecList();
		} catch (Exception e) {
			return null;
		}

		// recList = mxParamsSCP.getRecList();

		for (Rec rec : recList) {
			if (rec.getType().equalsIgnoreCase("selectmul")) {
				size = rec.getValueList().size();
				mulId = rec.getId();
			}
		}
		
		if(size<1){
			size = 1;
			mulId = "";
		}
			
		 outerloop:
		for (int i = 0; i < size; i++) {
			MxParamsCoreEngine mxParamsCoreEngine = new MxParamsCoreEngine();
			for (Rec rec : recList) {
				if(rec.getValueList().size()<1) continue;
				try {
					int pos = rec.getId().equalsIgnoreCase(mulId) ? i : 0;
//					 uncomment if dependency attribute
//					 of "values" have to be read
					 if (rec.getValueList().get(pos).getDependency()
					 .equalsIgnoreCase("discard"))
					 continue outerloop;
					if (strings.length > 0
							&& rec.getId().equalsIgnoreCase(strings[strings.length-1])) {
//						System.out.println("strings.length : "+ strings.length);
//						System.out.println("rec.getId() : "+rec.getId());
						mxParamsCoreEngine
								.setValue(rec.getValueList().get(pos).getValue());
					}

					else if (strings.length <= 0)
						setparams(rec, mxParamsCoreEngine, pos);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			mxParamsList.add(mxParamsCoreEngine);
		}

		return mxParamsList;
	}

	private static void setparams(Rec rec,
			MxParamsCoreEngine mxParamsCoreEngine, int pos) {
		try {
			String methodName = "set"
					+ Character.toUpperCase(rec.getId().charAt(0))
					+ rec.getId().substring(1);
			if (!methodName.equalsIgnoreCase("setNull") && !methodName.equalsIgnoreCase("setServicedescription")) {
				Method method = mxParamsCoreEngine.getClass()
						.getDeclaredMethod(methodName, String.class);
				method.invoke(mxParamsCoreEngine, rec.getValueList().get(pos).getValue());

			}
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
