package com.week3.day1.assessment;

import java.util.Arrays;

import com.google.common.primitives.Chars;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String words[] = test.split(" ");
		String test1 = "";
		int length = words.length;

		for (int i = 0; i < words.length; i++) {
			System.out.print(" ");

			if (i % 2 != 0) {

				char[] evenarray = words[i].toCharArray();

				for (int j = evenarray.length - 1; j >= 0; j--) {

					System.out.print(evenarray[j]);

				}

			}

			else {

				System.out.print(words[i] + " ");

			}

		}

	}

}
