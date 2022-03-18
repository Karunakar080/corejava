package com.sample.java;


import java.util.Arrays;


public class DuplicateNumber {
	public static void main(String[] args) {
        int element = Integer.MIN_VALUE, max_count=1, count=1;
        
        //intial array
        int arr[] = {2, 4, 6, 4, 2, 4, 5, 8,12,22,18,6,12,6,6,6};
        
        //sort array in the ascending Order
        Arrays.sort(arr);
        
        //loop through the array elements
        for(int i=1; i<arr.length; i++){
            //count the successive elements as long as they are same
            if(arr[i] == arr[i-1])
                count++;
                
            if(arr[i] != arr[i-1] || i==arr.length-1){
                //compare the count with max_count
                if(count>max_count){
                    
                    //update if count is greater
                    max_count = count;
                    element = arr[i-1];
                } 
                //reset count to 1
                count =1;
            }
        }
        
        //output the most repeated element along with the count
        System.out.println(element+": "+max_count);    
    }
}
