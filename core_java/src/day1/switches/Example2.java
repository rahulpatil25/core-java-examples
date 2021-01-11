package day1.switches;

public class Example2 {
	public static void main(String[] args) {
		int weather = 2;
		
		switch(weather)
		{
			case 1: System.out.println("Sunny");
			 		break;
			case 2: System.out.println("Rainy");
	 				break;
			case 3: System.out.println("Cloudy");
	 				break;
	 		default: System.out.println("Invalid");
	 				break;
		}
	}
}
