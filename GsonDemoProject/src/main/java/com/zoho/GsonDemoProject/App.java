package com.zoho.GsonDemoProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class App 
{
    public static void main( String[] args )
    {
    	Customer cus1 = new Customer("Rajaguru", "cus_00001", "usd");
		Charge charg1 = new Charge("ch_00001", 2000.00, true);
		Charge charg2 = new Charge("ch_00002", 5000.00, false);
		Charge charg3 = new Charge("ch_00003", 10000.00, true);
		Charge charg4 = new Charge("ch_0004", 15000.00, true);
		List<Charge> list1 = Arrays.asList(charg1,charg2,charg3,charg4);
		cus1.addCharges(list1);
		
		
		GsonBuilder gb = new GsonBuilder();			//GsonBuilder is a predefined class used to customize the conversion
		
		gb.setPrettyPrinting();						//setPrettyPrinting() - used to convert json to good readable format
		
		gb.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES);		//Used to change the field name format during serialization
		
		gb.serializeNulls();						//normally null value will not be converted to Json, we use serualizeNulls() to explicitly convert null object to Json and store it as null.
		
		gb.setVersion(1.2);							//Field with version above 1.2 will not be available for conversion
		
		gb.excludeFieldsWithoutExposeAnnotation();		//using @Expose() annotation we can exclude certain fields, even during serialization or deserialization and field without @Expose() also gets excluded
		
		Gson gson = gb.create();					//create() - to return the gson object
		
		
		String jsonString = gson.toJson(cus1);		//toJson() - used for Serialization
		System.out.println(jsonString);
		
		Customer cust2 = gson.fromJson(jsonString, Customer.class);		//fromJson() - used for Deserialization
		System.out.println(cust2);
		
		//JsonArray to list
		
		String jsonList = gson.toJson(list1);
		System.out.println(jsonList);
		
		//to notify gson that the required type was list of type charge, we use TypeToken class
		//but, we can easily pass internal JsonArray to internal list like normal deserialization
		List<Charge> chargList = gson.fromJson(jsonList, new TypeToken<ArrayList<Charge>>() {}.getType());
		System.out.println(chargList);
				
		
    }
}
