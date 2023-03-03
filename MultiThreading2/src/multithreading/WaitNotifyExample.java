package multithreading;

public class WaitNotifyExample {

	static int total = 0;

	public static void main(String[] args) throws InterruptedException {

		FindTotal obj = new FindTotal();

		int findTotal = 10;

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (obj) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(total);
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (obj) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(total);
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				synchronized (obj) {

					total = obj.findSum(findTotal);
					obj.notifyAll();
				}
			}
		});

		t1.start();
		Thread.sleep(1000);
		t3.start();
		Thread.sleep(1000);
		t2.start();

	}

}
