package com.zoho.GsonDemoProject;

import com.google.gson.annotations.Expose;

public class Charge {

	@Expose(serialize = true, deserialize = true)
	private String charge_id;
	@Expose(serialize = true, deserialize = true)
	private double amount;
	@Expose(serialize = true, deserialize = true)
	private boolean status;
	public Charge(String charge_id, double amount, boolean status) {
		this.charge_id = charge_id;
		this.amount = amount;
		this.status = status;
	}
	public String getCharge_id() {
		return charge_id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public boolean getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Charge [charge_id=" + charge_id + ", amount=" + amount + ", status=" + status + "]";
	}
	
	
}
