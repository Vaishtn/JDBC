package com.xworkz.ddecor.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.interior.dao.InteriorDAO;
import com.xworkz.interior.dto.InteriorDTO;

public class DecorInteriorImpl implements InteriorDAO{

	@Override
	public void create(InteriorDTO dto1) {
		System.out.println("Invoke create form ");
		System.out.println("arg:"+dto1);
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class is loaded");
			Connection jdbcConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xworkz1", "root", "root");
			// String query="insert into interior values(2,'Sanju','Shop',500,50000)";
			StringBuffer sql = new StringBuffer("insert into interior values ");
			sql.append("(").append(dto1.getHid()).append(",").append("'").append(dto1.getMestriName()).append("'")
					.append(",").append("'").append(dto1.getForWhat()).append("'").append(",")
					.append(dto1.getDimenstion()).append(",").append(dto1.getBudget()).append(")");
			System.out.println(sql.toString());

			Statement statement = jdbcConn.createStatement();
			boolean isResultSet = statement.execute(sql.toString());
			System.out.println(sql);
			jdbcConn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	@Override
	public void deleteById(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InteriorDTO fetchByMestriName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InteriorDTO updateMestriNameById(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
