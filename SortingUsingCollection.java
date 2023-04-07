package com.week3.day2.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {


		 String[] Companies = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		 int length = Companies.length;
		 System.out.println(length);
		 Arrays.sort(Companies);
		 for (int i=Companies.length-1; i>=0; i--) {
			 
			 System.out.println(Companies[i]);
			
		}
		 
		 
		 
		

	}

}
