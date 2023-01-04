package controlstatements;

import java.util.Scanner;

public class IfElseIfExample {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Your Chess Rating");
        int rating = reader.nextInt();

        if (rating >= 2200 && rating < 2300) {
            System.out.println("Candidate Master!");
        } else if (rating >= 2300 && rating < 2400) {
            System.out.println("FIDE Master!");
        } else if (rating >= 2400 && rating < 2500) {
            System.out.println("International Master!");
        } else if (rating >= 2500 && rating < 3500) {
            System.out.println("Grandmaster!");
        } else if (rating < 2200) {
            System.out.println("Future Grandmaster!");
        } else {
            System.out.println("Human Computer!");
        }

        /* 
        if (boolean Exp) {
            Statements;
        } else if (boolean Exp) {
            Statements;
        } else if (boolean Exp) {
            Statements;
        } else {
            Statements;
        }
         */
    }
}
