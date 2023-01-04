package classesandobjects;

import java.util.Scanner;

public class ClassesAndObjects {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int c;

        Maths obj = new Maths(10, 40);
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter 1 for a + b");
        System.out.println("Enter 2 for a - b");
        System.out.println("Enter 3 for a * b");
        System.out.println();
        System.out.print("Enter : ");

        int option = reader.nextInt();

        switch (option) {
            case 1:
                c = obj.addition();
                System.out.println(c);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;
                
            default:
                System.out.println("Invalid entry");
        }
    }
}
