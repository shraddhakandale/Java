package com.StringPrograms;
import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		
		System.out.println("Enter the character whose occurances you want to count : ");
		String ch = sc.next();		
		
		for(int i=0; i<s.length(); i++) {
			if((Character.toString(s.charAt(i))).equals(ch)) {
				count+=1;
			}
		}
		
		System.out.println("number of occurances : "+count);
	}

}