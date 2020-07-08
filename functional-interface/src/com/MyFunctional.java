package com;

@FunctionalInterface
public interface MyFunctional {

	public void add();

	public default void sub() {
		System.out.println("subtraction");
	}

}
