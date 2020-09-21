package com.comparable.app;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(Employee emp) {
		/*if (this.age == emp.age)
			return 0;
		else if (this.age > emp.age)
			return 1;
		else
			return -1;*/
		
		return this.name.compareTo(emp.name);
		
	}

}
