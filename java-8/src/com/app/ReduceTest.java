package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Pooja");
		names.add("Abhay");
		names.add("Subhadha");
		names.add("Vrushali");
		names.add("Pranoti");
		names.add("Snehal");
		names.add("Bhushan");
		names.add("Ram");
		
		
		Optional<String> s=names.stream().reduce((str1, str2)-> str1 + "-" + str2);
		
		if(s.isPresent())
			System.out.println(s);
		
		
	}

}
