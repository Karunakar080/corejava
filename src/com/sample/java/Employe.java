package com.sample.java;

public class Employe {
	private String name;
	private int age;
	public Employe(int age, String name) {
	super();
	this.name = name;
	this.age = age;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String toString()
	{
	return "Employee Name: "+name+" age: "+age;
	}


	/*
	 * List<Employe> list=emp.stream().filter(a->a.age>20).map(emp->emp.getAge).
	 * collect(collectors.toList()); 
	 * System.out.println(list);
	 */
}
