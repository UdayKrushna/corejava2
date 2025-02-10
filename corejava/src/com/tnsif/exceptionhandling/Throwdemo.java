package com.tnsif.exceptionhandling;

public class Throwdemo {
	public void validate(int age) {
		try {
			if(age<18) {
				throw new ArithmeticException("you are not eligble to the pub");
			}
			else {
				System.out.println("you  are eligble to the pub to dance");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Throwdemo d=new Throwdemo();
	d.validate(3);
	System.out.println("hello ");
}
}
