package com.tnsif.abstractdemo;

public abstract class Shape {
protected float area;
abstract void calarea();
void show() {
	System.out.println("area of shape "+area);
}
@Override
public String toString() {
	return"shape[area="+area+"]";
}
public String toStrig() {
	// TODO Auto-generated method stub
	return null;
}
}
