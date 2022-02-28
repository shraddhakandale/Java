package com.company;
import java.util.*;

public class MyHashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> shop = new HashMap<String,Integer>();
		shop.put("car",10);
		shop.put("bike", 2);
		shop.put("bus", 12);
		
		System.out.println(shop);
		System.out.println(shop.get("car"));
		
//		shop.remove("bus");
//		System.out.println(shop);
		
		// contain key 
//		System.out.println(shop.containsKey("car"));
//		System.out.println(shop.containsKey("bus"));	
		
		
		//contain value
		System.out.println(shop.containsValue(10));
		
		System.out.println(shop.size());
		
	}

}
