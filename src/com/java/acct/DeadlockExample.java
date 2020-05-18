package com.java.acct;

class Supplier1{
	final String resource1 = "thread 1";
	final String resource2 = "thread 2";
	synchronized void method1(int t,String s) {
		for(int i =0; i<t; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Method1 from "+s+ " Process#"+i);	
		}
	}
}
class Supplier2{
	final String resource1 = "thread 1";
	final String resource2 = "thread 2";
	synchronized void method2(int t,String s) {
		for(int i =0; i<t; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Method2 from "+s+ " Process#"+i);	
		}
	}
}

class Thread1 extends Thread{
	Supplier1 obj1 = null;
	Supplier2 obj2 = null;
	Thread1(Supplier1 obj1, Supplier2 obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run() {
			System.out.println("Thread 1: locked resource1");
			obj1.method1(3, "thread1");
			try { Thread.sleep(300);} catch (Exception e) {}  
				obj2.method2(3, "thread2");
				System.out.println("Thread 1:locked resource 2");
	}
}
class Thread2 extends Thread{
	Supplier1 obj1 = null;
	Supplier2 obj2 = null;
	Thread2(Supplier1 obj1,Supplier2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void run(){
			System.out.println("Thread 2: locked resource2");
			obj2.method2(4, "thread2");
			try {Thread.sleep(300);}catch(Exception e) {}
				obj1.method1(4, "thread1");
				System.out.println("Thread 2:Locked resource 1 ");
	}
}

public class DeadlockExample extends Thread{

	public static void main(String[] args) {
		Supplier1 sup1 = new Supplier1();
		Supplier2 sup2 = new Supplier2();
		
		Thread1 t1 = new Thread1(sup1,sup2);
		Thread2 t2 = new Thread2(sup1,sup2);
		
		t1.start();
		t2.start();
		
		
	}

}
