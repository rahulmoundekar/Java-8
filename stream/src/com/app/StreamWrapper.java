package com.app;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamWrapper {
	public static void main(String[] args) {

		List<Integer> list = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).boxed().collect(Collectors.toList());

		list.stream().forEach(System.out::println);

	}

}
