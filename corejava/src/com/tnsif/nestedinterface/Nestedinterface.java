package com.tnsif.nestedinterface;

public class Nestedinterface implements Myinterface.Myinnerinterface{
	@Override
	public void print() {
		System.out.println("inner interface method");
	}

}
