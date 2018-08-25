package com.sales;

public class Product {

	private String productName;
	private long toatalsalesofthisproduct;
	private int numberofsalesofthisproduct;
	public int getNumberofsalesofthisproduct() {
		return numberofsalesofthisproduct;
	}
	public void setNumberofsalesofthisproduct(int numberofsalesofthisproduct) {
		this.numberofsalesofthisproduct = numberofsalesofthisproduct;
	}
	public long getToatalsalesofthisproduct() {
		return toatalsalesofthisproduct;
	}
	public void setToatalsalesofthisproduct(long toatalsalesofthisproduct) {
		this.toatalsalesofthisproduct = toatalsalesofthisproduct;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	public Product(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	private int productPrice;
}
