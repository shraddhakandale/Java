package com.StringPrograms;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] wordLs = sentence.split("\\s");
		System.out.println("Number of words in this sentence : "+wordLs.length);

	}

}