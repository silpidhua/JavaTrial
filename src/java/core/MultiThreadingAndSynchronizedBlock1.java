package java.core;
import java.util.ArrayList;
import java.util.Random;

class AnotherLogWriterClass {
	static synchronized void syncMethodClassLevel(String db) {
		System.out.println("Log write AAAAAAAAAAAAA "+db);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write BBBBBBBBBBBBB "+db);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write CCCCCCCCCCCCC "+db);
	}
	
	synchronized void syncMethodObjectLevel(String db) {
		System.out.println("Log write XXXXXX "+db);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write YYYYYY "+db);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log write ZZZZZZ "+db);
	}
}

public class MultiThreadingAndSynchronizedBlock1 {

	public static void main(String s[]) {
		AnotherLogWriterClass obj1 = new AnotherLogWriterClass();
		ArrayList<Thread> allThreads = new ArrayList<Thread>();
		Thread t;

		t = new MongoConnector(2, 5,obj1);
		t.start();
		allThreads.add(t);

		t = new MySqlConnector(5, 3,obj1);
		t.start();
		allThreads.add(t);

		t = new Thread(new PostgresConnector(7, 2,obj1));
		t.start();
		allThreads.add(t);

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

class MongoConnector extends Thread {
	int multiple;
	Random rand;
	int limit;
	AnotherLogWriterClass obj= null;
	public MongoConnector(int multiple, int limit) {
		this.multiple = multiple;
		this.rand = new Random();
		this.limit = limit;
	}
	public MongoConnector(int multiple, int limit,AnotherLogWriterClass obj) {
		this.multiple = multiple;
		this.rand = new Random();
		this.limit = limit;
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println("The " + multiple + "'s multiple at " + i + " position is " + this.multiple * i
					+ ". Lets write it in MongoDB.");
			if(obj== null) {
				AnotherLogWriterClass.syncMethodClassLevel("Mongo");
			}
			else 
			obj.syncMethodObjectLevel("Mongodb");
			try {
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MySqlConnector extends Thread {
	int multiple;
	Random rand;
	int limit;
	AnotherLogWriterClass obj = null;

	public MySqlConnector(int multiple, int limit) {
		this.multiple = multiple;
		this.rand = new Random();
		this.limit = limit;
	}
	public MySqlConnector(int multiple, int limit, AnotherLogWriterClass obj) {
		this.multiple = multiple;
		this.rand = new Random();
		this.limit = limit;
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println("The " + multiple + "'s multiple at " + i + " position is " + this.multiple * i
					+ ". Lets write it in MySQL.");
			if(obj == null) {
			AnotherLogWriterClass.syncMethodClassLevel("MySql");
			}
			else obj.syncMethodObjectLevel("MySqldb");
			try {
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PostgresConnector implements Runnable {
	int multiple;
	Random rand;
	int limit;
	AnotherLogWriterClass obj = null;
	public PostgresConnector(int multiple, int limit) {
		this.multiple = multiple;
		this.rand = new Random();
		this.limit = limit;
	}
	public PostgresConnector(int multiple, int limit, AnotherLogWriterClass obj) {
		this.multiple = multiple;
		this.rand = new Random();
		this.limit = limit;
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println("The " + multiple + "'s multiple at " + i + " position is " + this.multiple * i
					+ ". Lets write it in Postgres.");
			if(obj == null) {
			AnotherLogWriterClass.syncMethodClassLevel("Postgres");
			}
			else obj.syncMethodObjectLevel("Postgresdb");
			try {
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}