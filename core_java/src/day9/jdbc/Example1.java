package day9.jdbc;

import java.sql.*;

import beans.Product;
import utility.DBUtil;

public class Example1 {
	public static void main(String[] args) {
		Product product1 = new Product(1, "Laptop", 78000);
		Product product2 = new Product(2, "Mobile", 30000);
		Product product3 = new Product(3, "TV", 35000);
		Product product4 = new Product(4, "Tablet", 15000);
		ProductDao example1 = new ProductDao();
//		example1.addProduct(product1);
//		example1.addProduct(product2);
//		example1.addProduct(product3);
//		example1.addProduct(product4);
		example1.getAllProducts();
		//example1.getProduct(1);
		//example1.deleteProduct(25);
//		example1.updateProduct(product3);
	}
}
