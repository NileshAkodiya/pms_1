package com.yash.pms.dao;

import java.util.List;

import com.yash.pms.model.Product;

/**
 * Product interface for declaring methods of CRUD
 * @author HP
 *
 */
public interface ProductDAO {
	/*
	 * this save method is used for inserting records into table products
	 */
	
	public void save(Product product);
	/*
	 * this findAll method is used for fetching records from table products
	 */
	
	public List<Product> findAll();
	/*
	 * this update method is used for updating records into table products
	 */
	
	public void update(Product product);
	/*
	 * this delete method is used for deleting records from table products
	 */
	
	public void delete(int id);
	

	public Product findProductsById(Long id);
	
}
