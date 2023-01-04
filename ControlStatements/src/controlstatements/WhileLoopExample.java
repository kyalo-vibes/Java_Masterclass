package controlstatements;

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("In how many attempts does the car start");
        int attempts = reader.nextInt();

        int count = 1;
        int maxAttempts = 10;

        while (count <= maxAttempts) {
            System.out.println("Robot is attempting to start the car. Attempt " + count);

            if (count == attempts) {
                System.out.println("Robot successfully started the car in " + count + " attempts.");
                break;
            }
            if (count == maxAttempts) {
                System.out.println("Robot has failed to start the car");
            }

            count++;
        }

        /* 
        while(expr){
        Statements;
        }
         */
        
        /* EXAMPLES
        
        //If you wanted to maintain the backup of files in a directory
        while(ture){
        if(is new file present){
            Copy file to backup server;
            }  
        wait for one hour;
        }
        
        //If you want to read a file till the end of file
        while(!end of file){
        Copy the line;
        }   
        
        //If you want to perform animation in gaming
        while(true)
        {
        Keep walking;
        
        if(user pressed exit)
        break;        
        }
         */
    }
}
