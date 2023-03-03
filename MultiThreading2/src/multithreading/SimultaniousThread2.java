package multithreading;

import java.io.IOException;

public class SimultaniousThread2 {

	public static void main(String[] args) throws InterruptedException {

		SyncBlockExample obj = new SyncBlockExample();
		
		final long startTime = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.method("C:\\Users\\Admin\\Desktop\\Read1.txt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Thread T1");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.method("C:\\Users\\Admin\\Desktop\\Read2.txt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Thread T2");

		t1.start();
		t2.start();
		
		while(t1.isAlive() || t2.isAlive()){
			
		}

		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));

	}

}
