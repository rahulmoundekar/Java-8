package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("A", "D", "T", "H", "K", "W", "P");

		// stream.forEach(System.out::println);
		stream.forEach(p -> System.out.println(p));

		Stream streams = Stream.of("A", "D", 1, "T", "H", 10, "K", "W", "P", 56);
		streams.forEach(System.out::println);
		
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(15);
		list.add(29);
		list.add(63);
		list.add(78);
		
		Stream<Integer> stm=list.stream();
		stm.forEach(System.out::println);
		
		list.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
