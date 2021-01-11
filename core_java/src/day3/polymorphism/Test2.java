package day3.polymorphism;

public class Test2 {
	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		shapes.render();
		
		Square squares = new Square();
		squares.render();
		
		Triangle triangles = new Triangle();
		triangles.render();
		
	}
}
