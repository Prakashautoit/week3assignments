package com.week3.day1.assessment;



public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		char[] namecharArray =test.toCharArray();
		for (int i = 0; i <= namecharArray.length-1; i++) {
					if(i%2!=0) {
			
			char result =namecharArray[i];
			String s =new String();
			String changedvalue = s.valueOf(result);
			System.out.print(changedvalue.toUpperCase());
			
		} else
		{
			
			System.out.print(namecharArray[i]);
		}
					
		}
		
	}
	
	
	

}
