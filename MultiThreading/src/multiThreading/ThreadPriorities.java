package multiThreading;

public class ThreadPriorities {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From t1..");
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From t2..");
				
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From t3..");
				
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

		
		System.out.println("From Main..");
		
	}

}
