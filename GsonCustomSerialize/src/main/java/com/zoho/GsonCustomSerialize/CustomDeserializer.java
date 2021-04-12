package com.zoho.GsonCustomSerialize;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class CustomDeserializer implements JsonDeserializer<Book> {

	public Book deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		String genre;
		Book book = null;
		JsonObject jsonObj = json.getAsJsonObject();
		genre = jsonObj.get("Genre").getAsString();
		if(genre.equalsIgnoreCase("classic"))
		{
			book = new ClassicBook();
			book.setComposer(jsonObj.get("Writer").getAsString());
		}
		else if(genre.equalsIgnoreCase("comic"))
		{
			book = new ComicBook();
			book.setComposer(jsonObj.get("Artist").getAsString());
		}
		book.setAuthor(jsonObj.get("Author Name").getAsString());
		book.setBookName(jsonObj.get("Book Name").getAsString());
		book.setPages(jsonObj.get("Total Pages").getAsInt());
		book.setPrice(jsonObj.get("Book Price").getAsDouble());
		book.setStoriesCount(jsonObj.get("Number of Stories").getAsInt());
		Book.setOfficeAddress(jsonObj.get("Publisher Address").getAsString());
		Book.setPublisher(jsonObj.get("Publisher").getAsString());
		return book;
	}
	

}
