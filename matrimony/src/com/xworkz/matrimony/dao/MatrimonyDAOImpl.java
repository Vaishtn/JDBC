package com.xworkz.matrimony.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.matrimony.dto.DTO;
import  static com.xworkz.matrimony.constant.Constants.*;


public class MatrimonyDAOImpl implements MatrimonyDAO{
	DTO dto=new DTO();
	@Override
	public DTO getById(int id) {
		try {
		Connection con=	DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
		System.out.println("Connecting...");
		Statement stmt=con.createStatement();
		ResultSet resultSet=stmt.executeQuery("SELECT * FROM matrimony.bride where id= "+id);
		resultSet.next();
		dto.setId(resultSet.getInt(1));
		dto.setName(resultSet.getString(2));
		dto.setAge(resultSet.getInt(3));
		dto.setWeight(resultSet.getDouble(4));
		dto.setHeight(resultSet.getDouble(5));
		dto.setQualification(resultSet.getString(6));
		dto.setSalary(resultSet.getString(7));
		dto.setAddress(resultSet.getString(8));
		dto.setPhoneNo(resultSet.getString(9));
		
	
		}catch(SQLException e) {
			System.out.println("Failed to connect to database");

		}
		return dto;
	}
	@Override
	public DTO getAllBride() {
		try {
			Connection con=DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connecting...");
			Statement stmt=con.createStatement();
			ResultSet resultSet1=stmt.executeQuery("SELECT * FROM matrimony.bride ");
			while(resultSet1.next()) {
			dto.setId(resultSet1.getInt(1));
			dto.setName(resultSet1.getString(2));
			dto.setAge(resultSet1.getInt(3));
			dto.setWeight(resultSet1.getDouble(4));
			dto.setHeight(resultSet1.getDouble(5));
			dto.setQualification(resultSet1.getString(6));
			dto.setSalary(resultSet1.getString(7));
			dto.setAddress(resultSet1.getString(8));
			dto.setPhoneNo(resultSet1.getString(9));
			System.out.println(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection is failed");
		}
		return dto;
	}

}
