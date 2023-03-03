package multithreading;

public class DeadLockExample {

	public static void main(String[] args) throws InterruptedException {

		Object obj1 = new Object();
		Object obj2 = new Object();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				synchronized (obj1) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					synchronized (obj2) {
						System.out.println("This message never gets shown");
					}
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {

				synchronized (obj1) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					synchronized (obj2) {
						System.out.println("This message never gets shown");
					}
				}

			}
		});

		t1.start();
		t2.start();

	}

}
