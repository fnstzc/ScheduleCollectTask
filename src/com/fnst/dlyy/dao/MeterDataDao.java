package com.fnst.dlyy.dao;

import java.util.List;
import com.fnst.dlyy.entity.MeterInitialData;

public interface MeterDataDao {
	public void addMeterInitialData(MeterInitialData meterInitialData);
	public List<String> getMeterNameList();
}
