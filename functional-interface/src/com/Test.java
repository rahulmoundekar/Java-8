package com;

public class Test implements MyFunctional, SecondFunctional {

	public static void main(String[] args) {
		Test t = new Test();
		t.add();
		t.sub();
	}

	@Override
	public void add() {
		System.out.println("addition");

	}

	@Override
	public void sub() {
		MyFunctional.super.sub();
		SecondFunctional.super.sub();
	}

}
