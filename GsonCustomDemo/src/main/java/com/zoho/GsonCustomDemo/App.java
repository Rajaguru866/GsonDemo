package com.zoho.GsonCustomDemo;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	
		Charge charg1 = new Charge("ch_00001", 2000.00, true);
		Charge charg2 = new Charge("ch_00002", 5000.00, false);
		Charge charg3 = new Charge("ch_00003", 10000.00, true);
		Charge charg4 = new Charge("ch_0004", 15000.00, true);
		List<Charge> list1 = Arrays.asList(charg1,charg2,charg3,charg4);
		Customer cus1 = new Customer("Rajaguru", "cus_00001", "usd", list1);
		
		//Serialization
		
		GsonBuilder gb = new GsonBuilder();
		gb.setPrettyPrinting();
		gb.registerTypeAdapter(Customer.class, new CustomSerializer());
		Gson gson = gb.create();
		String customerString = gson.toJson(cus1);
		System.out.println(customerString);
		
		//Deserialization
		
		GsonBuilder gb2 = new GsonBuilder();
		gb2.setPrettyPrinting();
		gb2.registerTypeAdapter(Customer.class, new CustomDeserializer());
		Gson gson2 = gb2.create();
		Customer customer = gson2.fromJson(customerString, Customer.class);
		System.out.println(customer);
        
		
    }
}
