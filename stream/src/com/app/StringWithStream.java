package com.app;

import java.util.stream.Stream;

public class StringWithStream {

	public static void main(String[] args) {

		/*Stream<String> stream = Stream.of("A$B$C".split("\\$"));
		stream.forEach(p -> System.out.print(p));*/

		String str = "Hello World";

		Stream.concat(Stream.of(str), Stream.of("abc")).forEach(output -> System.out.println(output));

	}

}
