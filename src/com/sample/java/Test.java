package com.sample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		
		/*
		 * List<Integer> list = Arrays.asList(1,3,5,1,4,6,8,3,8); // we can also use
		 * Function.identity() instead of c->c Map<Integer ,Long > map = list.stream()
		 * .collect( Collectors.groupingBy(c ->c , Collectors.counting()) ) ;
		 * 
		 * 
		 * map.forEach( (k , v ) -> System.out.println( k + " : "+ v ) );
		 */
		
		
		/*
		 * List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4); 
		 * Set<Integer> duplicatedNumbersRemovedSet = new HashSet<Integer>(); 
		 * Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n ->!duplicatedNumbersRemovedSet.add(n))
		 * .collect(Collectors.toSet());
		 * 
		 * 
		 * 
		 * System.out.println(duplicatedNumbersSet);
		 */
		// Removing array 2nd element
		
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   
		   System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		  // Remove the second element (index->1, value->14) of the array
		   int removeIndex = 1;

		   for(int i = removeIndex; i < my_array.length -1; i++){
		        my_array[i] = my_array[i + 1];
		      }
		// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
		    System.out.println("After removing the second element: "+Arrays.toString(my_array));
		
		}

}
