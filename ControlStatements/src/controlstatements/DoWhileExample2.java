package controlstatements;

import java.util.Scanner;

public class DoWhileExample2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Enter a number in the multiples of 10 :  ");

            number = reader.nextInt();

        } while (!(number % 10 == 0));

    }
}
