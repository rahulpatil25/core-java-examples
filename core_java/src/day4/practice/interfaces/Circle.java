package day4.practice.interfaces;

public class Circle implements Shape{
	public double radius;
	public Circle(double r) {
		this.radius = r;
	}
		
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
}
