package multiThreading;

public class AnonyInrClassExample {

	public static void main(String[] args) {
		
		new Thread(() -> somemeth()).start();
		new Thread(() -> somemethnew()).start();
	}
	
	public static void somemeth(){
		double result = 0;
		
		for (int i = 0; i < 10000000; i++) {
			result = (i/3.2)*5.34455321/7.4334343%6.3;
		}
		System.out.println(result);	
	}
	
	public static void somemethnew(){
		double result = 0;
		
		for (int i = 0; i < 10000000; i++) {
			result = (i/3.2)*5.34455321/7.4334343%6.3;
		}
		System.out.println(result);	
	}
}