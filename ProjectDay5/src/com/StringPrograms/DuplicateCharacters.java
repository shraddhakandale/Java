package com.StringPrograms;
import java.util.*;

public class DuplicateCharacters {

	public static void main(String[] args) {
		int num_of_chars = 256;
		int[] charArray = new int[num_of_chars];
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			charArray[s.charAt(i)]++;
			System.out.println(charArray[s.charAt(i)]);
		}
		
		for(int i=0; i<num_of_chars; i++) {
			if(charArray[i] > 1) {
				System.out.println((char)(i));
			}
		}
		
	}

}
