package com.company;
import java.util.*;

public class MyFloatMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
        System.out.println("Enter first number.");  
        Float f1 = scanner.nextFloat();  
        System.out.println("Enter second number");  
        Float f2 = scanner.nextFloat();  
        
        //return the smaller of two values  
        Float f3 = Float.min(f1,f2);  
        System.out.println("The smaller number is: "+f3);  
      //return the maximum of two values
        Float f4 = Float.max(f1,f2);  
        System.out.println("The larger number is: "+f4);  

	}

}
