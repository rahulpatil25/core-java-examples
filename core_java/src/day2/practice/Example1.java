package day2.practice;

public class Example1 {
	public static void main(String[] args) {
		int number = 9, t = 1;
		int value;
		while (t <= 10) {
			value = number * t;
			System.out.println(number + " x " + t + " = " + value);
			t++;
		}
	}
}
