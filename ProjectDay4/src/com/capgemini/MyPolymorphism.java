package com.capgemini;

class MyShape
{
	public void draw(int a, int b)
	{
		System.out.println("Line Drawing");
	}
	public void draw(int a, int b,int c)
	{
		System.out.println("Circle Drawing");
	}
	public void draw(int a, int b,int c,int d)
	{
		System.out.println("Square Drawing");
	}
}

public class MyPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyShape s=new MyShape();
		s.draw(1,2);
		s.draw(1,2,3);
		s.draw(1,2,4,5);

	}

}



