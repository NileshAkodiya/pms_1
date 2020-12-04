package com.yash.pms.helper;
/**
 * this class calls the methods present in ServiceImpl in accordance of user's choice
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.yash.pms.model.Product;
import com.yash.pms.service.ProductService;
import com.yash.pms.serviceimpl.ProductServiceImpl;

public class ProductHelper {
	Scanner scanner=new Scanner(System.in);
	Product product;
	ProductService productService=new ProductServiceImpl();
	
	/*
	 * case 1 method when user wants to insert a product into database
	 */
	
	public  void case1() {
		System.out.println("Enter the product name:");
		String name=scanner.next();
		System.out.println("Enter the price:");
		String price=scanner.next();
		product=new Product(1,name,price);
		productService.addProduct(product);
	}

	/*
	 * case 2 method when user wants to see all products of table products
	 */
	
	public void case2() {
		List<Product> list=new ArrayList<Product>();
		list=productService.listProduct();
		for(Product p:list) {
			System.out.println(p);
		}
		
	}

	/*
	 * case 3 method when user wants to fetch a product from 
	 */
	
	public void case3() {
		System.out.println("Enter the id:");
		Long id=scanner.nextLong();
		product=productService.findProductsById(id);
		System.out.println(product);
	}

	public void case4() {
		System.out.println("Enter the id of product you want to update:");
		int id=scanner.nextInt();
		System.out.println("Enter the new product name:");
		String name=scanner.next();
		System.out.println("Enter the new price:");
		String price=scanner.next();
		product=new Product(id,name,price);
		productService.update(product);
		
	}

	public void case5() {
		System.out.println("Enter the id of product you want to delete:");
		int id=scanner.nextInt();
		productService.removeProductById(id);
		
	}
	
}
