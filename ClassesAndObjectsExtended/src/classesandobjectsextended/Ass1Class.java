package classesandobjectsextended;

import java.util.Scanner;

public class Ass1Class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int myInt = sc.nextInt();
        sc.close();
        System.out.println("The factorial of " + myInt + " is "+ factorial(myInt));

    }

    static int factorial(int a){
        if (a == 1){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }


}
