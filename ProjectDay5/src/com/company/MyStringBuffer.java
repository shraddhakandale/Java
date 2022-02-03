package com.company;

//String -> used to store the string value and it is immutable, not thread safe
//StringBuffer -> used to store string value, mutable, not thread safe
//StringBuilder -> used to store string value, mutable, thread safe

public class MyStringBuffer {

	public static void main(String[] args) {
		
		//when we apply any method on normal string then it always returns the new string 
		String str = "Hello";
		str.concat(" java");
		System.out.println(str); //here we have the same old string
		
		//String buffer modifies the current string
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" java");// adds this string at the end of original string
		System.out.println(sbf); //modified the current string
		//delete in string
		sbf.delete(1, 3); //delete from start index to end index excluding end index
		System.out.println(sbf);
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("Hello World");
		System.out.println(sb);
		sb.append(" Its Awesome!");
		System.out.println(sb);

	}

}
