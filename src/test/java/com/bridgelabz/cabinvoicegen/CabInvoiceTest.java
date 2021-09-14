package com.bridgelabz.cabinvoicegen;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
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
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
    	CabInvoice cab=new CabInvoice();
        HashMap<Integer,Invoice> users=new HashMap<Integer, Invoice>();

        InvoiceData[] ride1={new InvoiceData(1,10.0,5),new InvoiceData(1,2.0,1)};
        InvoiceData[] ride2={new InvoiceData(2,5,5),new InvoiceData(2,11,10),new InvoiceData(2,7,3)};
        Invoice fare1=cab.calculateFare(ride1);
        Assert.assertEquals("Invoice [noOFRides=2, totalFare=126.0, avgFare=63.0]",cab.findFareOfGivenId(1));
        Invoice fare2=cab.calculateFare(ride2);
        Assert.assertEquals("Invoice [noOFRides=3, totalFare=248.0, avgFare=82.66666666666667]",cab.findFareOfGivenId(2));

    }
}