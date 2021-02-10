package com.xworkz.matrimony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.matrimony.dto.DTO;

public class GetAllBrideApplication {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			System.out.println("Connected with data base.");
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM matrimony.bride ;");
			// it return resultset

			while (resultSet.next()) {
				DTO dto = new DTO();
				dto.setId(resultSet.getInt(1));
				dto.setName(resultSet.getString(2));
				dto.setAge(resultSet.getInt(3));
				dto.setWeight(resultSet.getDouble(4));
				dto.setHeight(resultSet.getDouble(5));
				dto.setQualification(resultSet.getString(6));
				dto.setSalary(resultSet.getString(7));
				dto.setAddress(resultSet.getString(8));
				dto.setPhoneNo(resultSet.getString(9));
				System.out.println(dto);

			}
		} catch (SQLException e) {

			System.out.println("Failed to connect to database");
		}

	}

}
