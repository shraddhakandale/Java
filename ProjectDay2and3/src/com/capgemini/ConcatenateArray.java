package com.capgemini;

public class ConcatenateArray {

	public static void main(String[] args) {
		
		int[] intArray1 = {10,20,30};
		int[] intArray2 = {30,40,50,60,70,80,};
		
		int leng = intArray1.length + intArray2.length;
		int[] concatenatedArray = new int[leng];
		int pos = 0;
		
		for(int i=0; i < intArray1.length; i++) {
			concatenatedArray[i] = intArray1[i];
			pos ++;
		}
		
		for(int i=0; i < intArray2.length; i++) {
			concatenatedArray[pos++] = intArray2[i];
		}
		
		System.out.println("Concatenated array : ");
		for(int i=0; i < concatenatedArray.length; i++) {
			System.out.print(concatenatedArray[i]+" ");
		}
	}

}
