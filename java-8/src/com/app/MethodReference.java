package com.app;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {

		Function<String, String> lambdaFunction = s -> s.toUpperCase();
		System.out.println(lambdaFunction.apply("abc"));

		Function<String, String> referenceFunction = String::toLowerCase;
		System.out.println(referenceFunction.apply("JAVA"));

		String str = "pqr";
		System.out.println(str.toUpperCase());

		Function<String, Integer> referenceFunction1 = Integer::parseInt;
		System.out.println(referenceFunction1.apply("12"));

		Employee e = new Employee();
		e.setName("Rahul");

		Supplier<String> supplier = e::getName;
		System.out.println(supplier.get());

	}

}
