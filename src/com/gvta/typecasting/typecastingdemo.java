package com.gvta.typecasting;

public class typecastingdemo {
	public static void main (String args[])
	{
		
		
		// Example 1 - Converting Integer to double 
		// Integer declared
		int  a = 10;
		// Converted it to double implicit conversion
		double d = a;
		System.out.println(d);
		
		// Example 2
		// Converting  double to integer explicit conversion
		double var = 5.5;
		// Mentioning the Data type explicitly
		int b = (int) var;
		System.out.println(b);
		
		// Example 3 - Converting Long to Double 
		long variable = 103456;
		double vartoint =(double) variable;
		System.out.println(vartoint);		
          		
	

}
}