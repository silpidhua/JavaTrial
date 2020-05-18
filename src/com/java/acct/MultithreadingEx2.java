package com.java.acct;

class Printer{
	//synchronized void printDocument(int num, String docName) {
	void printDocument(int num, String docName) {
		for(int i=0; i<num; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing document "+docName+" "+i);
		}
	}
}

class MyThread extends Thread{
	Printer pRef;
	// reference of printe object passed in constructor
	MyThread(Printer p){
		pRef=p;
	}
	public void run() {
		synchronized(pRef) {
		pRef.printDocument(10, "SujoyProfile.pdf");
		System.out.println(Thread.currentThread().getName());  
	}
	}
}
class YourThread implements Runnable{
	Printer pRef;
	YourThread(Printer p){
		pRef=p;
	}
	public void run() {
		synchronized(pRef) {
		pRef.printDocument(10, "SilpiPRofile.pdf");
	}
	}
}
public class MultithreadingEx2 {

	public static void main(String[] args) {
		System.out.println("== Application started");
		
		Printer printer = new Printer();
		//printer.printDocument(10, "SilpiProfile.pdf");
		
		// Multiple thread working on the same Printer object
		//If multiple Threads are going to work on the same object we must synchronized them
		MyThread mref = new MyThread(printer); // MyThread is having reference to the printer object
		YourThread yref = new YourThread(printer); //// YourThread is having reference to the printer object
		Thread r = new Thread (yref);
		System.out.println("name of mref: "+mref.getName()+" id: "+mref.getId());
		System.out.println("name of yref: "+r.getName()+" id: "+r.getId());
		mref.start();
		/*try {
			mref.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		r.start();
		
		System.out.println();
		System.out.println("==Application finished");

	}

}
