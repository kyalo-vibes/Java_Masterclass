package interfacePackage;

public class EnumExample {

	public static void main(String[] args) {

		EnumExample obj = new EnumExample();
		//obj.turn(Direction.EAST);
		//System.out.println(DirectionConstants.EAST);
		//System.out.println(Direction.EAST.ordinal());
		
		for(int i = 0;i < Direction.values().length; i++){
			System.out.println(Direction.values()[i].getDegree());
		}
		
	}

	public void turn(Direction dir) {
		switch (dir) {
		case EAST:
			System.out.println("Turn east");
			break;
		case WEST:
			System.out.println("Turn west");
			break;
		case SOUTH:
			System.out.println("Turn south");
			break;
		case NORTH:
			System.out.println("Turn north");
			break;
		default:
			System.out.println("Dont turn");
			break;
		}
	}

}
