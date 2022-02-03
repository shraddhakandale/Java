package com.company;

public class MyStrings {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str2 = new String("Hello");
		
		// length of string
		System.out.println(str.length());
		
		// string empty or not isEmpty() method is used and it returns true or false
		if(str2.isEmpty()) {
			System.out.println("String is empty");
		}
		else {
			System.out.println("String is not empty");
		}
		
		//===============================================================================
		// find the character at particular index
		System.out.println(str.charAt(1));
		
		// codePointAt() -> returns the unicode value of character at a particular index 
		System.out.println(str.codePointAt(1));
		
		// equals
		if(str.equals(str2)) {
			System.out.println("Both the strings are equal");
		}
		else {
			System.out.println("Both the strings are different");
		}
		
		//equalIgnoreCase -> it compare the strings but is not case sensitive
		if(str.equalsIgnoreCase(str2)){
			System.out.println("Both the strings are equal");
		}
		else {
			System.out.println("Both the strings are different");
		}
		
		//===============================================================================
		//compareTo() -> it compares both the strings
		// if str1 > str2 then it returns difference between str1 and str2 (positive)
		// if str1 < str2 then it returns difference between str1 and str2 (negative value)
		// if both the strings are equal then it returns 0
		String str3 = "A";
		String str4 = "E";
		System.out.println(str3.compareTo(str4));
		
		String str6 = "E";
		String str7 = "A";
		System.out.println(str6.compareTo(str7));
		
		String str8 = "a";
		String str9 = "E";
		System.out.println(str8.compareTo(str9));
		
		//compareToIgnoreCase -> it is not case sensitive 
		// in this case a is converted into A and then compared or E is converted into e and then compared
		System.out.println(str8.compareToIgnoreCase(str9));
		
		// startsWith -> used to check if the string starts with the given character or not
		// it returns true or false
		if(str.startsWith("H")) {
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		
		//===============================================================================
		//substring() -> it is used to get substring from a given string
		System.out.println(str.substring(2));  //substring from the given index to the end
		System.out.println(str.substring(1,3)); //substring from the given index to the last index excluding lastidx 
		
		
		//concat()
		System.out.println(str.concat(" concatenated"));
		System.out.println(str2.concat(" "+str3));
		
		//contains() -> it will check if the given substring is present in the main string and returns true or false
		System.out.println(str.contains("llo"));
		
		//toLowerCase() -> it converts the entire string to lower case
		System.out.println(str.toLowerCase());
		
		
		//trim() -> removes the blank space from beginning and from end
		String str5 = " string with space at starting and ending ";
		System.out.println(str5.trim());
		
		//===============================================================================
		//String pool
		String s1 = "Hello String";
		String s2 = "Hello String";
		
		String s3 = new String("Hello String"); // string in heap
		
		if(s1 == s2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		System.out.println("using equals() method");
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		//===============================================================================
		System.out.println("Comparing strings in pool and in heap");
		if(s1 == s3) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		System.out.println("using equals() method");
		
		if(s1.equals(s3)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
	}

}
