package com.app;

import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {

		Stream<Integer> firstStream = Stream.of(1, 2, 3);
		Stream<Integer> secondStream = Stream.of(4, 5, 6, 1);

		Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream); //.district();
		resultingStream.forEach(p -> System.out.print(p + " "));

	}

}
