package com.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnit44Runner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import com.notification.AdjustmentOperation;
import com.notification.MessageNotification;
import com.sales.Product;
import com.sales.Sales;

@RunWith(MockitoJUnit44Runner.class)
class MessageServiceTest2 {

	private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Mock
    private MessageNotification messageprocessingqueue;
    public static void main(String[] args){
    	MessageServiceTest2 tester = new MessageServiceTest2();
       // tester.setUp();
        System.out.println(tester.testValue()?"pass":"fail");
     }

	private boolean testValue1() {
		MessageNotification myObject = mock(MessageNotification.class);
		final int counter = 0;

		when(myObject.fetchrecords()).then(new Answer<Result>() {
		
			@Override
			public Result answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}
		}); 
		return false;
	}

@Test
public boolean testValue() {
	
		 messageprocessingqueue = mock(MessageNotification.class);
		 Product product1=new Product("apple",10);
			Product product2=new Product("banana",20);
			Product product3=new Product("grapes",30);
			Product product4=new Product("orange",20);
			Product product5=new Product("papaya",10);
		
			Sales sale0=new Sales(product1);
			Sales sale1=new Sales(product1);
			Sales sale2=new Sales(product2);
			Sales sale3=new Sales(product1);
			Sales sale4=new Sales(product1);
			Sales sale5=new Sales(product2);
			Sales sale6=new Sales(product1);
			Sales sale7=new Sales(product1);
			Sales sale8=new Sales(product2);
			Sales sale9=new Sales(product1);
			Sales sale10=new Sales(product2);
			Sales sale11=new Sales(product1);
		
			when(messageprocessingqueue.salemessage(sale5,10)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale0))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale1,15)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale2))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale3,10)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale2))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale1)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale3,40))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale4,AdjustmentOperation.SUBTRACT,5)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale9))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale5)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale10))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale6,10)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale4,15))).thenReturn(true);
			when(messageprocessingqueue.salemessage(sale11)).thenReturn(true);
			when((messageprocessingqueue.salemessage(sale9))).thenReturn(true);
			when(messageprocessingqueue.fetchrecords()).then(new Answer<Result>() {				
				@Override
				public Result answer(InvocationOnMock invocation) throws Throwable {
					
					return null;
				}
			}); 
			
			return true;
     }


}
