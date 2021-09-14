package com.bridgelabz.cabinvoicegen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CabInvoiceTest {
	@Test
	public void givenDistanceandTime_ShouldReturnFare()
	{
		CabInvoice cab = new CabInvoice();
		double distance = 10.0;
		double time = 10.0;
		double fare = cab.calculateFare(distance, time);
		assertEquals(110, fare, 0.0);
	}
	
	 @Test
	 public void givenMultipleRides_ShouldReturnFare() {
	    CabInvoice cab = new CabInvoice();
	    
	    InvoiceData[] ride={
	    		new InvoiceData(10.0,5),
	        	new InvoiceData(2.0,1)
	    };
	    double fare=cab.calculateFare(ride);
	    assertEquals(126,fare,0.0);
	}
}
