package day6.assignments.beanHashSet_Iterator;

import java.util.*;

public class TestBook {
	public static void main(String[] args) {
		Book book1 = new Book(951, "Think & Grow Rich", "Napoleon Hill", "Rs. 245");
		Book book2 = new Book(357, "Shoe Dog", "Phil Knight", "Rs. 400");
		Book book3 = new Book(258, "DS & A in Java", "Lafore", "Rs. 830");
		Book book4 = new Book(426, "Sapiens", "Yuval Noah Harari", "Rs. 218");
		
		Set<Book> bookSet = new HashSet<Book>();
		
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		
		Iterator<Book> iterator = bookSet.iterator();
		
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.println(book);
		}
		
	}
}
