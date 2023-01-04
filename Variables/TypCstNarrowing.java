public class TypCstNarrowing{
    public static void main(String[] args) {

	byte b1 = 10;

	System.out.println("auto int to byte : "+ b1);

	int a = 10;
	byte b2 = (byte)a;

	System.out.println("auto int to byte : "+ b2);
    }
}