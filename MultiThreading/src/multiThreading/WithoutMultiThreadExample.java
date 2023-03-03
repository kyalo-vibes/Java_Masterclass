package multiThreading;

public class WithoutMultiThreadExample {
	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		double result = 0;
		
		for (int i = 0; i < 1000000000; i++) {
			result = (i/3.2)*5.322321/7.4334343%6.3;
		}
		System.out.println(result);
		
		for (int i = 0; i < 1000000000; i++) {
			result = (i/3.2)*5.322321/7.4334343%6.3;
		}
		System.out.println(result);
		
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
	}
}
