package com.capgemini;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is largest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is largest");
		}
		else {
			System.out.println(c+" is largest");
		}
	}

}
