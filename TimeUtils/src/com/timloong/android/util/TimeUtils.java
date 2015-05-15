package com.timloong.android.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 日期转换工具
 * 
 * @author timloong@foxmail.com
 *
 */
public class TimeUtils {

	/**
	 * 长整型 时间戳 转 字符串
	 * @param longNum 时间戳, long型数据
	 * @param dateFormat 日期格式 ,字符串数据,如传入为null则默认为"yyyy年MM月dd日HH:mm:ss"
	 * @return 时间戳对应的字符串
	 * @author timloong@foxmail.com
	 */
	public static String longToString(long longNum,String dateFormat){
		//判断日期格式,为空则默认定义
		if (dateFormat==null) {
			dateFormat = "yyyy年MM月dd日HH:mm:ss";
		}
		//根据格式创建格式转换对象
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		//根据时间戳得到日期对象
		Date date = new Date(longNum);
		//将日期传入格式转换对象进行格式化,并返回
		return format.format(date);
	}
	
	/**
	 * 
	 * @param date ,Date对象,为null则获取系统当前日期.
	 * @param dateFormat 日期格式,为null则默认为"yyyy年MM月dd日HH:mm:ss".
	 * @return 返回 Date 日期对象对应的字符串
	 */
	public static String  dateToString(Date date,String dateFormat){
		//传入Date对象为null则默认获取系统当前时间
		if (date==null) {
			date = new Date();
		}
		//传入格式 为null则默认为"yyyy年MM月dd日HH:mm:ss"
		if (dateFormat==null) {
			dateFormat = "yyyy年MM月dd日HH:mm:ss";
		}
			
		//根据日期格式,创建日期格式转换工具
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);

		//返回 Date对应的字符串
		return format.format(date);
	} 
	
	
	/**
	 * Date日期对象转换为时间戳.
	 * @param date ,Date日期对象.
	 * @return Date对象对应的时间戳.
	 */
	public static long datetoLong(Date date){
		//Date对象为null则获取系统当前Date
		if (date==null) {
			date = new Date();
		}
		//返回Date对象对应的时间戳
		return  date.getTime();
	}
	
	
	
	/**
	 * 时间字符串解析为Date对象
	 * @param dateFormat 与字符串对应的格式 ,如 "yyyy年MM月dd日HH:mm:ss",可增删某段,或者修改汉字占位符
	 * @param timeString 时间字符串
	 * @return Date对象
	 */
	public static Date stringtoDate(String dateFormat ,String timeString){
		//时间字符串不为null则转换
		if (timeString!=null) {
			//时间转换工具
			SimpleDateFormat  format = new SimpleDateFormat(dateFormat);
			try {
				//解析时间字符串并返回
				return format.parse(timeString);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 距离现在时刻天数计算
	 * @param time 原始时刻时间戳
	 * @return 天数
	 */
	public static int  dayCompute(long time){
		//获取系统现在时间
		Date date = new Date();
		//获取系统时间对应的时间戳
		long time2 = date.getTime();
		//返回距离天数
		return (int) ((time2-time)/(1000*60*60*24));
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(dayCompute(445555555)+"天");;
	}
}
