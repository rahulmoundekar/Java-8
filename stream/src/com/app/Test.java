package com.app;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		// without lambda
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream.forEach(System.out::println);

		System.out.println("--");
		// by using variable with lambda
		Stream<Integer> st = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		st.forEach(p -> System.out.println(p));
	}

}
