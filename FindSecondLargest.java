package com.week3.day2.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		int length = data.toString().length();

		Set<Integer> dummy = new TreeSet<Integer>();
		for (int i = 0; i < length; i++) {

			dummy.add(data[i]);

		}

		System.out.println(dummy);
		List<Integer> test = new ArrayList(dummy);
		int size = test.size();
		// System.out.println(size);
		System.out.println(test.get(size - 2));

	}

}
