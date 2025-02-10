package com.tnsif.exceptionhandling;
//no exception (finally block)
public class Test1 {
	public static void main(String[] args) {
		
	
	try
{
	System.out.println("welcome");
}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	finally {
	System.out.println("print finally block");	
	}}
}