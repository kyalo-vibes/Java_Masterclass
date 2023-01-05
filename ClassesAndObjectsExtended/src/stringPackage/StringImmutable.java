package stringPackage;

public class StringImmutable {

    public static void main(String[] args) {

        String str = "apple";

        str.toUpperCase();

        System.out.println(str);

        String a = "qqq";
        String b = "qqq";
        System.out.println(a == b);

        String a1 = new String("www");
        String b1 = "www";
        System.out.println(a1 == b1);

        String a2 = new String("eee");
        String b2 = new String("eee");
        System.out.println(a2 == b2);

    }
}
