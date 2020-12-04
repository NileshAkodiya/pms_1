package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public List<Product> listProduct();
	public Product findProductsById(Long id);
	public void removeProductById(int id);
	public void  update	(Product product);

}
