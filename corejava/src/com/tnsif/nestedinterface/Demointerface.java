package com.tnsif.nestedinterface;



public class Demointerface implements Childinterface,interfaceone {
@Override
public void show() {
	System.out.println("show");
}
public static void main(String[] args) {
	Demointerface d=new Demointerface();
	d.show();
	d.print();
}
@Override
public void print() {
	// TODO Auto-generated method stub
	
}
}
