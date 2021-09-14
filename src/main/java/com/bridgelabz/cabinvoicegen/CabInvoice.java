package com.bridgelabz.cabinvoicegen;

import java.util.ArrayList;
import java.util.HashMap;

public class CabInvoice {
	public static double costPerKm= 10.0;
	public static double costPerMin = 1.0;
	public static double minFare = 5.0;
	public double totalFare;
	public int number=1;
    HashMap<Integer,Invoice> users=new HashMap<Integer, Invoice>();
	
	public double calculateFare(double distance, double time) {
		double fare = distance * costPerKm + time * costPerMin;
		return fare;
	}
	
	 public Invoice calculateFare(InvoiceData[] data) {
	        totalFare=0;
	        for (InvoiceData datas : data) {
	           totalFare+= this.calculateFare(datas.distance, datas.time);
	        }
	        users.put(number,new Invoice(data.length,totalFare));
	        number++;
	        return new Invoice(data.length, totalFare);
	 }
	 
	 public String findFareOfGivenId(int i)
	    {

	        System.out.println(users.get(i));
	        return String.valueOf(users.get(i));

	    }
}
