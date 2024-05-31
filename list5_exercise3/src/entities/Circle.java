package entities;

public class Circle {
	private double radius;
	private static double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double calcArea(double radius) {
		return PI*Math.pow(radius, 2);
	}
	
	public double calcPerimeter(double radius) {
		return 2*PI*radius;
	}
	
}
