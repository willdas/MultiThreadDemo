package com.multithread.demo.one.currentThread;

public class CountOperate extends Thread{

	public CountOperate() {
		System.out.println("CountOperate--begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("this.name="+this.getName());
		System.out.println("CountOperate--end");
	}
	
	@Override
	public void run() {
		System.out.println("run--begin");
		System.out.println("Therad.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("this.name="+this.getName());
		System.out.println("run--end");
	
	}
	
}
