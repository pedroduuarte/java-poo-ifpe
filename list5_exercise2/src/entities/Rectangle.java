package entities;

public class Rectangle {
	private double base;
	private double height;

	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double areaRectangle(double base, double height) {
		return base * height;
	}

	public double perimeterRectangle(double base, double height) {
		return (2 * base) + (2 * height);
	}

}
