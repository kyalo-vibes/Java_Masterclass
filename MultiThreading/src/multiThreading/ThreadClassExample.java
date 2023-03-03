package multiThreading;

public class ThreadClassExample extends Thread{

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();
		
		ThreadClassExample obj1 = new ThreadClassExample();
		ThreadClassExample obj2 = new ThreadClassExample();
		
		obj1.start();
		obj2.start();
		
		while(obj1.isAlive() || obj2.isAlive()){
			
		}
		
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
	}

	@Override
	public void run() {
		double result = 0;
		
		for (int i = 0; i < 1000000000; i++) {
			result = (i/3.2)*5.322321/7.4334343%6.3;
		}
		System.out.println(result);		
	}
}
