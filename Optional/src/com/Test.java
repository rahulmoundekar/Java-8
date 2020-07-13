package com;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public Optional<String> concatStrings() {

		Optional<String> first = Optional.of("abc");
		Optional<String> second = Optional.of("pqr");
		return first;
	}

	public static void main(String[] args) {
		Test test = new Test();
		Optional<String> result = test.concatStrings();
		System.out.println(result.get());
	}

}
