package com.tnsif.mutlithreadingdemo;

public class Demosleep extends Thread {


	public void run() {
		for(int i=0;i<5;i++) 
		System.out.println("demo"+Thread.currentThread().getId());
		try {
			sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	


}
 class sleep{
	public static void main(String[] args) {
		Demosleep d=new Demosleep();
		d.start();
	}
}

}
