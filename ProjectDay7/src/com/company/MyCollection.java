package com.company;
import java.util.*;
import java.util.ArrayList;

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
		for(Object obj:list) {
			System.out.println(" "+obj.toString());
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
		System.out.println("200 is present in list? \nAns : "+intList.contains(200));
		
		//Lambda expression -> java 1.8 -> print value
//		intList.forEach(System.out::println);
//		intList.forEach(e->System.out.println(e));
		
		// get the value at particular index
		System.out.println("value at index 2 is : "+intList.get(2));
		
		// get the index of any value
		// return the index of value if found
		// if the value is not found then it returns -1
		System.out.println("index of 200 in intList is : "+intList.indexOf(200));
		
		// check if the list is empty or not
		// returns true if list is empty
		// returns false if the list is empty
		System.out.println("List is empty or not?\nAns : "+intList.isEmpty());
		
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
		System.out.println("size of intList is : "+intList.size());
		
		// sort()
		// sort Ascending
		Collections.sort(intList);
		System.out.println("Ascending order after sorting: "+intList.toString());
		
		// sort Descending
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println("Descending order after sorting: "+intList.toString());
	}

}
