package com.cap.service;

import com.cap.bean.Product;
import com.cap.dao.IProductDao;
import com.cap.dao.ProductDaoImpl;

public class ProductServiceImpl implements IProductService {

	IProductDao productDao=new ProductDaoImpl();
	
	@Override
	public Product getProductById(int id) 
	{
		return productDao.getProductByID(id);
	}

}
