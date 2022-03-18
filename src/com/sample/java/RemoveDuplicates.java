package com.sample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import com.sun.org.apache.xpath.internal.functions.Function;

public class RemoveDuplicates {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*List<Integer> arr =Arrays.asList(1,2,4,5,2,1,6,9);
		ArrayList dup=(ArrayList) arr.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dup);*/
	ArrayList<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "A", "B", "C"));

		// Get list without duplicates
		List<String> distinct = list.stream()
		                                    .distinct()
		                                    .collect(Collectors.toList());
		System.out.println(distinct);
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> duplicatedNumbersRemovedSet = new HashSet<Integer>();
		Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
		System.out.println(duplicatedNumbersSet);
		
		/*
		 * Map<Integer, Integer> map = list.stream()
		 * .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
		 * 
		 * 
		 * System.out.println(map);
		 * Student studentName,
 studentId;  

studentName = new Student(); 
 
Student stud_class = new Student();  

second highst sal

select sal from(select disncit sal from Emp orderBy sal desn)row<=1 orderBysal Asn from Emp;
		 */
		 
		
		
		  Stream<String> numberss = Stream.of("john", "doe", "doe", "tom", "john");
		  Set<String> items = new HashSet<String>();
		  
		  Set<String> duplicatedNumbers = ((Collection<String>) numberss).stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
		  System.out.println(duplicatedNumbers);
		 
        
        
	}

}
