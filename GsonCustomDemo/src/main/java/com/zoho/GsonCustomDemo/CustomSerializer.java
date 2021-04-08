package com.zoho.GsonCustomDemo;

import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CustomSerializer implements JsonSerializer<Customer>{


	public JsonElement serialize(Customer src, Type typeOfSrc, JsonSerializationContext context) {
		
		JsonObject custJson = new JsonObject();
		custJson.addProperty("Customer_Name", src.getCustomerName());
		custJson.addProperty("Customer_Id", src.getCustomerId());
		custJson.addProperty("Currency", src.getCurrency());
		custJson.add("Charges", getChargeList(src.getCharges()));
		return custJson;
	}
	public JsonElement getChargeList(List<Charge> list)
	{
		JsonArray chargListJson = new JsonArray();
		for(Charge charg : list)
		{
			chargListJson.add((getChargeJson(charg)));
		}
		System.out.println(chargListJson);
		return chargListJson;
	}
	public JsonElement getChargeJson(Charge charge)
	{
		JsonObject chargJson = new JsonObject();
		chargJson.addProperty("Charge_Id", charge.getCharge_id());
		chargJson.addProperty("Amount", charge.getAmount());
		chargJson.addProperty("Status", charge.getStatus());
		System.out.println(chargJson);
		return chargJson;
		
	}

}
