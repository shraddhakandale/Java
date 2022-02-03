package com.StringPrograms;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s = sc.nextLine();
		System.out.println("Original string : "+s);
		
		String reversedString = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reversedString += s.charAt(i); 
		}
		
		System.out.println("Reversed string : "+reversedString);

	}

}

