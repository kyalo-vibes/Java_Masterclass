package multithreading;

import java.io.IOException;

public class SimultaniousThread {

	public static void main(String[] args) throws InterruptedException {

		SyncExample obj = new SyncExample();
		SyncExample obj3 = new SyncExample();
		
		//SyncExample2 obj2 = new SyncExample2();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				//obj.display("APPLE");
				try {
					SyncExample.writeToFile("APPLE");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//obj2.incrementCount();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				//obj.display("BANANA");
				try {
					SyncExample.readFromFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//obj3.readCount();
			}
		});

		t1.start();
		t2.start();

		System.out.println("From Main..");

	}

}
