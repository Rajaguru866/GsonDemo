package com.zoho.GsonDemoProject;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;

public class Customer {

	@Since(1.0)
	@Expose(serialize = true, deserialize = true)
	private String customerName;
	@Since(1.1)
	@Expose(serialize = false, deserialize = false)
	private String customerId;
	@Expose(serialize = true, deserialize = true)
	private List<Charge> charges;
	@Since(1.3)
	@Expose(serialize = true, deserialize = true)
	private String currency;
	
	public Customer() {
	}
	public Customer(String customerName, String customerId, String currency) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.currency = currency;
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
