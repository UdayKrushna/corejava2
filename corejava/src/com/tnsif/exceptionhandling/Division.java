package com.tnsif.exceptionhandling;

public class Division {
	public static void divide() {
		int a=6,b=0,c;
		try {
			c=a/b;
			System.out.println("division"+c);
		}
		catch(ArithmeticException f){
			System.out.println(f.getMessage());
			
		}
	}
	}


