package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);

		Stream<String> stream = Stream.of("Amar", "Dinesh", "Tinesh", "Harshal", "Kunal", "Varun", "Pavan", "Abhishek");
		List<String> indianNames=stream.collect(Collectors.toList());
		System.out.println(indianNames);
			
		String names = indianNames.stream().reduce("", (n1, n2) -> n1 + "-" + n2);

		System.out.println(names);
		
		
		
		

	}

}
