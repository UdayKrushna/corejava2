package com.tnsif.stringdemo;

public class Immutableexample2 {
	public static void main(String[] args) {
		String s="sachine";
		String s1=s;
		String s2=s1;
		System.out.println("s"	+s);
		System.out.println("s1"	+s1);
		System.out.println("s2"	+s2);
		s="tendulkar";
		System.out.println("s"+s);
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
	}

}
