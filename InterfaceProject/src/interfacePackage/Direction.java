package interfacePackage;

public enum Direction {
	NORTH(0), EAST(90), SOUTH(180), WEST(270);

	private int degree;

	private Direction(int d) {
		degree = d;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

}
