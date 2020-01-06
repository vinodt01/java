package com.gvta.javatraining;
import com.gvta.staticdemo.*;
public class HelloWorldDemo {
	// Initializing the main method
	public static void main(String args[])
	{
	System.out.println("Hello World");	
	accessspecifierdemo ac = new accessspecifierdemo();
	// Called the variable here that was declared in another class
	System.out.println(ac.j);
	// Protected scope this is possible it can be accessed since it is declared in another class.
	// It  cannot be accessed in another class of another package
	System.out.println(ac.name);

	// Since we used the static keyword there is no need to initialize the object 	
	System.out.println(staticdemo.twonumbers(3, 5));
	
	// Called the variable here in this class
	 System.out.println(staticdemo.svariable);
	
	}
	
// Access specifier -  Static
// Access modifier - Public	
// args- is for passing the arguments
// void - Return type	
}
