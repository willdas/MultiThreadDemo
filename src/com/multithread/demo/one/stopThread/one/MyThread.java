package com.multithread.demo.one.stopThread.one;


public class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 5000000; i++) {
			System.out.println("i="+(i+1));
		}
	}

}
