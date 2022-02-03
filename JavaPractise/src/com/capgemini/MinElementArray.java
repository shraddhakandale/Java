package com.capgemini;
import java.util.*;

public class MinElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimun number in array is : "+min);
	}

}
