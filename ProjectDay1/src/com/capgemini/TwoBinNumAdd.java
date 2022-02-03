package com.capgemini;
import java.util.*;

//Java Program to add two binary numbers

public class TwoBinNumAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int carry = 0;
		int sum = 0;
		int p = 1;
		while(num1 > 0 || num2 > 0 || carry > 0) {
			int dig1 = num1%10;
			int dig2 = num2%10;
			num1 = num1/10;
			num2 = num2/10;
			
			int res = dig1+dig2+carry;
			carry = res/2;
			int rem = res%2;
			sum = sum + rem*p;
			p = p*10;
		}
		
		System.out.println(sum);
	}

}
