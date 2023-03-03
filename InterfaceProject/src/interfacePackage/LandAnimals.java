package interfacePackage;

public interface LandAnimals extends Animal {

	void breath();
	
	default void makeNoise(){
		System.out.println("Making noise..");
	}

}
