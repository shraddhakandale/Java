package com.company;

import java.util.*;

//Collection in Java

//Collection is set of different implementation
//Array
//LinkedList
//Queue
//store the data in collection
//easy to insert, update, delete and sort and other operations
//min, max

// Collection is interface
// set
// list

public class MyCollection {

	public static void main(String[] args) {

		// creating object of arraylist
		// it is array list of objects so it can have any data type
		ArrayList list = new ArrayList();
		list.add("Shraddha");
		list.add(22);
		list.add(1.0f);
		list.add(101);

		// print using toString()
		System.out.println(list.toString());

		// print without toString() internally uses toString()
		System.out.println(list);

		// print using for loop
		for (Object obj : list) {
			System.out.println(" " + obj.toString());
		}

		System.out.println("-------------------------------------------------");

		// array list of specific data type
		// array list internally use the array as data structure
		// initial size is 10
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
		intList.add(300);
		intList.add(200);
		intList.add(400);

		// delete all elements of list
//		intList.clear();

		// print list of integers
		System.out.println(intList);

		// search for the given value
		// if it is present return true else returns false
		System.out.println("200 is present in list? \nAns : " + intList.contains(200));

		// Lambda expression -> java 1.8 -> print value
//		intList.forEach(System.out::println);
//		intList.forEach(e->System.out.println(e));

		// get the value at particular index
		System.out.println("value at index 2 is : " + intList.get(2));

		// get the index of any value
		// return the index of value if found
		// if the value is not found then it returns -1
		System.out.println("index of 200 in intList is : " + intList.indexOf(200));

		// check if the list is empty or not
		// returns true if list is empty
		// returns false if the list is empty
		System.out.println("List is empty or not?\nAns : " + intList.isEmpty());

		// iterator
		// print or modify all the values
		// create object of iterator interface
		// list.iterator() -> return iterator for list
		Iterator<Integer> it = intList.iterator();
		// hasNext() -> return true if there is next value else returns false
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		// Remove the value at particular index
		// if value or index found then return true else false
//		System.out.println("Remove the value at index 2 which is 300 : "+intList.remove(2));
//		System.out.println("Remove the value using object : "+intList.remove("100"));

		// size() -> returns the size of list
		System.out.println("size of intList is : " + intList.size());

		// sort()
		// sort Ascending
		Collections.sort(intList);
		System.out.println("Ascending order after sorting: " + intList.toString());

		// sort Descending
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println("Descending order after sorting: " + intList.toString());
		
		System.out.println();
		System.out.println("*********Stack*********");
		System.out.println();
		// Stack -> LIFO
		// stack -> fifo
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(100);
		stk.push(200);
		stk.push(300);
		stk.push(400);
		stk.push(500);
		
		// print stack
		System.out.println("Initial stack is : "+stk.toString());

		// pop()
		System.out.println("Popped element is : " + stk.pop());

		// peek()
		System.out.println("Peek element is : " + stk.peek());
		
		// print stack
		System.out.println("Final stack is : "+stk.toString());
		
		System.out.println();
		System.out.println("*********Linked List*********");
		System.out.println();
		// LinkedList
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(123);
		ll.add(223);
		ll.add(333);
		ll.add(423);
		
		// print linked list
		System.out.println("Initial linked list is : "+ll.toString());
		
		// returns and removes first element -> head of linked list
		System.out.println("Head of inked list is : "+ll.pollFirst());
		
		// returns and removes last element -> tail of linked list
		System.out.println("Tail of the linked list is : "+ll.pollLast());
		
		// removes and removes the head of the linked list
		System.out.println("Removed head from the linked list : "+ll.poll());
		
		// print linked list
		System.out.println("after removing head the linked list is : "+ll.toString());		

	}

}
