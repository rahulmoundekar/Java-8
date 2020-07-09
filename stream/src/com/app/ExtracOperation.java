package com.app;

import java.util.ArrayList;
import java.util.List;

public class ExtracOperation {
	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// memberNames.stream().filter(s ->
		// s.startsWith("L")).map(String::toUpperCase).forEach(System.out::println);

		// memberNames.stream().sorted().forEach(System.out::println);

		System.out.println(memberNames.stream().count());

		Long count = memberNames.stream().filter(s -> s.startsWith("L")).count();
		System.out.println(count);
	}

}
