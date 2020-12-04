package com.yash.pms.serviceimpl;

import java.util.List;

import com.yash.pms.dao.ProductDAO;
import com.yash.pms.daoimpl.ProductDAOImpl;
import com.yash.pms.model.Product;
import com.yash.pms.service.ProductService;

public class ProductServiceImpl implements ProductService{
	private ProductDAO productDAO; 
	public ProductServiceImpl() {
		productDAO=new ProductDAOImpl();
	}
	@Override
	public void addProduct(Product product) {

		productDAO.save(product);	
	}

	@Override
	public List<Product> listProduct() {
		
		return productDAO.findAll();
	}

	@Override
	public Product findProductsById(Long id) {
		return productDAO.findProductsById(id);
	}

	@Override
	public void update(Product product) {
		productDAO.update(product);
	}
	@Override
	public void removeProductById(int id) {
		productDAO.delete(id);
	}

}
