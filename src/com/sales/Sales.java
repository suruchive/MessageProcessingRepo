package com.sales;

import java.util.HashMap;

public class Sales {

	private int salesId;
	private int quantitySold;
	public int getSalesId() {
		return salesId;
	}
	public void setSalesId(int i) {
		this.salesId=i;
	}
	private Product productSold;
	
	
	public String recordSales()
	{
	 	//String 
		return null;
	}
	 public Sales(int salesId, Product productSold, int quantitySold) {
		super();
		this.salesId = salesId;
		this.productSold = productSold;
		this.quantitySold= quantitySold;
		
	}
	 public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public Sales(Product productSold) {
			
		this.productSold = productSold;
		
	}

	public Sales() {
		
	}
	public Product getProductSold() {
		return productSold;
	}

}
