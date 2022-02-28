package com.StringPrograms;

import java.util.*;

// str1 = "SILENT"
// str2 = "LISTEN" 

public class AnagramString {

	public static void main(String[] args) {
		
		int num_of_chars = 256;
		int[] charArray = new int[num_of_chars];
		boolean isAnagram = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1 : ");
		String str1 = sc.nextLine();
		System.out.print("Enter string2 : ");
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length()) {
			isAnagram = false;
			System.out.println("Not anagram");
		}
		else {
			// aab
			// charArray[0] = 0, charArray[1] = 0,....charArray[97] = 0, charArray[98] = 0,.....charArray[256] = 0
			for(int i=0; i<str1.length(); i++) {
				charArray[str1.charAt(i)]++;  // charArray['a']  => charArray[97] = 1
			}
			
			// baa
			// charArray[0] = 0, charArray[1] = 0,....charArray[97] = 2, charArray[98] = 1,.....charArray[256] = 0
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

