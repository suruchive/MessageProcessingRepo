package com.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.notification.AdjustmentOperation;
import com.notification.MessageNotification;
import com.sales.Product;
import com.sales.Sales;

class MessageServiceTest1 {


	private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private MessageNotification messageprocessingqueue;
	@Test
	void test() {
		messageprocessingqueue.showrecords();
		fail("Not yet implemented");
	

	}

	@Before
     public void setUp() throws UnsupportedEncodingException {
		 messageprocessingqueue = new MessageNotification();
		 Product product1=new Product("apple",10);
			Product product2=new Product("banana",20);
			Product product3=new Product("grapes",30);
			Product product4=new Product("orange",20);
			Product product5=new Product("papaya",10);
		
			Sales sale0=new Sales(product1);
			Sales sale1=new Sales(product1);
			Sales sale2=new Sales(product2);
			Sales sale3=new Sales(product1);

			messageprocessingqueue.salemessage(sale0,20);
			messageprocessingqueue.salemessage(sale1);	
			messageprocessingqueue.salemessage(sale1,15);
			messageprocessingqueue.salemessage(sale2);
			messageprocessingqueue.salemessage(sale1);
			messageprocessingqueue.salemessage(sale1,20);
     }
	 
	 @After
     public void cleanUp() {
         System.setOut(stdout);
     }

}
