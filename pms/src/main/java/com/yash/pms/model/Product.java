package com.yash.pms.model;
/**
 * 
 * @author HP
 *
 */
public class Product {
	/*
	 * Id of Product
	 */
	int id;


	/*
	 * Name of Product
	 */
	String name;


	/*
	 * price of Product
	 */
	String price;


	public Product(int id, String name, String price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public Product() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


}
