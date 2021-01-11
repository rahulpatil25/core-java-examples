package day2.methods;

public class TestExample7 {
	public static void main(String[] args) {
		Example7 ex = new Example7();
//		String[] names = {"John", "David", "Patrick", "Derek"};
		String[] names = ex.getArrayOfNames();
		ex.displayNamesArray(names);
	}
}
