package com.week3.day2.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String words[] = text.split(" ");
		int length = words.length;
		System.out.println(length);
		Set<String> eset= new LinkedHashSet<String>();
		for (int i = 0; i < length; i++) {
			eset.add(words[i]);
			
			
			
		}
		System.out.print(eset);
		

	}

}
