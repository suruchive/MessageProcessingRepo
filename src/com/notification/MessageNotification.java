package com.notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.sales.Product;
import com.sales.Sales;

public class MessageNotification {
	
	private int noOfOccurances;
	private Map <Integer,Sales> salesinformation=new ConcurrentHashMap<Integer,Sales>();
	private int saleid=0;
	private static int count;
	
	public boolean salemessage(Sales s)
	{
		try
		{
		s.getProductSold().setNumberofsalesofthisproduct(s.getProductSold().getNumberofsalesofthisproduct()+1);
		this.noOfOccurances=1;
		s.setSalesId(saleid);
		s.setQuantitySold(noOfOccurances);
		salesinformation.put(saleid,s);
		saleid++;
		
		if(saleid==10)
		{
			showrecords();
			saleid=0;
			
		}
		
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean salemessage(Sales s, int noOfOccurances)
	{
		try
		{
		s.getProductSold().setNumberofsalesofthisproduct(s.getProductSold().getNumberofsalesofthisproduct()+1);
		s.setSalesId(saleid);
		s.setQuantitySold(noOfOccurances);
		salesinformation.put(saleid, s);
		saleid++;
		
		if(saleid==10)
		{
			showrecords();
			saleid=0;
			
		}
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean salemessage(Sales s,AdjustmentOperation opr, int price)
	{	
		
	try
	{
		for (Sales sale : salesinformation.values()) {
			if(sale.getProductSold()!=null && s.getProductSold()!=null)
			{
				if(s.getProductSold().equals(sale.getProductSold()))
				{
					if(opr.name().equals("ADD"))
					{
						sale.getProductSold().setProductPrice(sale.getProductSold().getProductPrice()+price);

					}
					else if(opr.name().equals("MULTIPLY"))
					{
						sale.getProductSold().setProductPrice(sale.getProductSold().getProductPrice()*price);
					}
					else if(opr.name().equals("SUBTRACT"))
					{
						if(price<=sale.getProductSold().getProductPrice())
							sale.getProductSold().setProductPrice(sale.getProductSold().getProductPrice()-price);
					}

				}
			}

		}
		return true;
	}
	catch(Exception e)
			{
				return false;
			}
	}

public void showrecords ()
{
		count++;
		if(count==5)
		{
			System.out.println("Application is pausing.....dont enter new messages ");
			System.exit(0);
		}
		System.out.println("Log report: ");
		System.out.println("=================================== ");
		Set<Product> setToReturn=fetchrecords();
		for (Product product : setToReturn) {
		System.out.println(product.getProductName());	
		System.out.println("Total Number of Sales involving this product= "+product.getNumberofsalesofthisproduct());
		System.out.println("Total sales Amount of this product= "+product.getToatalsalesofthisproduct());	
		product.setNumberofsalesofthisproduct(0);
		}

	
}

	public Set<Product> fetchrecords() {
	
		final Set<Product> setToReturn = new HashSet<Product>();
		final Set<Product> set1 = new HashSet<Product>();
		
		for (Sales sale : salesinformation.values()) {
			
			if (!set1.add(sale.getProductSold())) {
				setToReturn.add(sale.getProductSold());
				sale.getProductSold().setToatalsalesofthisproduct(sale.getProductSold().getToatalsalesofthisproduct()+(sale.getProductSold().getProductPrice()*sale.getQuantitySold()));
			
			}
			else
			{
				setToReturn.add(sale.getProductSold());
				long salestoadd= sale.getProductSold().getToatalsalesofthisproduct();
				sale.getProductSold().setToatalsalesofthisproduct((sale.getProductSold().getProductPrice()*sale.getQuantitySold())+salestoadd);
			}
			}
		return  setToReturn;
		
	}
	
}
