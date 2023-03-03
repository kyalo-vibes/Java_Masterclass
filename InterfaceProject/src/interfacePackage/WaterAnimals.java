package interfacePackage;

public interface WaterAnimals extends Animal {

	void breath();
	
	default void makeNoise(){
		System.out.println("Making noise from water..");
	}
	
	static void staticMeth(){
		System.out.println("Interface Static method");
	}
	
}
