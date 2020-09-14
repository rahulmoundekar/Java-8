package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEvenNumber {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(8);

		// list.forEach(n -> { if (n%2 == 0) System.out.println(n); });

		Stream<Integer> stm = list.stream();
		List<Integer> evenNumList = stm.filter(num -> num % 2 == 0)
											.collect(Collectors.toList());
		evenNumList.forEach(System.out::println);

	}

}
