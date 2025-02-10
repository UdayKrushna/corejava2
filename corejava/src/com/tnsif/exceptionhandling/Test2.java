package com.tnsif.exceptionhandling;

public class Test2 {
	public static void main(String[] args) {
		
	
	try {
		System.out.println(5/0);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("printing finally =block with exception");
	}

}}
