package com.company;
import java.util.*;

public class MyList {

	public static void main(String[] args) {
		
		// interface left      // implement class on right side
		List<String> ls = new ArrayList<String>();
		
		// LinkedList as implementation
		List<String> Linkedls = new LinkedList<String>();
		
		// stack -> fifo
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(100);
		stk.push(200);
		stk.push(300);
		stk.push(400);
		stk.push(500);
		
		// pop()
		System.out.println("Popped element is : "+stk.pop());
		
		// peek()
		System.out.println("Peek element is : "+stk.peek());
		
		// returns last element
		System.out.println();
		
		
		// vector implements dynamic array
		// Thread safe
		List<String> v = new Vector<String>(); 

	}

}
