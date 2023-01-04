package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        
        byte a = 65; // 00000000 00000000 00000000 01000001
        
        byte b = -30; // 11111111 11111111 11111111 11100010
        
        //Unary bitwise complement
        System.out.println("~a : "+ ~a);// 11111111 11111111 11111111 10111110 = -66
        
        //Bitwise AND
        System.out.println("a & b : "+ (a & b));// 00000000 00000000 00000000 01000000 = 64
        
        //Bitwise OR
        System.out.println("a | b : "+ (a | b));// 11111111 11111111 11111111 11100011 = -29
        
        //Bitwise Exclusive OR (XOR)
        System.out.println("a ^ b : "+ (a ^ b));// 11111111 11111111 11111111 10100011 = -93
        
        //Signed left shift
        System.out.println("b << 3 : "+ (b << 4));// 11111111 11111111 11111110 00100000 = -480
        
        //Signed right shift
        System.out.println("b >> 2 : "+ (b >> 2));// 11111111 11111111 11111111 11111000 = -8
        
        //Unsigned right shift
        System.out.println("b >>> 2 : "+ (b >>> 2));// 00111111 11111111 11111111 11111000 = 1073741816
                                                          
    }
     
}