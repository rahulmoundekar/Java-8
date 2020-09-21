package com.comparator.app;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(50, "Abhay", 28));
		students.add(new Student(2, "Pooja", 26));
		students.add(new Student(10, "Mukesh", 30));
		students.add(new Student(1, "Rahul", 28));
		students.add(new Student(5, "Manish", 23));

		for (Student student : students) {
			System.out.println(student);
		}

		Collections.sort(students, new AgeWiseSorting());
		System.out.println("_____________________");

		for (Student student : students) {
			System.out.println(student);
		}

		Collections.sort(students, new NameWiseSorting());
		System.out.println("_____________________");

		for (Student student : students) {
			System.out.println(student);
		}

	}

}
