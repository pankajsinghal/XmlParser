package com.bng.xmlparser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.bng.xmlparser.marshal.BnGModel;
import com.bng.xmlparser.marshal.Converter;
//import com.bng.xmlparser.marshal.Converter;
import com.bng.xmlparser.unmarshal.MxGraphModel;

public class Main {

	public static void main(String[] args) {
		long sec1 =0;
		File file = new File("E:\\workspace\\XmlParser\\resources\\scp.xml");
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(MxGraphModel.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			 sec1 = System.currentTimeMillis();
			MxGraphModel mxGraphModel = (MxGraphModel) jaxbUnmarshaller
					.unmarshal(file);
			
			BnGModel bnGModel = Converter.convert(mxGraphModel);

			jaxbContext = JAXBContext.newInstance(BnGModel.class);
			Marshaller m = jaxbContext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
			// Write to File
			m.marshal(bnGModel, new File(
					"E:\\workspace\\XmlParser\\resources\\scp_new.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		long sec2 = System.currentTimeMillis();
		System.out.println(sec2-sec1);
	}

}
