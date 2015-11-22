package com.bng.xmlparser.marshal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "mxParams")
@XmlAccessorType(XmlAccessType.FIELD)
public class MxParamsCoreEngine {

	@XmlAttribute(name = "dateformatter")
	private String dateformatter;

	@XmlAttribute(name = "shortcode")
	private String shortcode;

	@XmlAttribute(name = "service")
	private String service;

	@XmlAttribute(name = "previousdtmf")
	private String previousdtmf;

	@XmlAttribute(name = "nextdtmf")
	private String nextdtmf;

	@XmlAttribute(name = "promptfile")
	private String promptfile;

	@XmlAttribute(name = "playcontent")
	private String playcontent;

	@XmlAttribute(name = "processing")
	private String processing;

	@XmlAttribute(name = "checkdb")
	private String checkdb;

	@XmlAttribute(name = "calltype")
	private String calltype;

	@XmlAttribute(name = "startoverdtmf")
	private String startoverdtmf;

	@XmlAttribute(name = "url")
	private String url;
	
	@XmlAttribute(name = "urltype")
	private String urltype;

	@XmlAttribute(name = "addtofavdtmf")
	private String addtofavdtmf;

	@XmlAttribute(name = "setlanguage")
	private String setlanguage;

	@XmlAttribute(name = "defaultlang")
	private String defaultlang;

	@XmlAttribute(name = "method")
	private String method;

	@XmlAttribute(name = "patch")
	private String patch;

	@XmlAttribute(name = "contentlist")
	private String contentlist;

	@XmlAttribute(name = "stoprecord")
	private String stoprecord;

	@XmlAttribute(name = "sleep")
	private String sleep;

	@XmlAttribute(name = "cli")
	private String cli;

	@XmlAttribute(name = "dialout")
	private String dialout;

	@XmlAttribute(name = "recording")
	private String recording;

	@XmlAttribute(name = "setvoiceeffect")
	private String setvoiceeffect;

	@XmlAttribute(name = "repeatcount")
	private String repeatcount;

	@XmlAttribute(name = "repeatcurrent")
	private String repeatcurrent;

	@XmlAttribute(name = "setbackground")
	private String setbackground;

	@XmlAttribute(name = "minlen")
	private String minlen;

	@XmlAttribute(name = "maxlen")
	private String maxlen;

	@XmlAttribute(name = "exittimer")
	private String exittimer;

	@XmlAttribute(name = "timeout")
	private String timeout;

	@XmlAttribute(name = "seekdtmf")
	private String seekdtmf;

	@XmlAttribute(name = "autoanswer")
	private String autoanswer;

	@XmlAttribute(name = "randomplay")
	private String randomplay;

	@XmlAttribute(name = "seek")
	private String seek;

	@XmlAttribute(name = "bargein")
	private String bargein;

	@XmlAttribute(name = "type")
	private String type;

	@XmlAttribute(name = "cutonringing")
	private String cutonringing;

	@XmlAttribute(name = "resourceurl")
	private String resourceurl;

	@XmlAttribute(name = "confirmlist")
	private String confirmlist;

	@XmlAttribute(name = "terminationchar")
	private String terminationchar;

	@XmlAttribute(name = "confirmation")
	private String confirmation;

	@XmlAttribute(name = "digittype")
	private String digittype;

	@XmlAttribute(name = "exit")
	private String exit;
	
	@XmlAttribute(name = "value")
	private String value;
	
	@XmlAttribute(name = "timertype")
	private String timertype;

	@XmlAttribute(name = "startfrom")
	private String startfrom;
	
	@XmlAttribute(name = "timervalue")
	private String timervalue;
	
	public String getDateformatter() {
		return dateformatter;
	}

