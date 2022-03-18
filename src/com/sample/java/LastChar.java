package com.sample.java;

import java.util.Stack;

public class LastChar {
	public String lastTwo(String str)
	{
	if (str.length() < 6) return str;
	//if (str.length() < 2) return str;
		//for (int i = 0; i < str.length(); i++) {}
			 
	return str.substring(0, str.length()-6)+ str.charAt(str.length()-1)+ str.charAt(str.length()-2)+str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3);
	//return str.substring(0, str.length()-6)+ str.charAt(str.length()-1) + str.charAt(str.length()-2) + str.charAt(str.length()-3)+str.charAt(str.length()-4)+str.charAt(str.length()-5)+str.charAt(str.length()-6);
	//return str.substring(0, str.length()-2)+ str.charAt(str.length()-1) + str.charAt(str.length()-2);
	
	}
	    public static void main (String[] args)
	    {
	    	LastChar m= new LastChar();
	      String str1 =  "string";
	      System.out.println("The given strings is: "+str1);
	      //System.out.println("The string after swap last two characters are: "+m.lastTwo(str1));
	      //System.out.println("The string after swap last two characters are: "+m.lastTwo(str1)+str1.charAt(0)+str1.charAt(1)+str1.charAt(2)+str1.charAt(3)+str1.charAt(4));
	      System.out.println("The string after swap last two characters are: "+m.lastTwo(str1));
	    }
}