package day2.methods;

public class Example7 {
	public void displayNamesArray(String[] names) {
		for(String x : names) {
			System.out.println(x);
		}
	}
	
	public String[] getArrayOfNames() {
		String[] names = {"John", "David", "Patrick", "Derek"};
		return names;
	}
	
}
