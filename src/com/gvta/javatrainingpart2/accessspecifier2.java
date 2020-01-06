package com.gvta.javatrainingpart2;
import  com.gvta.javatraining.*;
public class accessspecifier2 {
	public static void main(String args[])
	{
		
		accessspecifierdemo ac = new accessspecifierdemo();
		// Called and declared the variable here that was declared in another package
		System.out.println(ac.j);
		
	}

}
