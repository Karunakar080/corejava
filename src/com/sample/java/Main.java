package com.sample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> al = Arrays.asList(
		   new Student(1,"AA"),
		   new Student(2,"BB"),
		   new Student(3,"Amar"),
		   new Student(4,"DD"),
		   new Student(5,"boy"),
		   new Student(4,"DD")
		   );
		
		   //System.out.println(al);
		   //output  A=AA,Amar,B=BB,boy have to group them
		/*
		 * List<Student> ll =al.stream().sorted().collect(Collectors.toList());
		 * System.out.println(ll);
		 */
		   
		   
		   Map<String, Long> count =al.stream()
				  .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

	        System.out.println(count);
		   
		 

	}

}
