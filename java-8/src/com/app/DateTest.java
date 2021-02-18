package com.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());

	}

}
