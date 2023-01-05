package classesandobjectsextended;

public class FactorialExample {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Factorial of " + x + " is : " + factoriaMeth(x));
    }

    static int factoriaMeth(int x) {
        if (x == 1) {
            return 1;
        } else {
            return (x * factoriaMeth(x - 1));
        }
    }

}
