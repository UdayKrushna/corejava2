package com.tnsif.abstractdemo;

public class Square extends Shape {
	private float side;
	public Square() {
		side=2.0f;
	}
public Square(float side) {
	this.side=side;
}
	@Override
	void calarea() {
super.area=side*side;		// TODO Auto-generated method stub
		
	}
	@Override
	public String toStrig() {
		return"Square[side="+side+"]";
	}
	public static void main(String[] args) {
		Shape p=new Square(4.0f);
		System.out.println(p);
		p.calarea();
		p.show();
	}
}

	