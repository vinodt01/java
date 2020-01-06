package com.gvta.interfaceinheritance;

 // 1. Class extending another class

public class Child extends InterfaceandInheritancedemo implements Interface,Interface2 {

public static void main(String args[])
{

Child c = new Child();	
// Method Inherited from  the InterfaceandInheritancedemo which is the parent class
c.disp();
c.display();
c.printString();
}
// Class overriding this method from Interface 1
public void display()
{
System.out.println("Method implemented from the interface 1");	

}
// Class overriding this method from Interface 2
public void printString()
{
	
System.out.println("Method implemented from interface 2");

}


}
