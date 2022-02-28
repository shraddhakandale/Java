package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream is interface in java
//flow the data from one direction to another
//if stream is used once. You cannot run again
//stream has already been operated upon or closed
public class MyStreamApi {

	public static void main(String args[]) {

		// List
		// Collections of Data
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(5);
		ls.add(5);

		// Generic Type
		Stream s = ls.stream();

//		 ls.stream().forEach(System.out::println);
		// again using the stream

		// stream forEach(give each element one by one)
//		 ls.stream().forEach(System.err::println);

		// stream forEach(give each element one by one)
//		 ls.stream().forEach(str->System.out.println(str));

		// filter
		//it will filter the value
		//using logical operator
		//less
		//grater than
		//==
		//!=
		//filter and print
//		ls.stream().filter(num ->num >= 5).forEach(System.out::println);
		              //filter(num ->num*2)
		//Collection the data and return back
		//filter the data only positive number
		//Collectors method to send it back
		//collect method
		//it will collect all the data and return as List
		//Collectors.toList() convert the data to list
		List<Integer> filterList=ls.stream()
				//filter
				//return true if data need to consider 
				//return false if data need to not consider
				                   .filter(num->num>2)
				                   .collect(Collectors.toList());
		
//		filterList.forEach(System.out::println);
		
		//You can modify the data and return it
		//send back true and false of logical 
		//true
		//false
		//err (error)println in red color
		//ls.stream().map(data->data*2).forEach(System.out::println);
		
		
		List<Integer> filterList1=ls.stream().filter(data->data>=0).map(data->data/3).collect(Collectors.toList());
		
		//filterList1.forEach(e->System.out.println(e));
		
		//return number of element
		long count=ls.stream().count();
		//System.out.println(count);
		
		
		//give the unique number 
		//ls.stream().distinct().forEach(e->System.out.println(e));
		//ls.stream().min(e->e==)
		//Collections.reverseOrder();
		//System.out.println(ls.stream().max(Collections.reverseOrder()));
		//System.out.println(ls.stream().min(Collections.reverseOrder()));
		
		//ls.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.println(e));
		//ls.stream().
	       
		//IntSummaryStatistics states =ls.stream().mapToInt(x->x).summaryStatistics();
		
		
//		System.out.println("max" +ls.stream().min(Collections.reverseOrder()));
//		
//		System.out.println("min"+ ls.stream().max(Collections.reverseOrder()));
//		
//		
//		IntSummaryStatistics state=ls.stream().
//				                     mapToInt(x->x).
//				                     summaryStatistics();
//		
//		System.out.println("Count "+state.getCount());
//		System.out.println("Sum " +state.getSum());
//		System.out.println("min "+state.getMax());
//		System.out.println("max "+state.getMin());
//		System.out.println("avg "+state.getAverage());
		
	}

}
