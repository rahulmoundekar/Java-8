package com.comparator.app;

import java.util.Comparator;

public class NameWiseSorting implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}
