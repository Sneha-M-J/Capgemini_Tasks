package com.cg.dao;

import org.springframework.stereotype.Component;

@Component
public class JDBCImpl implements IDao {

	@Override
	public void connect() {

		System.out.println("jdbc connection");
	}

}
