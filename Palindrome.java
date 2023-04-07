package com.week3.day1.assessment;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String name1 = "madam";	
		char[] name1array = name1.toCharArray();
		String name2 = "";	
		
		for (int i=name1array.length-1;i>=0; i--) {
			
			name2 =name1array[i]+name2;
			
			
		}
		if(name1.equals(name2)) {
			
			System.out.println("\n" +"Given String is a Plaindrome");
		}
		
		else
		{
			
			System.out.println("\n" +"Given String is not a palindrome");
		}
					
		
		

	}
}


