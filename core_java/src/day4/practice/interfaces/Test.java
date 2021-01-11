package day4.practice.interfaces;

public class Test {
	public static void main(String[] args) {
		Shape c = new Circle(5);
		c.draw();
		
		System.out.println("Area: " + c.getArea());
		
	}
}
