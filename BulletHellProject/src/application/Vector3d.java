package application;

public class Location {
	
	private double xPos;
	private double yPos;
	private double zPos;
	
	public Location(double x, double y) {
		xPos = x;
		yPos = y;
		zPos = 0;
	}
	
	public Location(double x, double y, double z) {
		xPos = x;
		yPos = y;
		zPos = z;
	}
	
	public double getX() {
		return xPos;
	}
	
	public double getY() {
		return yPos;
	}
	
	public double getZ() {
		return zPos;
	}
	
	public double setX(double x) {
		return xPos = x;
	}
	
	public double setY(double y) {
		return yPos = y;
	}
	
	public double setZ(double z) {
		return zPos = z;
	}
	
	public double adjX(double x) {
		return xPos += x;
	}
	
	public double adjY(double y) {
		return yPos += y;
	}
	
	public double adjZ(double z) {
		return zPos += z;
	}
}
