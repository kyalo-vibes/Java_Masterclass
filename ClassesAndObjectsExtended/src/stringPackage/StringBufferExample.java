package stringPackage;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer strBuff = new StringBuffer("I am able to");
        strBuff.append(" append this string");
        System.out.println(strBuff);
        
        //The above code will have better prformace than
        System.out.println("I am able to"+" append this string");
        
        strBuff.insert(10, "SOMETEXT INSERTED");
        System.out.println(strBuff);
        
        strBuff.reverse();
        System.out.println(strBuff);
        
        strBuff.toString(); //Make it immutable once all the operations are done

        //https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
    }
}
