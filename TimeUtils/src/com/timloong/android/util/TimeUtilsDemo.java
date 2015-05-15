package com.timloong.android.util;

import java.util.Date;

public class TimeUtilsDemo {

	public static void main(String[] args) {
		Date date = new Date();
		//1.datetoLong() Date对象获取时间戳
		System.out.println("当前时间戳:"+TimeUtils.datetoLong(date));
		//2.dateToString Date对象转为String
		System.out.println("当前日期:"+TimeUtils.dateToString(date, "yyyy-MM-dd"));;
		//3.dayCompute距离天数
		System.out.println("距离 "+TimeUtils.dayCompute(555555555));
		//4.longToString 时间戳转字符串
		System.out.println("当前日期:"+TimeUtils.longToString(555555555, "yyyy年MM月dd"));
		//5.时间转Date对象
		System.out.println("Date对象:"+TimeUtils.stringtoDate("yyyy年MM月dd", "2015年4月4日"));
		
	}
}
