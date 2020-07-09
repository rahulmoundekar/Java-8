package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListWithStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("pqr");
		list.add("xyz");

		Stream<String> stream = list.stream();
		stream.forEach(p -> System.out.println(p));

	}

}
