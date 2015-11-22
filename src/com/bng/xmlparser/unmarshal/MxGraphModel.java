package com.bng.xmlparser.unmarshal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mxGraphModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class MxGraphModel {

	@XmlAttribute(name = "grid")
	private Integer grid;

	@XmlAttribute(name = "guide")
	private Integer guides;

	@XmlAttribute(name = "tooltips")
	private Integer tooltips;

	@XmlAttribute(name = "connect")
	private Integer connect;

	@XmlAttribute(name = "fold")
	private Integer fold;

	@XmlAttribute(name = "page")
	private Integer page;

	@XmlAttribute(name = "pageScale")
	private Integer pageScale;

	@XmlAttribute(name = "pageWidth")
	private Integer pageWidth;

	@XmlAttribute(name = "pageHeight")
	private Integer pageHeight;

	@XmlElementWrapper(name = "root")
	@XmlElement(name = "mxCell", type = MxCellSCP.class)
	private ArrayList<MxCellSCP> mxCellList;

	public Integer getGrid() {
		return grid;
	}

	public void setGrid(Integer grid) {
		this.grid = grid;
	}

	public Integer getGuides() {
		return guides;
	}

	public void setGuides(Integer guides) {
		this.guides = guides;
	}

	public Integer getTooltips() {
		return tooltips;
	}

	public void setTooltips(Integer tooltips) {
		this.tooltips = tooltips;
	}

	public Integer getConnect() {
		return connect;
	}

	public void setConnect(Integer connect) {
		this.connect = connect;
	}

	public Integer getFold() {
		return fold;
	}

	public void setFold(Integer fold) {
		this.fold = fold;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageScale() {
		return pageScale;
	}

	public void setPageScale(Integer pageScale) {
		this.pageScale = pageScale;
	}

	public Integer getPageWidth() {
		return pageWidth;
	}

	public void setPageWidth(Integer pageWidth) {
		this.pageWidth = pageWidth;
	}

	public Integer getPageHeight() {
		return pageHeight;
	}

	public void setPageHeight(Integer pageHeight) {
		this.pageHeight = pageHeight;
	}

	public ArrayList<MxCellSCP> getMxCellList() {
		return mxCellList;
	}

	public void setMxCellList(ArrayList<MxCellSCP> mxCellList) {
		this.mxCellList = mxCellList;
	}


}
