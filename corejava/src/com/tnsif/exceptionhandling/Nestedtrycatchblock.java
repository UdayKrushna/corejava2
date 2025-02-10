package com.tnsif.exceptionhandling;

public class Nestedtrycatchblock {
public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("string length"+slength);
	String anotherstring=null;
	int y=6;
	try {
	try {
		System.out.println(str.charAt(y));
	}
	catch(StringIndexOutOfBoundsException ex) {
		System.out.println("index out of budn"+ex.getMessage());
	}
	System.out.println("string length"+anotherstring.length());
	}
	catch(NullPointerException e) {
		System.out.println("exception"+e.getMessage());
	}
}

}

