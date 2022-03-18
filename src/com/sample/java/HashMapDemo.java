package com.sample.java;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
	 public static void main(String args[])
	    {
	        // No need to mention the
	        // Generic type twice
	        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
	 
	        // Initialization of a HashMap
	        // using Generics
	        HashMap<Integer, String> hm2
	            = new HashMap<Integer, String>();
	 
	        // Add Elements using put method
	        hm1.put(1, "Geeks");
	        hm1.put(2, "For");
	        hm1.put(3, "Geeks");
	        hm1.put(4, "for");
	        hm2.put(1, "Geeks");
	        hm2.put(2, "For");
	        hm2.put(3, "Geeks");
	 
	        System.out.println("Mappings of HashMap hm1 are : "
	                           + hm1);
	        System.out.println("Mapping of HashMap hm2 are : "
	                           + hm2);
	        
	       // System.out.println("TREEMAP-----------");
		/*
		 * TreeMap tm1 = new TreeMap(); tm1.putAll( "one"); tm1.put( "two"); tm1.put(
		 * "three"); tm1.put("two"); System.out.println("Mappings of TreeMap tm1 are : "
		 * + tm1);
		 */
	    }

}
