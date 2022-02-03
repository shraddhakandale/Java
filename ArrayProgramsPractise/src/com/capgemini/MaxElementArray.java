package com.capgemini;
import java.util.Scanner;

public class MaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=1; i<5; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element is : "+max);
	}

}
