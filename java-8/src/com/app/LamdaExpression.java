package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpression {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Z");
		list.add("B");
		list.add("J");
		list.add("C");
		list.add("Y");
		list.add("A");

		Stream<String> stream = list.stream();

//		stream.forEach(System.out::println);

		//System.out.println(stream.count());

		/*
		 * for (String string : list) { System.out.println(string); }
		 */

		/*
		 * list.forEach(s -> { if (s.contains("abc")) System.out.println(s); });
		 */

	}

}
