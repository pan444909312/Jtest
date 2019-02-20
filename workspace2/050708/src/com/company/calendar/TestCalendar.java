package com.company.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		GregorianCalendar c1 = new GregorianCalendar(2121, 11, 12, 11, 11, 31);
		GregorianCalendar c2 = new GregorianCalendar();
		System.out.println(c1.getTime());
		System.out.println(c2.getTime());

	}
}
