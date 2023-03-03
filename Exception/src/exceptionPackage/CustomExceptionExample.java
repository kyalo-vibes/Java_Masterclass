package exceptionPackage;

public class CustomExceptionExample {

	public static void main(String[] args) {
		System.out.println("Something1");

		method(15);
		System.out.println("Something2");
		System.out.println("Something3");

	}

	static void method(int age) {
		if (age < IllegalAgeExeption.ageLimit()) {
			try {
				throw new IllegalAgeExeption("You are under age. You are not allowed to apply for driving license");
			} catch (IllegalAgeExeption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
