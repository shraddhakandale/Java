package com.capgemini;
import java.util.*;

//Java Program to check whether input character is vowel or consonant

public class VowelConsonent {

	public static void main(String[] args) {
		char ch = 'i';
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
			System.out.println(ch + " is a VOWEL");
		}
		else {
			System.out.println(ch + " is a CONSONENT");
		}

	}

}
