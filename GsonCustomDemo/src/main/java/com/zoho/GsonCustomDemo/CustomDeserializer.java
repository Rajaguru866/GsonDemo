package com.zoho.GsonCustomDemo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class CustomDeserializer implements JsonDeserializer<Customer>{

	public Customer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		JsonObject jsonObj = json.getAsJsonObject();
		JsonArray jsonChargList = jsonObj.get("Charges").getAsJsonArray();
		List<Charge> chargList = new ArrayList<Charge>();
		for(JsonElement jsonElement : jsonChargList)
		{
			JsonObject jsonCharg = jsonElement.getAsJsonObject();
			Charge charg = new Charge(
					jsonCharg.get("Charge_Id").getAsString(),
					jsonCharg.get("Amount").getAsDouble(),
					jsonCharg.get("Status").getAsBoolean());
			chargList.add(charg);
		}
		
		
		Customer cust = new Customer(
				jsonObj.get("Customer_Name").getAsString(),
				jsonObj.get("Customer_Id").getAsString(),
				jsonObj.get("Currency").getAsString(),
				chargList);
				
				
		return cust;
	}

}

