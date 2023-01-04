package operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
           
        // Precedence Example
        System.out.println(" 10 * 6 - 3 = " + (10 * 6 - 3));
        
        // Precedence Example
        System.out.println(" 10 * (6 - 3) = " + (10 * (6 - 3)));
        
        // Precedence Example
        System.out.println(" 6 / 2 - 1 = " + (6 / 2 - 1));
        
        // Associatively Example
        System.out.println(" 10 - 3 + 5 = " + (10 - 3 + 5));
        
        // Associatively Example
        System.out.println(" 10 - 6 - 5 = " + (10 - 6 - 5));
        
        //Example
        int x = 5;
        System.out.println("10 - 4 / --x - 5 = " + (10 - 4 / --x - 5));
    }
}
