package com.tnsif.lambdaexpressions;

import java.util.ArrayList;

public class Arrayliestdemo {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.forEach(List->System.out.println(List));
	}

}
