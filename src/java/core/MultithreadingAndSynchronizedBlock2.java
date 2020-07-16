package java.core;
import java.util.ArrayList;
import java.util.Random;

class LogWritingClass{
	synchronized static void syncMethodClassLevel(String db) {
		System.out.println("Log write AAA in "+db);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write BBB in "+db);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write CCC in "+db);
	}
	
	  synchronized void syncMethodObjectLevel(String db) {
		System.out.println("Log write XXX in "+db);
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write YYY in "+db);
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write ZZZ in "+db);
	}
	
}

class MoongoConnector extends Thread{
	int multiple;
	int limit;
	Random rand;
	public MoongoConnector(int multiple, int limit) {
		this.multiple = multiple;
		this.limit = limit;
		this.rand = new Random();
	}
	LogWritingClass obj = new LogWritingClass();
	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println("The " + multiple + "'s multiple at " + i + " position is " + this.multiple * i+ ". Lets write it in MongoDB.");
			//LogWritingClass.syncMethodClassLevel("MoongoDb");
			obj.syncMethodObjectLevel("MoongoDb");
			try {
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MySql extends Thread{
	int multiple;
	int limit;
	Random rand;
	public MySql(int multiple, int limit) {
		this.multiple = multiple;
		this.limit = limit;
		this.rand = new Random();
	}
	LogWritingClass obj = new LogWritingClass();
	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println("The " + multiple + "'s multiple at " + i + " position is " + this.multiple * i+ ". Lets write it in MySql.");
			//LogWritingClass.syncMethodClassLevel("MySqlDb");
			obj.syncMethodObjectLevel("MySqlDb");
			try {
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultithreadingAndSynchronizedBlock2 {

	public static void main(String[] args) {
		ArrayList<Thread> allThreads = new ArrayList<Thread>();
		//Thread t1,t2;
		MoongoConnector t1= new MoongoConnector(2, 4);
		t1.start();
		allThreads.add(t1);
		MySql t2= new MySql(3, 4);
		t2.start();
		allThreads.add(t2);
		
		for (Thread th : allThreads) {
			try {
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("done");
		
	}

}
