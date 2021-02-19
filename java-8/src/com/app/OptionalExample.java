package com.app;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		String nullName = null;

		Optional<String> os = Optional.ofNullable(nullName);
		
		System.out.println(os.isPresent());
		System.out.println(os.of("abc").toString());

	}

}
