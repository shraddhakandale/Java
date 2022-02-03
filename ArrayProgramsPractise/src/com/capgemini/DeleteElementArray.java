package com.capgemini;

import java.util.Scanner;

public class DeleteElementArray {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		System.out.println("Enter 5 elements");
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter an element you want to delete");
		int delElement = sc.nextInt();
		
		for(int i=0; i<5; i++) {
			if(intArray[i] == delElement) {
				intArray[i] = 0;
			}
		}
		
		System.out.println("Transformed array after deletion is : ");
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}

	}

}
