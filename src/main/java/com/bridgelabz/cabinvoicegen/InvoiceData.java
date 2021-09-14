package com.bridgelabz.cabinvoicegen;

public class InvoiceData {
	 public final double distance;
	 public final int time;
	 public final int id;

	 public InvoiceData(int id, double distance, int time)
	 {
		 this.distance=distance;
		 this.time=time;
		 this.id = id;
	 }

	@Override
	public String toString() {
		return "InvoiceData [distance=" + distance + ", time=" + time + ", id=" + id + "]";
	}
	 
}
