package com.capgemini;
import java.util.*;

public class FindValueArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to find : ");
		int key = sc.nextInt();
		
		for(int i=0; i<5; i++) {
			if(arr[i] == key) {
				System.out.println("Element is found at position : "+(i+1));
				break;
			}
		}
				
	}

}
