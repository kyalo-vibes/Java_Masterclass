package controlstatements;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("In how many attempts does the car start");
        int attempts = reader.nextInt();

        int maxAttempts = 10;

        for (int count = 1; count <= maxAttempts; count++) {
            System.out.println("Robot is attempting to start the car...");

            if (count == attempts) {
                System.out.println("Robot successfully started the car in " + count + " attempts.");
                break;
            }
            if (count == maxAttempts) {
                System.out.println("Robot has failed to start the car");
            }
        }

        /*        for (initialization; termination;increment) {
            statements;
        } */
    }
}
