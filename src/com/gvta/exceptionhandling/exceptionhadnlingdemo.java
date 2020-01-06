package com.gvta.exceptionhandling;
// This class shows different types of exception handling 
public class exceptionhadnlingdemo {

	public static void main(String[] args) {
	try
	{
		
	int a = 10;	
	int b = 0;
	
	// Here dividng the integer by 0.	
	int c = a / b;	
	System.out.println(c);	
		
	}
	// Shown Arithmetic Exception Handling
	catch(ArithmeticException e)
	{
		
		System.out.println("The Arithmetic exception has ben caught");
		
		
	}
	try
	{
		
	int[] arr = new int[10] ;	
	arr[0]=1;
	arr[1]=2;
	// Accessing an element that has the array size greater than that of an array	
	int c = arr[11];	
	System.out.println(c);	
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
		System.out.println("The array index out of bounds  exception has ben caught");
		
		
	}
	
	

	}

}
