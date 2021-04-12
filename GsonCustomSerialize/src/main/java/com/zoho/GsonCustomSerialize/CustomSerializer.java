package com.zoho.GsonCustomSerialize;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CustomSerializer implements JsonSerializer<Book>{

	
	public JsonElement serialize(Book src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject json = new JsonObject();
		json.addProperty("Book Name", src.getBookName());
		json.addProperty("Author Name", src.getAuthor());
		json.addProperty("Book Price", src.getPrice());
		json.addProperty("Number of Stories", src.getStoriesCount());
		json.addProperty("Total Pages", src.getPages());
		json.addProperty("Genre", src.getGenre());
		if(src.getGenre().equalsIgnoreCase("classic"))
		{
			json.addProperty("Writer", src.getComposer());
		}
		else if(src.getGenre().equalsIgnoreCase("comic"))
		{
			json.addProperty("Artist", src.getComposer());
		}
		json.addProperty("Publisher", Book.getPublisher());
		json.addProperty("Publisher Address", Book.getOfficeAddress());
		return json;
	}

}
