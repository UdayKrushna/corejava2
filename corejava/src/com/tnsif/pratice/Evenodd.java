package com.tnsif.pratice;
import java.util.Scanner;
public class Evenodd { public static void main(String[] args) {
	
		System.out.println("user input no");
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int sum=0;
		while(input!=0) {
			sum+= input%10;
			input/=10;
			
		}
		System.out.println("sum of the digits"+sum);
	}
	
	

}
