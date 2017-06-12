package com.fnst.dlyy.entity;

public class MeterNowData {
	private String metertype;
	private String metername;
	private String meternum;
	private String collecttime;
	
	public String getMetertype() {
		return metertype;
	}
	public void setMetertype(String metertype) {
		this.metertype = metertype;
	}
	public String getMetername() {
		return metername;
	}
	public void setMetername(String metername) {
		this.metername = metername;
	}
	public String getMeternum() {
		return meternum;
	}
	public void setMeternum(String meternum) {
		this.meternum = meternum;
	}
	public String getCollecttime() {
		return collecttime;
	}
	public void setCollecttime(String collecttime) {
		this.collecttime = collecttime;
	}
	@Override
	public String toString() {
		return "MeterNowData [metertype=" + metertype + ", metername="
				+ metername + ", meternum=" + meternum + ", collecttime="
				+ collecttime + "]";
	}
}
