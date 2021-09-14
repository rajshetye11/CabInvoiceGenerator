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
}
