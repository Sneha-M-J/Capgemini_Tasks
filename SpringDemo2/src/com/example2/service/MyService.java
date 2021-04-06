package com.example2.service;

import com.example2.dao.daoInterface;

public class MyService implements ServiceInterface
{
	daoInterface dao;

	public void setDao(daoInterface dao) {
		this.dao = dao;
	}

	@Override
	public void viewWhichWay() 
	{
		dao.connect();
	}
}
