package com.fnst.dlyy.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.fnst.dlyy.entity.MeterInitialData;
import com.fnst.dlyy.util.MybatisUtil;

public class MeterDataDaoImpl implements MeterDataDao{

	public void addMeterInitialData(MeterInitialData meterInitialData) {
		SqlSession session = MybatisUtil.getSqlSession();
		MeterDataDao meterDataDao = session.getMapper(MeterDataDao.class);
		meterDataDao.addMeterInitialData(meterInitialData);
		session.commit();
		session.close();
	}

	public List<String> getMeterNameList() {
		SqlSession session = MybatisUtil.getSqlSession();
		MeterDataDao meterDataDao = session.getMapper(MeterDataDao.class);
		List<String> meterNameList = meterDataDao.getMeterNameList();
		session.close();
		System.out.println("-----------------get meter name list success!");
		return meterNameList;
	}
}
