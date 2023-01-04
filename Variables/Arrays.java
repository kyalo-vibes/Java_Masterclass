public class Arrays{
    public static void main(String[] args) {

	int[] array = {10, 20, 30,40,50};

	int sum = 0;

	for (int d : array) sum += d;

	double average = 1.0d * sum / array.length;

	System.out.println("Average : "+ average);

    }
}