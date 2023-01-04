package controlstatements;

public class ContinueStatement2 {

    public static void main(String[] args) {

        /*int n = 3343;
        boolean isPrime = false;

        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                isPrime = false;
                break;
            }else{
            isPrime = true;
            }
        }
        
        if(isPrime){
        System.out.println(n + " is a prime number");
        }else{
        System.out.println(n + " is not a prime number");
        }*/

        int ary[] = {15, 2, 10, 37, 60, 44,67, 30};
        
        outer:
        for (int i = 0; i < ary.length; i++) {

            for (int j = 2; j < ary[i]; j++) {
                if (ary[i] % j == 0) {
                    continue outer;
                }
            }
            
            System.out.println(ary[i]);
        } 
    }

}
