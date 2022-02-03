package com.capgemini;
import java.util.*;

public class MyArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		double[] dblArray = new double[5];
		float[] fltArray = new float[5];
		long[] longArray = new long[5];
		
		
		//Write or set the values of an array
//		a[0] = 10;
//		a[1] = 2;
//		a[2] = 45;
//		a[3] = 6;
//		a[4] = 2;
		
		//Read or print the array
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		//user input using for loop
		System.out.println("Integer array");
		for(int i=0; i<5; i++) {
			System.out.println("Enter value for "+i+" th location");
			intArray[i] = sc.nextInt();
		}
		
		//print using for loop
		System.out.println("Printing Integer array ...");
		for(int i=0; i<5; i++) {
				System.out.println(intArray[i]);
		}
		
		System.out.println("========================================================");
		
		System.out.println("String array");
		for(int i=0; i<5; i++) {
			System.out.println("Enter value for "+i+" th location");
			strArray[i] = sc.next();
		}
		
		System.out.println("Printing String array ...");
		for(int i=0; i<5; i++) {
				System.out.println(strArray[i]);
		}
		
		System.out.println("========================================================");
		
		System.out.println("Double array");
		for(int i=0; i<5; i++) {
			System.out.println("Enter value for "+i+" th location");
			dblArray[i] = sc.nextDouble();
		}
		
		System.out.println("Printing Double array ...");
		for(int i=0; i<5; i++) {
				System.out.println(dblArray[i]);
		}
		
		System.out.println("========================================================");
		
		System.out.println("Float array");
		for(int i=0; i<5; i++) {
			System.out.println("Enter value for "+i+" th location");
			fltArray[i] = sc.nextFloat();
		}
		
		System.out.println("Printing Float array ...");
		for(int i=0; i<5; i++) {
				System.out.println(fltArray[i]);
		}
		
		System.out.println("========================================================");
		
		System.out.println("Long array");
		for(int i=0; i<5; i++) {
			System.out.println("Enter value for "+i+" th location");
			longArray[i] = sc.nextLong();
		}
		
		System.out.println("Printing Long array ...");
		for(int i=0; i<5; i++) {
				System.out.println(longArray[i]);
		}
		

	}

}
