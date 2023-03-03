package newPackage2;

import newPackage.Animal;

public class Cow extends Animal {

	Cow() {
		super();
	}

	public void someMeth() {
		meth();
		System.out.println(x);
	}

	public static void main(String[] args) {
		Cow cowObj = new Cow();

		cowObj.someMeth();
	}
}
