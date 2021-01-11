package day1.strings;

public class Example7 {
	public static void main(String[] args) {
		short s = 65;
        char c = (char) s;
        System.out.println(s+"  "+c);

        char c1 = '1';
//        int i = (int) c1;
        int i = Character.getNumericValue(c1);
        System.out.println(c1+"  "+i);

        // this for narrowing casting
        float num = 2.88f;
        int myint = (int) num;
        System.out.println(num+" "+ myint);

        double value = 22.2;
        char c2 = (char) value;
        System.out.println(value+"  "+c2);

        short s2 = 224;
        byte  b = (byte) s2;
        System.out.println(s2+"  "+b);
	}
}
