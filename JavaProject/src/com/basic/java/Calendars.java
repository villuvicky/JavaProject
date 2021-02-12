package com.basic.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class Calendars {

	public static void main(String[] args) {
		
		Calendar calendar =Calendar.getInstance();
		DateFormat format = new SimpleDateFormat();
		
		System.out.println(format.format(calendar.getTime()));
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		System.out.println(calendar.get(Calendar.AM_PM));  // 1 is PM and 0 is AM
		
		TimeZone zone = TimeZone.getDefault();
		System.out.println(zone.getDisplayName());
		
		ZoneId z = ZoneId.of( "America/Montreal" ) ;  
		TimeZone zone2 = TimeZone.getTimeZone(z);
		
		
		System.out.println(zone2);
	}

}
