package com.fnst.dlyy.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.ibatis.javassist.expr.NewArray;

import com.fnst.dlyy.entity.MeterInitialData;
import com.fnst.dlyy.service.MeterDataManager;
import com.fnst.dlyy.util.DataUtil;

public class ScheduleTask {
	
	private static final String PRE_SUFF = "test_";
	private static final int METER_NUM_BLOCK = 20;
	private MeterDataManager meterDataManager = new MeterDataManager();
	private static int temp = 1;
	private static Date date = new Date();
	
	public void execute() {
		Runnable insertDataToDBRun = new Runnable() {
			public void run() {
System.out.println("add initial data run !!!");
				Date dateCreated = createDate(date);
				String collectTime = DataUtil.getTimeStr(dateCreated);
				MeterInitialData meterInitialData = new MeterInitialData();
				List<String> meterNameList = meterDataManager.getMeterNameList();

				List<String> meterNames = new ArrayList<String>();
				for (int i = 0; i < 5; i++) {
					meterNames.add(meterNameList.get(i));
				}
				for (String meterName : meterNames) {
					meterInitialData.setMetername(meterName);
					meterInitialData.setMeternum((METER_NUM_BLOCK*temp)+"");
					//设置表计类型自动遍历
					meterInitialData.setMetertype("电表");
					meterInitialData.setCollecttime(collectTime);
					meterDataManager.addMeterInitialData(meterInitialData);
				}
System.out.println(meterNameList.get(0)+"__"+(METER_NUM_BLOCK*temp)+"__"+collectTime);
				temp++;
			}
		};
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	    // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间  
	    service.scheduleAtFixedRate(insertDataToDBRun, 0, 30, TimeUnit.SECONDS);
	}
	
	protected Date createDate(Date date) {
		int hours = date.getHours();
		date.setHours(hours+1);
		return date;
	}

	public String createMeterName(int num) {
		StringBuilder sb = new StringBuilder();
		sb.append(PRE_SUFF).append(num);
		return sb.toString();
	}
}
