package com.app;

import java.util.Random;
import java.util.stream.Stream;

public class LimitStream {

	public static void main(String[] args) {

		Stream<Integer> randomNum=Stream.generate(()-> (new Random()).nextInt(100));
		
		randomNum.limit(50).forEach(System.out::println);
		
	}

}
