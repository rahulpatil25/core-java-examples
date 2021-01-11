package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Product;
import utility.DBUtil;

public class ProductDao {
	public void addProduct(Product product) {
		System.out.println("Now going to insert the product into db: " + product);
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into product values(?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, product.getProductId());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getPrice());
			int result = pst.executeUpdate();
			if (result == 0) {
				System.out.println("Query Failed.");
			} else {
				System.out.println("Success");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void getAllProducts() {
		String sql = "select * from product;";
		Connection con = DBUtil.getMySqlDbConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("****************");
				System.out.println("ID: " + rs.getInt(1) + "\n"
						+ "Name: " + rs.getString(2) + "\n"
						+ "Price: " + rs.getInt(3));
				System.out.println("****************");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public void getProduct(int productId) {
		String sql = "select * from product where product_id = ?;";
		Connection con = DBUtil.getMySqlDbConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String productName = rs.getString("product_name");
				int price = rs.getInt("price");
				
				System.out.println("ID: " + productId);
				System.out.println("Name: " + productName);
				System.out.println("Price: " + price);
				
			} else {
				System.out.println("Product not available");
			}
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	public void deleteProduct(int productId) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from product where product_id = ?;";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Query Failed.");
			} else {
				System.out.println("Query performed successfully.");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		
	}
	
	public void updateProduct(Product product) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update product set product_name=?,price=? where product_id=?;";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, product.getProductName());
			pst.setInt(2, product.getPrice());
			pst.setInt(3, product.getProductId());
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Updation Failed");
			} else {
				System.out.println("Updation performed successfully");
			}
		} catch (SQLException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}
