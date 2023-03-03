package exceptionPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample1 {

	public static void main(String[] args) {
		ExceptionTemp obj = new ExceptionTemp();

/*		System.out.println("something");
		System.out.println("something");
		method(null);
		System.out.println("something");
		System.out.println("something");*/
		newMethRec();
	}
	
	static void newMethRec(){
		try {
			FileReader file = new FileReader("C:\\Users\\Admin\\Desktop\\Todos.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void method(ExceptionTemp obj) {
		method2(obj);
	}

	static void method2(ExceptionTemp obj) {
		try {
			System.out.println(obj.example());
			System.out.println(obj.example());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
