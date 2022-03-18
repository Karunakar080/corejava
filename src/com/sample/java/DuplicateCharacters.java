package com.sample.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	public static final void duplicateChars(String input) {
		 
        char []chInput = input.toCharArray();
        Set setDuplicated = new HashSet<>();
        Set distinctChars = new HashSet<>();
 
        for(char ch: chInput) {
            if(distinctChars.add(ch) == false)
                //if character is duplicated, then insert it into
                //duplicated set
                setDuplicated.add(ch);
        }
 
        //print duplicated characters
        System.out.print("Duplicate characters are: ");
        setDuplicated.forEach(ch -> System.out.print(ch + " "));
    }
 
    public static void main(String[] args) {
        String input = "karunakar";
        System.out.println("Input string is:"+input);
        duplicateChars(input);
 
        System.out.println("\n******************************");
        input = "LAKSHMIS";
        System.out.println("\nInput string is:"+input);
        duplicateChars(input);
    }
}


