package com.comany.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date date1 = new Date();
		Date date2 = new Date(1000);
		Date date3 = new Date(2018-1900,11,4,21,8,16);

		long i = date1.getTime();
		System.out.println(i);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义日期格式
		String str1 = d1.format(new Date());//把时间对象按照指定的日期格式转为字符串
		System.out.println(str1);
		
		DateFormat d2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		System.out.println(d2.format(new Date()));
		Date date4 = d1.parse("2111-4-11 15:11:12");
		System.out.println(date4);
	}


}
