package com.pujitha.java;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List <String> booksList= new ArrayList<>();
	List <String> musicList= new ArrayList<>();
	List <String> moviesList= new ArrayList<>();
	
	public ProductService()
	{
		musicList.add("Classical");
		musicList.add("opera");
		booksList.add("Revolution2020");
		booksList.add("Fault In our Stars");
		moviesList.add("Titanic");
		moviesList.add("Passengers");	
	}
	
	
	public List<String> getProductsCategories()
	{
		List <String> categories= new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
		
	}
	public List<String> getProducts(String category)
	{
		switch(category.toLowerCase())
		{
		case "books":
			return booksList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
	      }
		return null;
	}
	
}
