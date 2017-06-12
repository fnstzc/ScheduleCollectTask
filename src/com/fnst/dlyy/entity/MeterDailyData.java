package com.fnst.dlyy.entity;

public class MeterDailyData { 
	private String metertype;
	private String metername;
	private String meternum;
	private String collecttime;
	private String meternum_tip;
	private String meternum_peak;
	private String meternum_valley;
	private String meternum_normal;
	private String dailyconsume;
	
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
	public String getDailyconsume() {
		return dailyconsume;
	}
	public void setDailyconsume(String dailyconsume) {
		this.dailyconsume = dailyconsume;
	}
	public String getMeternum_tip() {
		return meternum_tip;
	}
	public void setMeternum_tip(String meternum_tip) {
		this.meternum_tip = meternum_tip;
	}
	public String getMeternum_peak() {
		return meternum_peak;
	}
	public void setMeternum_peak(String meternum_peak) {
		this.meternum_peak = meternum_peak;
	}
	public String getMeternum_valley() {
		return meternum_valley;
	}
	public void setMeternum_valley(String meternum_valley) {
		this.meternum_valley = meternum_valley;
	}
	public String getMeternum_normal() {
		return meternum_normal;
	}
	public void setMeternum_normal(String meternum_normal) {
		this.meternum_normal = meternum_normal;
	}
}
