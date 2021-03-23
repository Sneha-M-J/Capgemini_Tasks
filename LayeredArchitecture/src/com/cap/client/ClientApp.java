package com.cap.client;

import java.util.Scanner;

import com.cap.bean.Product;
import com.cap.service.IProductService;
import com.cap.service.ProductServiceImpl;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		IProductService productService=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter product id");
		int productId=sc.nextInt();
		
		System.out.println("Enter product quantity");
		int quantity=sc.nextInt();
		
		int totalPrice=0;
		Product product=productService.getProductById(productId);
		if(product!=null)
		{
			System.out.println("Product found");
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getCategory());
			System.out.println(product.getPrice());
			
			product.setQuantity(quantity);
			totalPrice=product.getQuantity()*product.getPrice();
			System.out.println(totalPrice);
		}
		else
		{
			System.out.println("No product found");
		}
	}

}
