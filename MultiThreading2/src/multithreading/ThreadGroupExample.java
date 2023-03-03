package multithreading;

public class ThreadGroupExample {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup threadGroup = new ThreadGroup("My Thread Group"); 

		Thread t1 = new Thread(threadGroup,new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("From T1");
			}
		});
		
		Thread t2 = new Thread(threadGroup,new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("From T2");
				}
		});

		Thread t3 = new Thread(threadGroup,new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("From T3");
				}
		});
		
		t1.start();
		t3.start();
		t2.start();
		threadGroup.list();
		Thread.sleep(10000);
		System.out.println("Active Threads : "+threadGroup.activeCount());
		//threadGroup.list();

	}

}
