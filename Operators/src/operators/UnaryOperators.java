package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        
        // Unary plus operator
        int a = +20;
        
        //Unary minus operator
        int b = -20;
        
        // Increment operator (post increment) a = a + 1
        System.out.println("a++ = " + a++);
        System.out.println("Value to 'a' post increment = " + a);
        // Increment operator (pre increment)
        System.out.println("++a = " + ++a);
        
        //Rsetting value of 'a' back to 20
        a = +20;
        
        // Decrement operator (post decrement) a = a - 1;
        System.out.println("a-- = " + a--);
        System.out.println("Value to 'a' post decrement = " + a);
        // Decrement operator (pre decrement)
        System.out.println("--a = " + --a);
        
        // Logical complement operator
        System.out.println("is a > b ? : " + (a > b));
        System.out.println("Logical complement a > b ? : " + !(a > b));
        
    }
}