	public void setDateformatter(String dateformatter) {
		this.dateformatter = dateformatter;
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPreviousdtmf() {
		return previousdtmf;
	}

	public void setPreviousdtmf(String previousdtmf) {
		this.previousdtmf = previousdtmf;
	}

	public String getNextdtmf() {
		return nextdtmf;
	}

	public void setNextdtmf(String nextdtmf) {
		this.nextdtmf = nextdtmf;
	}

	public String getPromptfile() {
		return promptfile;
	}

	public void setPromptfile(String promptfile) {
		this.promptfile = promptfile;
	}

	public String getPlaycontent() {
		return playcontent;
	}

	public void setPlaycontent(String playcontent) {
		this.playcontent = playcontent;
	}

	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getCheckdb() {
		return checkdb;
	}

	public void setCheckdb(String checkdb) {
		this.checkdb = checkdb;
	}

	public String getCalltype() {
		return calltype;
	}

	public void setCalltype(String calltype) {
		this.calltype = calltype;
	}

	public String getStartoverdtmf() {
		return startoverdtmf;
	}

	public void setStartoverdtmf(String startoverdtmf) {
		this.startoverdtmf = startoverdtmf;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrltype() {
		return urltype;
	}

	public void setUrltype(String urltype) {
		this.urltype = urltype;
	}

	public String getAddtofavdtmf() {
		return addtofavdtmf;
	}

	public void setAddtofavdtmf(String addtofavdtmf) {
		this.addtofavdtmf = addtofavdtmf;
	}

	public String getSetlanguage() {
		return setlanguage;
	}

	public void setSetlanguage(String setlanguage) {
		this.setlanguage = setlanguage;
	}

	public String getDefaultlang() {
		return defaultlang;
	}

	public void setDefaultlang(String defaultlang) {
		this.defaultlang = defaultlang;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPatch() {
		return patch;
	}

	public void setPatch(String patch) {
		this.patch = patch;
	}

	public String getContentlist() {
		return contentlist;
	}

	public void setContentlist(String contentlist) {
		this.contentlist = contentlist;
	}

	public String getStoprecord() {
		return stoprecord;
	}

	public void setStoprecord(String stoprecord) {
		this.stoprecord = stoprecord;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public String getCli() {
		return cli;
	}

	public void setCli(String cli) {
		this.cli = cli;
	}

	public String getDialout() {
		return dialout;
	}

	public void setDialout(String dialout) {
		this.dialout = dialout;
	}

	public String getRecording() {
		return recording;
	}

	public void setRecording(String recording) {
		this.recording = recording;
	}

	public String getSetvoiceeffect() {
		return setvoiceeffect;
	}

	public void setSetvoiceeffect(String setvoiceeffect) {
		this.setvoiceeffect = setvoiceeffect;
	}

	public String getRepeatcount() {
		return repeatcount;
	}

	public void setRepeatcount(String repeatcount) {
		this.repeatcount = repeatcount;
	}

	public String getRepeatcurrent() {
		return repeatcurrent;
	}

	public void setRepeatcurrent(String repeatcurrent) {
		this.repeatcurrent = repeatcurrent;
	}

	public String getSetbackground() {
		return setbackground;
	}

	public void setSetbackground(String setbackground) {
		this.setbackground = setbackground;
	}

	public String getMinlen() {
		return minlen;
	}

	public void setMinlen(String minlen) {
		this.minlen = minlen;
	}

	public String getMaxlen() {
		return maxlen;
	}

	public void setMaxlen(String maxlen) {
		this.maxlen = maxlen;
	}

	public String getExittimer() {
		return exittimer;
	}

	public void setExittimer(String exittimer) {
		this.exittimer = exittimer;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getSeekdtmf() {
		return seekdtmf;
	}

	public void setSeekdtmf(String seekdtmf) {
		this.seekdtmf = seekdtmf;
	}

	public String getAutoanswer() {
		return autoanswer;
	}

	public void setAutoanswer(String autoanswer) {
		this.autoanswer = autoanswer;
	}

	public String getRandomplay() {
		return randomplay;
	}

	public void setRandomplay(String randomplay) {
		this.randomplay = randomplay;
	}

	public String getSeek() {
		return seek;
	}

	public void setSeek(String seek) {
		this.seek = seek;
	}

	public String getBargein() {
		return bargein;
	}

	public void setBargein(String bargein) {
		this.bargein = bargein;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCutonringing() {
		return cutonringing;
	}

	public void setCutonringing(String cutonringing) {
		this.cutonringing = cutonringing;
	}

	public String getResourceurl() {
		return resourceurl;
	}

	public void setResourceurl(String resourceurl) {
		this.resourceurl = resourceurl;
	}

	public String getConfirmlist() {
		return confirmlist;
	}

	public void setConfirmlist(String confirmlist) {
		this.confirmlist = confirmlist;
	}

	public String getTerminationchar() {
		return terminationchar;
	}

	public void setTerminationchar(String terminationchar) {
		this.terminationchar = terminationchar;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getDigittype() {
		return digittype;
	}

	public void setDigittype(String digittype) {
		this.digittype = digittype;
	}

	public String getExit() {
		return exit;
	}

	public void setExit(String exit) {
		this.exit = exit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTimertype() {
		return timertype;
	}

	public void setTimertype(String timertype) {
		this.timertype = timertype;
	}

	public String getStartfrom() {
		return startfrom;
	}

	public void setStartfrom(String startfrom) {
		this.startfrom = startfrom;
	}

	public String getTimervalue() {
		return timervalue;
	}

	public void setTimervalue(String timervalue) {
		this.timervalue = timervalue;
	}
	
	
}
