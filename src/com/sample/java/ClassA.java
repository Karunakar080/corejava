package com.sample.java;

import java.util.HashSet;
import java.util.TreeSet;

public class ClassA  {
	/*
	 * extends Thread implements Runnable{ public void run() {
	 * System.out.println("xyz"); } public static void main(String[] args) throws
	 * InterruptedException { Hello obj= new Hello(); obj.run(); obj.start();
	 * 
	 * }
	 */
	/*
	 * int id; Hello(int i){ id=i; } public static void main(String[] args) {
	 * 
	 * String x= null; giveMeAString(x); System.out.println(x); } static void
	 * giveMeAString(String y) { y= "Hello";
	 * 
	 * 
	 * new Hello(3).go(); } void go() { Hello h= new Hello(1); Hello h1= new
	 * Hello(2); System.out.println(h.id+ " "+h1.id); }
	 */
	/*
	 * public class Hai{ public static String sing() { return "la"; } }
	 */
	
	/*
	 * public enum Days{Mon,TUE,WED} public static void main(String[] args) {
	 * for(Days d :Days.values()); Days [] d2=Days.values();
	 * System.out.println(d2[2]); }
	 */
	/*
	 * public void run() { System.out.println("GFG"); } public static void
	 * main(String[] args)throws InterruptedException { Thread th1= new Thread(new
	 * ClassA()); th1.start(); th1.start(); System.out.println(th1.getState());
	 * 
	 * }
	 */
	public static void main(String[] args) {
		TreeSet<String> ts =new TreeSet<>();
		 ts.add("Geeks");
		 ts.add("for");
		 ts.add("Geeks");
		 ts.add("GeeksforGeeks");
		 for(String temp: ts) {
			 System.out.printf(temp+ "");
			 System.out.println("\n");
			 
			 String[] array = new String[100];
			 System.out.println(array[1]);
			 System.out.println(array[2]);
		 }
	}
	
}

