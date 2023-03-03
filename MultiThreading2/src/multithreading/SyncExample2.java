package multithreading;

public class SyncExample2 {
	
	volatile int count = 0;
	
	public synchronized void incrementCount(){
		for(int i =0;i<10000000;i++)
			count++;
	}
	
	public synchronized void readCount(){
		System.out.println(count);
	}
}
