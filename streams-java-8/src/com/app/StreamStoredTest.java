package com.app;

import java.util.stream.Stream;

public class StreamStoredTest {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("Amar", "Dinesh", "Tinesh", "Harshal", "Kunal", "Varun", "Pavan", "Abhishek");

		stream.filter(names -> names.startsWith("A")).sorted()
								.map(String::toUpperCase)
									.forEach(System.out::println);

		
	}

}
