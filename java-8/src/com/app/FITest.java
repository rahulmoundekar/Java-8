package com.app;

public class FITest implements I {

	public static void one() {

	}

	@Override
	public void methodThree() {
		System.out.println("Method Three");
	}

	public static void main(String[] args) {
		I i = new FITest();
		i.methodOne();
		i.methodThree();

		FITest t = new FITest();
		t.one();
		one();

	}

}
