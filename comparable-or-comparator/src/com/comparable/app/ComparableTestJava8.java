package com.comparable.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ComparableTestJava8 {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(50, "Abhay", 28));
		employees.add(new Employee(2, "Pooja", 26));
		employees.add(new Employee(10, "Mukesh", 30));
		employees.add(new Employee(1, "Rahul", 28));
		employees.add(new Employee(5, "Manish", 23));
		
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		Collections.sort(employees);
		System.out.println("_____________________");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
