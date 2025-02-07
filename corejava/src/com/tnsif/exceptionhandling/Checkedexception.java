package com.tnsif.exceptionhandling;

import java.awt.AWTException;

public class Checkedexception {
	int d=0;
	public static void main(String[] args) {
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {

		System.out.println("ar" +e);

		System.out.println("hello");}	
	}

}
