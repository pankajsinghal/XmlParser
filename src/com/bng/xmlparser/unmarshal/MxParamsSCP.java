package com.bng.xmlparser.unmarshal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class MxParamsSCP {

	@XmlElementWrapper(name = "recs")
	@XmlElement(name = "rec")
	private ArrayList<Rec> recList;

	public ArrayList<Rec> getRecList() {
		return recList;
	}

	public void setRecList(ArrayList<Rec> recList) {
		this.recList = recList;
	}
}
