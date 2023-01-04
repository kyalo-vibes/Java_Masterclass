package controlstatements;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int i = a >> 1;
        System.out.println(i);


        Scanner reader = new Scanner(System.in);

        System.out.println("Enter 1 for a + b");
        System.out.println("Enter 2 for a - b");
        System.out.println("Enter 3 for a * b");
        System.out.println();
        System.out.print("Enter : ");

        int option = reader.nextInt();

        switch (option) {
            case 1:
                System.out.println(a + b);
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

    /*
 switch (variable) {
  case c1:
        statements // they are executed if variable == c1
        break;
  case c2: 
        statements // they are executed if variable == c2
        break;
  case c3:
  case c4:        
        statements // they are executed if variable ==  any of the above c's
        break;
  . . .
  default:
        statements // they are executed if none of the above case is satisfied
        break;
}*/
}
