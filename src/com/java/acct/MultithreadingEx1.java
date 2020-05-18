package com.java.acct;

/*class AnotherTask{
	void executedTask() {
		for(int doc =1; doc<=10; doc++) {
			System.out.println("printing document #"+doc+" printer2");
		}
	}
}*/
// AnotherTask IS-A Thread
class AnotherTask extends Thread{
	@Override
	public void run() {
		for(int doc =1; doc<=10; doc++) {
			System.out.println("printing document #"+doc+" printer2");
		}
	}
}

class OtherTask implements Runnable{
	public void run() {
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("printing document #"+doc+" printer3");
		}
	}
}
public class MultithreadingEx1 {

	public static void main(String[] args) {
		//main method represents main thread.
		//Thread always execute jobs in a sequence

		System.out.println("==Application Started==");
		
		// extends thread
		AnotherTask task1 = new AnotherTask(); //child thread
		//task1.setDaemon(true);
		task1.start(); // start() internally executes run method
		
		// implements runnable
		Runnable r = new OtherTask();
		Thread t = new Thread(r);
		t.start();
		
		/*for(int doc =1; doc<=10; doc++) {
			System.out.println("Printing document #"+doc+" printer1");
		}*/
		
		System.out.println("==Application finished==");
	}

}
