package day4.innerClasses;

public class Test {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass.x);
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass.y);
		
	}
}
