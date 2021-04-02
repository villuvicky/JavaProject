package com.basic.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();

		System.out.println("Timestamp is "+date.getTime());

		System.out.println(date.toString()); // to get Wed Feb 10 20:05:35 IST 2021

		String dateToStr = DateFormat.getInstance().format(date); 

		System.out.println("Formatted Date String: "+ dateToStr); 

		SimpleDateFormat format = new SimpleDateFormat("d/M/y hh:mm:ss"); //hh is to print 12 hours format
		System.out.println(format.format(date));

		SimpleDateFormat format_2 = new SimpleDateFormat("yyyy/MM/dd"); // HH is to print 24 hours format
		System.out.println(format_2.format(date));
		
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println(calendar.getTimeInMillis());
		
		long time=System.currentTimeMillis();
		String timestamps= String.valueOf(time);
		SimpleDateFormat formats = new SimpleDateFormat("yyyy/MM/dd");
		String dates=formats.format(date);
		String final_date=dates.replaceAll("/", "_");
		String TimeStamp=final_date+"_"+timestamps;
		System.out.println(TimeStamp);
	}

}
