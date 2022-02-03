package com.company;
import java.util.*;

//create a class
// to create an exception class is extended by exception class
class OnlyPositiveNumber extends Exception {

	public OnlyPositiveNumber(String message) {
		super(message);
	}
	
}

public class MyCustomException {

	public static void main(String[] args) throws OnlyPositiveNumber{
		
		// need to find the even and odd from positive numbers
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
			//even odd logic
		}
		else {
//			System.out.println("Only positive numbers are allowed");
			// use throw keyword
			throw new OnlyPositiveNumber("Only positive numbers are allowed");
		}

	}

}
