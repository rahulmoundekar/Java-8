package com.app;

@FunctionalInterface
public interface I {

	public void methodThree();

	default void methodOne() {
		System.out.println("Mthod One");
	}

	static void methodTwo() {
		System.out.println("Method Two");
	}

}
