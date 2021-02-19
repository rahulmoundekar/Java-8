package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 50; i++) {
			list.add(i);
		}

		System.out.println(list);

		for (Integer integer : list) {
			if (integer % 2 == 0)
				System.out.println(integer);
		}
		System.out.println("++++++++++++++++++++");
		list.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

		List<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Pooja");
		names.add("Abhay");
		names.add("Subhadha");
		names.add("Vrushali");
		names.add("Pranoti");
		names.add("Snehal");
		names.add("Bhushan");
		names.add("Ram");

		/*
		 * names.stream() .sorted().map(s -> s.toUpperCase())
		 * .collect(Collectors.toList()) .forEach(System.out::println);
		 */

		/*
		 * names.stream() .limit(3) .collect(Collectors.toList())
		 * .forEach(System.out::println);
		 */

		Stream<Integer> stream = Stream.of(3, 5, 7, 9);
		/*
		 * stream.distinct() .forEach(System.out::println); //avoid duplicate 
		 */

		// System.out.println(stream.count());
		Boolean result = stream.filter(i -> i % 2 == 0).findFirst().isPresent();
		System.out.println(result);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("V", 13);
		map.put("K", 155);
		map.put("Y", 177);
		map.put("Q", 10);

		Set<String> set = map.keySet();
		set.stream().sorted().forEach(System.out::println);
	}

}
