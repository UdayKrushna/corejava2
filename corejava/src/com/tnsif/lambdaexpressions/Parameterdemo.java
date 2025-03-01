package com.tnsif.lambdaexpressions;

public class Parameterdemo {
	public static void main(String[] args) {
	Cube t=(a)->{return(a*a*a);};
	System.out.println("cube of number"+t.cal(2));
	}

}
