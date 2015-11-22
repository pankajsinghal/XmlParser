package com.bng.xmlparser.marshal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class MxCellCoreEngine {

	@XmlAttribute(name = "id")
	private Integer id;

	@XmlAttribute(name = "type")
	private String type;

	@XmlAttribute(name = "value")
	private String value;

	@XmlAttribute(name = "source")
	private Integer source;

	@XmlAttribute(name = "target")
	private Integer target;

	@XmlElementWrapper(name = "mxParams")
	@XmlElement(name = "mxParam", type = MxParamsCoreEngine.class)
	private ArrayList<MxParamsCoreEngine> mxParamList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public ArrayList<MxParamsCoreEngine> getMxParamList() {
		return mxParamList;
	}

	public void setMxParamList(ArrayList<MxParamsCoreEngine> mxParamList) {
		this.mxParamList = mxParamList;
	}
	



}
