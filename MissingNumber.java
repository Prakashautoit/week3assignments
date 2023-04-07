package com.week3.day2.assessment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = { 1,2,2,3,4,5,5,6,8,8,9,9,10 };
		Set<Integer> finalset =new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			finalset.add(data[i]);
		}
       System.out.println(finalset);
       
       List<Integer> test =new ArrayList<Integer>(finalset);
       int size = test.size();
       System.out.println(size);
       for (int j = 0; j < size; j++) {
    	  Object obj = test.get(j);
    	 //no Output
    	   
    	   	
    	  
	}
       
      
       
	}

}
