package interfacePackage;

public class Frog implements LandAnimals,WaterAnimals{

	@Override
	public void breath() {
		System.out.println("Breathing..");
		
	}
	
	@Override
	public void makeNoise(){
		WaterAnimals.super.makeNoise();
	}

}
