package com.bng.xmlparser.unmarshal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "recs")
@XmlAccessorType(XmlAccessType.FIELD)
public class Rec {

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "type")
	private String type;

	// change arraylist type to "value" from "string" in case dependency attribute
	// of "values" have to be read
	@XmlElementWrapper(name = "values")
	@XmlElement(name = "value")
	private ArrayList<Value> valueList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Value> getValueList() {
		return valueList;
	}

	public void setValueList(ArrayList<Value> valueList) {
		this.valueList = valueList;
	}

}
