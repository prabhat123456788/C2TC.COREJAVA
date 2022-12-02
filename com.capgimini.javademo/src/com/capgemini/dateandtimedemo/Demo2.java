package com.capgemini.dateandtimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		System.out.println("Current Date is:"+date);
		
		
		
		
		
		LocalTime time=LocalTime.now();
		System.out.println("Current time is:"+time);
		
		
		LocalTime time1=time.minusHours(2);
		System.out.println("Older time is:"+time);
	}
}