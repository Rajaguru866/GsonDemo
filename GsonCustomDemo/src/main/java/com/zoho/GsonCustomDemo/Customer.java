package com.zoho.GsonCustomDemo;

import java.util.List;

public class Customer {

	
	private String customerName;
	private String customerId;
	private List<Charge> charges;
	private String currency;
	
	
	public Customer(String customerName, String customerId, String currency, List<Charge> charge) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.currency = currency;
		this.charges = charge;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public List<Charge> getCharges() {
		return charges;
	}
	
	public void addCharge(Charge charg)
	{
		charges.add(charg);
	}
	public void addCharges(List<Charge> list)
	{
		this.charges = list;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", charges=" + charges
				+ ", currency=" + currency + "]";
	}
	
	
	
	
	
}
