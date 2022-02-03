package com.capgemini;
import java.util.*;

//Java Program to add two complex numbers

//Java program to add two complex numbers

class ComplexNumAdd {

	int real, image;
	
	public ComplexNumAdd(int r, int i)
	{
		this.real = r;
		this.image = i;
	}

	public void showC()
	{
		System.out.print(this.real + " +i" + this.image);
	}

	public static ComplexNumAdd add(ComplexNumAdd n1,
									ComplexNumAdd n2)
	{

		ComplexNumAdd res = new ComplexNumAdd(0, 0);

		
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;

		return res;
	}

	public static void main(String arg[])
	{

		ComplexNumAdd c1 = new ComplexNumAdd(4, 5);
		ComplexNumAdd c2 = new ComplexNumAdd(10, 5);

		ComplexNumAdd res = add(c1, c2);

		System.out.println("\nAddition is :");
		res.showC();
	}
}

