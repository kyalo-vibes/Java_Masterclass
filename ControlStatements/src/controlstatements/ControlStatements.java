package controlstatements;

public class ControlStatements {

    public static void main(String[] args) {
        boolean carAvailable = true;
        boolean bikeAvailable = false;
        boolean truckAvailable = false;

        int count = 0;
        int maxTries = 10;
        boolean carStarted = false;
        System.out.println("Start");

        if (carAvailable) {

            while (!carStarted) {
                count++;
                System.out.println("Robot is trying to start the car");

                if (carStarted) {
                    System.out.println("Robot is going by car");
                    break;
                }

                if (count == maxTries) {
                    System.out.println("Robot given up trying to start the car");
                    System.out.println("Robot is going by walk");
                    break;
                }
            }

        } else if (bikeAvailable) {
            System.out.println("Robot is going by bike");
        } else if (truckAvailable) {
            System.out.println("Robot is going by truck");
        } else {
            System.out.println("Robot is going by walk");
        }
    }

}
