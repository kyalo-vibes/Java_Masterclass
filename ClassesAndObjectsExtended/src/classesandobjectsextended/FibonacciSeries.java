package classesandobjectsextended;

public class FibonacciSeries {

    static int a = 0, b = 1, fibNum = 0;

    static int maxLimit = 10000;

    public static void main(String[] args) {
        int x = 1000;

        System.out.println(a + " " + b);

        FibonacciSeries();
    }

    static void FibonacciSeries() {

        fibNum = a + b;

        if (fibNum < maxLimit) {
            a = b;
            b = fibNum;

            System.out.print(" " + fibNum);
            FibonacciSeries();
        }
    }

}
