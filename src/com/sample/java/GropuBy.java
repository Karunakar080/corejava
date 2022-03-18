package com.sample.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;



public class GropuBy {
	 /* Driver Code */  
    public static void main(String args[]) throws IOException   
    {  
        List<Employee> emp = new ArrayList<Employee>();  
        emp.add(new Employee("Dipak", "Delhi", 21));  
        emp.add(new Employee("Sumit", "Delhi", 21));  
        emp.add(new Employee("Karan", "Delhi", 23));  
        emp.add(new Employee("Mona", "Udaipur", 23));  
        emp.add(new Employee("Rajesh", "Banglore", 23));  
        emp.add(new Employee("Niraj", "Banglore", 31));          
        /* Group by Employees by city before Java 8 world */         
        Map<String,List<Employee>> EmpByCity = new HashMap<String,List<Employee>>();  
          
        for(Employee p : emp)  
        {  
            if(!EmpByCity.containsKey(p.getCity()))  
            {  
                EmpByCity.put(p.getCity(), new ArrayList<Employee>());                  
            }  
            EmpByCity.get(p.getCity()).add(p);  
        }  
        System.out.println("Employees grouped by cities before Java 8 : " + EmpByCity);        
        /* group objects of Employee class in Java 8 */  
        EmpByCity =  emp.stream().collect(Collectors.groupingBy(Employee::getCity));  
        System.out.println("Employees grouped by cities in Java 8: " + EmpByCity);  
        /* group Employees by age */  
        Map<Integer,List<Employee>> EmpByAge = emp.stream().collect(Collectors.groupingBy(Employee::getAge));  
        System.out.println("Employees grouped by age in Java 8: " + EmpByAge);  
    }  
}
