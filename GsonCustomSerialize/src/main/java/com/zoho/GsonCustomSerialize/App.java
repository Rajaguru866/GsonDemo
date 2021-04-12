package com.zoho.GsonCustomSerialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App 
{
    public static void main( String[] args )
    {
        Book classic = new ClassicBook("Harry Potter", "J.K.Rowling", "Ellie", 8, 4999.00, 3000);
        Book comic = new ComicBook("Batman", "Bob Kane", "John", 5, 3500.00, 2500);
        Book.setPublisher("Westland");
        Book.setOfficeAddress("654, Richardson Street, Newyork");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        gb.serializeNulls();
        gb.registerTypeAdapter(ClassicBook.class, new CustomSerializer());
        gb.registerTypeAdapter(ComicBook.class, new CustomSerializer());
        gb.registerTypeAdapter(ClassicBook.class, new CustomDeserializer());
        gb.registerTypeAdapter(ComicBook.class, new CustomDeserializer());
        Gson gson = gb.create();
        String jsonClassic = gson.toJson(classic);
        System.out.println(jsonClassic);
        String jsonComic = gson.toJson(comic);
        System.out.println(jsonComic);
        Book.setPublisher("");
        Book.setOfficeAddress("");
        Book classic1 = gson.fromJson(jsonClassic, ClassicBook.class);
        Book comic1 = gson.fromJson(jsonComic, ComicBook.class);
        System.out.println(classic1);
        System.out.println(comic1);
    
         
    }
}
