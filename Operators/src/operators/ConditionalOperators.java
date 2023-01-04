package operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        
        int a = 20;
        
        int b = 30;
        
        int c = 100;
        
        // Conditional AND
        System.out.println("CONDITIONAL AND..");
        System.out.println("True && True = " + ((a == 20)&&(b > a)));
        System.out.println("True && False = " + ((c > b)&&(a > b)));
        System.out.println("False && True = " + ((b == 45)&&(c != a)));
        System.out.println("False && False = " + ( false &&(c > 1000)));

        // Conditional OR
        System.out.println("\nCONDITIONAL OR.. ");
        System.out.println("True || True = " + ((a == 20)||(b > a)));
        System.out.println("True || False = " + ((c > b)||(a > b)));
        System.out.println("False || True = " + ((b == 45)||(c != a)));
        System.out.println("False || False = " + ( false ||(c > 1000)));
        
        //Ternary operator - if <condition> ? "do this" else "do this"
        int minVal = a < b ? a : b;
        System.out.println("\nMinimum value between a and b using ternary operator is : " + minVal);
    }
}