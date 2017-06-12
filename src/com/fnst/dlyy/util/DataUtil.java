package com.fnst.dlyy.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DataUtil {
	private static String tip1 = "13:00:00";
	private static String tip1_pre = "12:00:00";
	private static String tip2 = "17:00:00";
	private static String tip2_pre = "16:00:00";
	private static String peak1 = "15:00:00";
	private static String peak1_pre = "14:00:00";
	private static String peak2 = "21:00:00";
	private static String peak2_pre = "20:00:00";
	private static String valley = "07:00:00";
	private static String valley_pre = "06:00:00";
	private static String normal1 = "18:00:00";
	private static String normal1_pre = "17:00:00";
	private static String normal2 = "23:00:00";
	private static String normal2_pre = "22:00:00";
	private static String dailyEnd = "24:00:00";
	private static String dailyEnd_pre = "23:00:00";
	
	private static String [] SummerMonth = {"07", "08"};
	
	public static String [] ElecType = {"valley","normal","peak","tip","dailyEnd"};
	
	String nowMonth = DataUtil.getMonthStr(new Date());
	
	public static String getTimeStr(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(date); 
		return str;
	}
	public static String getMonthStr(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("mm");
		String str=sdf.format(date); 
		return str;
	}
	
	public static String getSub(String nowData, String pastData) {
		return (Integer.parseInt(nowData) - Integer.parseInt(pastData) + "");
	}
	
	public static String getSum(String param1, String param2) {
		return (Integer.parseInt(param1) + Integer.parseInt(param2) + "");
	}
	
	public static String checkElecType() {
		String time = getTimeStr(new Date());
		boolean isSummerTime = checkSummerTime();
		
		if (isSummerTime) {
			//0:谷   1:平    2:峰     3:尖    4:谷
			if (time.compareTo(tip1_pre) > 0 && time.compareTo(tip1) < 0 || time.compareTo(tip2_pre) > 0 && time.compareTo(tip2) < 0) {
				return ElecType[0];
			} else if (time.compareTo(peak1_pre) > 0 && time.compareTo(peak1) < 0 || time.compareTo(peak2_pre) > 0 && time.compareTo(peak2) < 0) {
				return ElecType[1];
			} else if (time.compareTo(valley_pre) > 0 && time.compareTo(valley) < 0) {
				return ElecType[2];
			} else if (time.compareTo(normal1_pre) > 0 && time.compareTo(normal1) < 0 || time.compareTo(normal2_pre) > 0 && time.compareTo(normal2) < 0) {
				return ElecType[3];
			} else if (time.compareTo(dailyEnd_pre) > 0 && time.compareTo(dailyEnd) < 0) {
				return ElecType[4];
			} else {
				return null;
			}			
		} else {
			//0:谷   1:平    2:峰     3:尖    4:谷
			//非夏季，没有尖
			if (time.compareTo(peak1_pre) > 0 && time.compareTo(peak1) < 0 || time.compareTo(peak2_pre) > 0 && time.compareTo(peak2) < 0) {
				return ElecType[1];
			} else if (time.compareTo(valley_pre) > 0 && time.compareTo(valley) < 0) {
				return ElecType[2];
			} else if (time.compareTo(normal1_pre) > 0 && time.compareTo(normal1) < 0 || time.compareTo(normal2_pre) > 0 && time.compareTo(normal2) < 0) {
				return ElecType[3];
			} else if (time.compareTo(dailyEnd_pre) > 0 && time.compareTo(dailyEnd) < 0) {
				return ElecType[4];
			} else {
				return null;
			}			
		}
	}
	
	public static boolean checkSummerTime() {
		boolean isSummerTime = false;
		String month = getMonthStr(new Date());
		for (int i = 0; i < SummerMonth.length; i++) {
			if (SummerMonth[i].equals(month)) {
				isSummerTime = true;
				break;
			}
		}
		return isSummerTime;
	}
}
