package com.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.notification.AdjustmentOperation;
import com.notification.MessageNotification;
import com.sales.Product;
import com.sales.Sales;

public class MessageSender {

	static int MAX_SIZE=50;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Product product1=new Product("apple",10);
		Product product2=new Product("banana",20);
		Product product3=new Product("grapes",30);
		Product product4=new Product("orange",20);
		Product product5=new Product("papaya",10);
		Map <Integer,Sales> MessageNotifications=new LinkedHashMap<Integer,Sales>();//to maintain the order of 
		MessageNotification messageprocessingqueue= new MessageNotification();
		Sales sale0=new Sales(product1);
		Sales sale1=new Sales(product1);
		Sales sale2=new Sales(product2);
		Sales sale3=new Sales(product1);
		Sales sale4=new Sales(product4);
		Sales sale5=new Sales(product3);
		Sales sale6=new Sales(product2);
		Sales sale7=new Sales(product5);
		Sales sale8=new Sales(product2);
		Sales sale9=new Sales(product3);
		Sales sale10=new Sales(product3);
		Sales sale11=new Sales(product2);
		Sales sale12=new Sales(product5);
		Sales sale13=new Sales(product2);
		Sales sale14=new Sales(product3);
		Sales sale15=new Sales(product3);
		Sales sale16=new Sales(product2);
		Sales sale17=new Sales(product5);
		Sales sale18=new Sales(product2);
		Sales sale19=new Sales(product3);
		Sales sale20=new Sales(product3);
		Sales sale21=new Sales(product3);
		Sales sale22=new Sales(product3);
		messageprocessingqueue.salemessage(sale0,20);
		messageprocessingqueue.salemessage(sale1);
		messageprocessingqueue.salemessage(sale2,AdjustmentOperation.ADD,30);
		messageprocessingqueue.salemessage(sale3,40);
		messageprocessingqueue.salemessage(sale4,AdjustmentOperation.SUBTRACT,5);
		messageprocessingqueue.salemessage(sale5,15);
		messageprocessingqueue.salemessage(sale6,20);
		messageprocessingqueue.salemessage(sale7,50);
		messageprocessingqueue.salemessage(sale8,20);
		messageprocessingqueue.salemessage(sale9);
		messageprocessingqueue.salemessage(sale10,AdjustmentOperation.ADD,30);
		messageprocessingqueue.salemessage(sale14,40);
		messageprocessingqueue.salemessage(sale15,AdjustmentOperation.SUBTRACT,5);
		messageprocessingqueue.salemessage(sale16,15);
		messageprocessingqueue.salemessage(sale17,20);
		messageprocessingqueue.salemessage(sale8,50);
		messageprocessingqueue.salemessage(sale10,20);
		messageprocessingqueue.salemessage(sale2);
		messageprocessingqueue.salemessage(sale3,AdjustmentOperation.ADD,30);
		messageprocessingqueue.salemessage(sale4,40);
		messageprocessingqueue.salemessage(sale5,AdjustmentOperation.SUBTRACT,5);
		messageprocessingqueue.salemessage(sale6,15);
		messageprocessingqueue.salemessage(sale7,20);
		messageprocessingqueue.salemessage(sale8,50);
		messageprocessingqueue.salemessage(sale9);
		messageprocessingqueue.salemessage(sale10,AdjustmentOperation.ADD,10);
		messageprocessingqueue.salemessage(sale5,5);
		messageprocessingqueue.salemessage(sale6,10);
		messageprocessingqueue.salemessage(sale7,20);
		messageprocessingqueue.salemessage(sale8,10);
		
		//messageprocessingqueue.showrecords();
		
		
	}
}
