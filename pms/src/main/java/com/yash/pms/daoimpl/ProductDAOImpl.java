package com.yash.pms.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.pms.dao.ProductDAO;
import com.yash.pms.model.Product;
import com.yash.pms.util.JDBCUtil;

public class ProductDAOImpl extends JDBCUtil implements ProductDAO {

	@Override
	public void save(Product product) {
		
		try {
			String sql="insert into products (name,price) values(?,?)";
			PreparedStatement preparedStatement=JDBCUtil.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, Integer.parseInt(product.getPrice()));
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				System.out.println("Product is inserted");
			}else {
				System.out.println("Product is not inserted");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Product> findAll() {
		List<Product> list=new ArrayList<Product>();
		try {
			String sql="select * from products";
			PreparedStatement preparedStatement=JDBCUtil.prepareStatement(sql);
			ResultSet rs=preparedStatement.executeQuery();  

			while(rs.next()){  
				list.add(new Product(rs.getInt(1),rs.getString(2),Integer.toString(rs.getInt(3))));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public void update(Product product) {
		try {
		String sql="update products set name=(?),price=(?) where id=(?)";
		PreparedStatement preparedStatement=JDBCUtil.prepareStatement(sql);
		preparedStatement.setString(1, product.getName());
		preparedStatement.setInt(2, Integer.parseInt(product.getPrice()));
		preparedStatement.setInt(3, product.getId());
		int i=preparedStatement.executeUpdate();
		if(i!=0) {
			System.out.println("Product is updated");
		}else {
			System.out.println("Product is not updated");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

	@Override
	public void delete(int id) {
		try {
			String sql="delete from products where id =(?)";
			PreparedStatement preparedStatement=JDBCUtil.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			preparedStatement.executeUpdate();  
			System.out.println("product deleted.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public Product findProductsById(Long id) {
		Product product=new Product();
		try {
			String sql="select * from products where id =(?)";
			PreparedStatement preparedStatement=JDBCUtil.prepareStatement(sql);
			preparedStatement.setLong(1,id);
			ResultSet rs=preparedStatement.executeQuery();  

			while(rs.next()){  
				product=new Product(rs.getInt(1),rs.getString(2),Integer.toString(rs.getInt(3)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return product;
	}

}
