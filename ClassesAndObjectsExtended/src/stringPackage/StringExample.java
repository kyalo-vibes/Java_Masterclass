package stringPackage;

public class StringExample {

    public static void main(String[] args) {

        //String str = "apple";

        char data[] = {'a', 'p', 'p', 'l', 'e'};
        String str = new String(data);
        
        System.out.println(str);

        System.out.println("Length of the string is -> " + str.length());

        System.out.println("String converted to upper case -> " + str.toUpperCase());

        System.out.println("Replace letter 'p' with 'f' -> " + str.replace('p', 'f'));

        System.out.println("Get position of first occurace of P -> " + str.indexOf('p'));

        System.out.println("Get sub string from first occurance letter P to end the of string -> " + str.substring(str.indexOf('p')));

        System.out.println("Get sub string from last occurance letter P to end the of string -> " + str.substring(str.lastIndexOf('p')));

        //https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    }
}
