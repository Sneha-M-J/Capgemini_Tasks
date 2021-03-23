package com.cap.dao;

import java.util.Map;

import com.cap.bean.Product;
import com.cap.util.CollectionUtil;

public class ProductDaoImpl implements IProductDao 
{
	CollectionUtil util=new CollectionUtil();
	
	
	@Override
	public Product getProductByID(int id) 
	{
		Map<Integer,Product> hashMap=util.getProducts();
		Product p=hashMap.get(id);
		return p;
	}

//	@Override
//	public Product getProductByCategory(String category) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
