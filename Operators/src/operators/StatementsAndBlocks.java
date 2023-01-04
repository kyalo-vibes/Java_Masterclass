package operators;

public class StatementsAndBlocks {
    public static void main(String[] args) {
           
        //BLOCK 1 : 'a' is accessible here but not 'b' and 'c'
        char a = 'a';
        System.out.println("BLOCK 1 : " + a);
        
        { //BLOCK 2 :  'a' and 'b' are accessible here but not 'c'
            char b = 'b';
            System.out.println("BLOCK 2 : " + a + b);
            
            {//BLOCK 3 :  'a','b' and 'c' are accessible here
                char c = 'c';
                System.out.println("BLOCK 3 : " + a + b + c);
            }
        }
        
    }
}
