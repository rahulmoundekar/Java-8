package com;

import java.time.LocalDate;

public class StringToDate {

	public static void main(String[] args) {

		String stringDate = "2016-04-04";

		LocalDate convertedDate = LocalDate.parse(stringDate);
		System.out.println("Date: " + convertedDate);

	}

}
