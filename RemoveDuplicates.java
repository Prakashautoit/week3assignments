package com.week3.day2.assessment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String name = "PayPal India";
		char[] namearray = name.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupcharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < namearray.length; i++) {
			charSet.add(namearray[i]);
			for (int j = 1; j < namearray.length; j++) {

				if (namearray[j] == namearray[i]) {
					
					
					dupcharSet.add(namearray[j]);

				}

			}
			if (charSet.equals(dupcharSet)) {

				charSet.remove(dupcharSet);

			}

		}

		// System.out.println(charSet);

		for (Character each : charSet) {
			
			
		}

		System.out.println(charSet);
		
		//Not working

	}

}
