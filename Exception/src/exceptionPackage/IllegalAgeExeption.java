package exceptionPackage;

public class IllegalAgeExeption extends Exception {
	IllegalAgeExeption(String s) {
		super(s);
	}
	
	public static int ageLimit(){
		return 18;
	}
}
