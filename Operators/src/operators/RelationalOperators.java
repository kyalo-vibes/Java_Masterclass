package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        
        int a = 20;
        
        int b = 30;
              
        //Greater than operator - is operand 1 greater than operand 2 ?
        System.out.println("is a > b ? : " + (a > b));
                
        //Greater than or equalto operator - is operand 1 greater than or equal to operand 2 ?
        System.out.println("is a >= b ? : " + (a >= b));
        
        //Less than operator - is operand 1 less than operand 2 ?
        System.out.println("is a < b ? : " + (a < b));
        
        //Less than or equal to operator - is operand 1 less than operand 2 ?
        System.out.println("is a <= b ? : " + (a <= b));

        // Not Equals to Operator - is operand 1 not equals to operand 2 ?
        System.out.println("is a != b ? : " + (a != b));  
              
        // Equality Operator - is operand 1 equals to operand 2 ?
        System.out.println("is a == b ? : " + (a == b));
    }
}