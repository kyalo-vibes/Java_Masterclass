package controlstatements;

public class ForLoopExample2 {

    public static void main(String[] args) {

        int ary[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < ary.length; i++) {
            sum += ary[i]; // sum = sum + ary[i];
        }

        System.out.println("Sum is : " + sum);

    }
}
