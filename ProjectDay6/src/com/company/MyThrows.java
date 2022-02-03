package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

// there are two ways to handle the exception
// 1) try catch block
// 2) Throws keyword

// cant throw exception at class level
class MyException{
	// here the throws is added at the method level
	// this exception is generated here and it needs to be handeled at the time of method invocation
	public void myNewException() throws FileNotFoundException{
		FileInputStream inputStream = new FileInputStream("c:\\file.txt");
	}
}

public class MyThrows {
	
	public static void main(String[] args) throws FileNotFoundException {
			
		try {
			MyException exp = new MyException();
			exp.myNewException();
			
		} 
		// chained exception
		// we can have multiple catch blocks
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e){
			
		}
		catch(FileSystemNotFoundException e){
			
		}
		catch(Exception e){
			
		}
	}

}
