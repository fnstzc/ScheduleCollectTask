package com.fnst.dlyy.service;

import java.util.List;

import com.fnst.dlyy.dao.MeterDataDaoImpl;
import com.fnst.dlyy.entity.MeterDailyData;
import com.fnst.dlyy.entity.MeterInitialData;
import com.fnst.dlyy.entity.MeterMonthData;
import com.fnst.dlyy.entity.MeterNowData;
import com.fnst.dlyy.util.DataUtil;

public class MeterDataManager {
	
	private MeterDataDaoImpl meterDataDaoImpl = new MeterDataDaoImpl();
	
	public void addMeterInitialData(MeterInitialData meterInitialData) {
		meterDataDaoImpl.addMeterInitialData(meterInitialData);
	}
	
	public List<String> getMeterNameList() {
		return meterDataDaoImpl.getMeterNameList();
	}
}
