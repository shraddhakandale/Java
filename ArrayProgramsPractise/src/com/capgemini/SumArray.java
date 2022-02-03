package com.capgemini;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		int sum=0;
		
		System.out.println("Enter 5 elements");
		
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			sum += intArray[i];
		}
		
		System.out.println("sum of all array elements is : "+sum);

	}

}
