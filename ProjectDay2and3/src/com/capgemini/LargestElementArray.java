package com.capgemini;

import java.util.Scanner;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int maxElement;
		
		System.out.println("Enter 5 elements");
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
		}
		
		maxElement = intArray[0];
		for(int i=1; i<5; i++) {
			if(intArray[i] > maxElement) {
				maxElement = intArray[i];
			}
		}
		
		System.out.println("max element : "+maxElement);

	}

}
