package com.pujitha.java;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductCatalog 
{

	ProductService productService =new ProductService();
	
	public List<String> getProductsCategories()
	{
	return productService.getProductsCategories();
	}
	public List<String> getProducts(String category)
	{
	return productService.getProducts(category);
	}
}
