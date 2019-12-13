package com.gvta.finalkeyword;

public class finalkeydemo {
public static void main(String args[])
{

	
//This line cannot be used because it will throw compile time error  	
//a=20;
for(int i=1; i<10;i++)
{
// The value is updated 	
b++;	

}	

System.out.println(b);
}

// Since final is used this cannot be overriden
public static final int a =10;
// Since final keyword is not there the value can be updated 
public static int b=20;	
	
}




