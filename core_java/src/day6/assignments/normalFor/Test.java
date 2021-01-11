package day6.assignments.normalFor;
import java.util.*;


public class Test {
	public static void main(String[] args) {
		
		SmartPhone smartphone1 = new SmartPhone("OnePlus", 27999);
		SmartPhone smartphone2 = new SmartPhone("Nokia", 17999);
		SmartPhone smartphone3 = new SmartPhone("Iphone", 127999);
		SmartPhone smartphone4 = new SmartPhone("Redmi", 13999);
		
		ArrayList<SmartPhone> smartPhone = new ArrayList<SmartPhone>();
		
		smartPhone.add(smartphone1);
		smartPhone.add(smartphone2);
		smartPhone.add(smartphone3);
		smartPhone.add(smartphone4);
		
//		for (SmartPhone s : smartPhone) {
//			System.out.println(s);
//		}
		
		for (int i = 0; i < smartPhone.size(); i++) {
			System.out.println(smartPhone.get(i));
		}
		
		
		
	}
}
