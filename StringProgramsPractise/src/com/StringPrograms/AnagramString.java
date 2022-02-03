package com.StringPrograms;

import java.util.*;

public class AnagramString {

	public static void main(String[] args) {
		int num_of_chars = 256;
		int[] charArray = new int[num_of_chars];
		boolean isAnagram = true;
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length()) {
			isAnagram = false;
			System.out.println("Not anagram");
		}
		else {
			for(int i=0; i<str1.length(); i++) {
				charArray[str1.charAt(i)]++;
			}
			
			for(int i=0; i<str2.length(); i++) {
				charArray[str2.charAt(i)]--;
			}
			
			for(int i=0; i<num_of_chars; i++) {
				if(charArray[i] != 0) {
					System.out.println("Not anagram");
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram) {
			System.out.println("It is anagram");
		}
	}

}

