package com.tnsif.stringdemo;

public class Comparetostring {
	public static void main(String[] args) {
		String s1="guru";
		String s2="guru";
		String s3=new String("guru");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}

}
