package day1.ifElse;

public class Example7 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if (x == y)
		{
			System.out.println("Both are Equal");
		}
		else {
			if(x > y)
			{
				System.out.println("Maximum is " + x);
			}
			else
			{
				System.out.println("Maximum is " + y);
			}
		}
	}
}
