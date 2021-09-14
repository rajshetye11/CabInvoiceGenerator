package com.bridgelabz.cabinvoicegen;

public class Invoice {
	public int noOFRides;
	public double totalFare;
	public double avgFare;
	
	public Invoice(int noOFRides, double totalFare) {
		this.noOFRides = noOFRides;
		this.totalFare = totalFare;
		this.avgFare = this.totalFare/this.noOFRides;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice inv = (Invoice) obj;
		return avgFare==inv.avgFare && noOFRides == inv.noOFRides && totalFare == inv.totalFare;
	}

	@Override
	public String toString() {
		return "Invoice [noOFRides=" + noOFRides + ", totalFare=" + totalFare + ", avgFare=" + avgFare + "]";
	}
	
}
