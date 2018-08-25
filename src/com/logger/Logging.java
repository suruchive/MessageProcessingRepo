package com.logger;

import java.util.logging.Logger;

import com.sales.Sales;

public class Logging {

	public static void log(Sales detailedsalesreport )
	{
		System.out.println(detailedsalesreport.recordSales());
	}
	public static void logwithPause(String logmessage )
	{
		System.out.println(logmessage);
		System.exit(0);
	}
}
