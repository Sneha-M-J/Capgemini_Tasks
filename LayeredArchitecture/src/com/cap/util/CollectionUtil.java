package com.cap.util;

import java.util.HashMap;
import java.util.Map;

import com.cap.bean.Product;

public class CollectionUtil 
{
	private static Map<Integer,Product> products =new HashMap<Integer,Product>();
	static
	{
		products.put(100,new Product(100,"laptop","Electroncs",78000));
		products.put(101,new Product(101,"mobile","Electroncs",46000));
		products.put(102,new Product(102,"T-shirt","cloth",1500));	
	}
	
	public static Map<Integer,Product> getProducts()
	{
		return products;
	}
}
