package exceptionPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTemp {

	public String example() {
		return "example method called";
	}

	public void method2(ExceptionTemp obj) throws NullPointerException{
			
			obj.example();
		
	}
}
