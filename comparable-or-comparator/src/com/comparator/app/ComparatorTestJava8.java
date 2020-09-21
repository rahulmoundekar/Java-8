package com.comparator.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTestJava8 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(50, "Abhay", 28));
		students.add(new Student(2, "Pooja", 26));
		students.add(new Student(10, "Mukesh", 30));
		students.add(new Student(1, "Rahul", 28));
		students.add(new Student(5, "Manish", 23));

		students.stream().forEach(System.out::println);

		students.sort((Student o1, Student o2) -> o1.getAge() - o2.getAge());
		//students.sort(Comparator.naturalOrder());
		//students.sort(Comparator.comparing(Student::getName).reversed());
		
		//students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));

		System.out.println("_____________________");

		students.stream().forEach(System.out::println);

	}

}
