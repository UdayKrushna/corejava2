package com.tnsif.mutlithreadingdemo;

class Am implements Runnable{
	public void run() {
		System.out.println("eclipse"+Thread.currentThread().getId());
	}

	}


public interface Maindemo2{
	public static void main(String[] args) {
		Am c=new Am();
		Thread t=new Thread(c);
		t.start();
		
	}
}
