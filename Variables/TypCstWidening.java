public class TypCstWidening{
    public static void main(String[] args) {

	//byte to int

	byte b = 10;
	int i = b;

	System.out.println("Byte to int : "+ i);

	//Long to float

	long L = 9223372036854775805L;
	float f = L;

	System.out.println("long to float : "+ f);

	//Char to double

	char c = 'A';
	double d = c;

	System.out.println("char to double : "+ d);

    }
}