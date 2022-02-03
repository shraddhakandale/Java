package com.company;

public class MyTypeCasting {

	public static void main(String[] args) {
		// two types -> 1) implicit type casting => small to large || 2) explicit typecasting => large to small
		
		// implicit type casting
		int i = 10;
		double d = i;
		System.out.println("d: "+d);
		
		//explicit type casting
		//float--->int
		float f = 1.0f;
	    int a=(int)f;
	    System.out.println("a: "+a);
	    
	    //double -->int
	    double d2 = 1.0;
	    int b=(int)d;
	    System.out.println("b: "+b);
	    
	    double d3 = (double)f;
	    System.out.println("d3: "+d3);
	}

}
