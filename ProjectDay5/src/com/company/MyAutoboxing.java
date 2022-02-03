package com.company;

public class MyAutoboxing {

	public static void main(String[] args) {
		// int to string using wrapper class
		int abc = 10;
		String str1 = String.valueOf(abc);
		System.out.println("integer to string : "+str1);
		
		String str2 = "20";
		int b = Integer.parseInt(str2);
		System.out.println("String to integer : "+b);
		
		System.out.println("Maximum value is : "+Integer.max(100, 500));
		System.out.println("Minumum value is : "+Integer.min(100, 500));
		
	}

}
