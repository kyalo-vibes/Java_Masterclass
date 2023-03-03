package multiThreading;

public class RunnableIntExample3 implements Runnable{
	@Override
	public void run() {
		double result = 0;
		
		for (int i = 0; i < 10000000; i++) {
			result = (i/3.2)*5.34455321/7.4334343%6.3;
		}
		System.out.println(result);	
	}
}
