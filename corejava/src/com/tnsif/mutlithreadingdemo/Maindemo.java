package com.tnsif.mutlithreadingdemo;

class Eclipse extends Thread{
public void run() {
	System.out.println("eclipse"+Thread.currentThread().getId());
}
	
}
class Notepad extends Thread{
	public void run() {
		System.out.println("notepad"+Thread.currentThread().getId());
	}	
	}
	
class Chrome extends Thread{
	public void run() {
		System.out.println("chrome"+Thread.currentThread().getId());
	}
	
}
public class Maindemo {
public static void main(String[] args) {
	System.out.println("main thread"+Thread.currentThread().getId());
	Eclipse e=new Eclipse();
	e.start();
	Notepad t=new Notepad();
	t.start();
	Chrome r=new Chrome();
	r.start();
}
}
