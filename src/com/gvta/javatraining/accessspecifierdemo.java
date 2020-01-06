package com.gvta.javatraining;

public class accessspecifierdemo {
	// Access modifier is private
	private static int i=20;
	// Access modifier is public
	// Since this variable is declared in public it can be accessed in the other package as well
	// I have referenced in the class called as the accessspecifier2
	public int j=10;
	protected String name="Tarun";
	
	public static void main(String args[])
	{
		
		System.out.println(i);
	
		
		
		
	}

}

