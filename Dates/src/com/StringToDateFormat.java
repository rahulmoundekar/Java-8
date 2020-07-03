package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateFormat {

	public static void main(String[] args) {

		String stringDate = "2016-04-04";

		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-M-dd");
		LocalDate convertedDate = LocalDate.parse(stringDate, df);
		System.out.println("Date: " + convertedDate);

	}

}
