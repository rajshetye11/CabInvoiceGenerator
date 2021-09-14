package com.bridgelabz.cabinvoicegen;

public class CabInvoice {
	public static double costPerKm= 10.0;
	public static double costPerMin = 1.0;
	public static double minFare = 5.0;
	
	public double calculateFare(double distance, double time) {
		double fare = distance * costPerKm + time * costPerMin;
		return fare;
	}
	
	 public double calculateFare(InvoiceData[] data) {
	        double totalFare=0;
	        for (InvoiceData datas : data) {
	           totalFare+= this.calculateFare(datas.distance, datas.time);
	        }
	        return totalFare;
	    }
}

