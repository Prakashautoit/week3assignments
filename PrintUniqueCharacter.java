package com.week3.day2.assessment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "babu";
		char[] namearray = name.toCharArray();
		Set<Character> nameset = new HashSet<Character>();
		for (int i = 0; i < namearray.length; i++) {

			for (int j = 1; j < namearray.length; j++) {

				if (namearray[i] == namearray[j]) {

					nameset.remove(namearray[j]);

				} else {

					nameset.add(namearray[i]);
				}

			}

		}

		System.out.println(nameset);
	}

}
