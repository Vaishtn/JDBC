package com.xworkz.ddecor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.interior.dto.InteriorDTO;
import com.xworkz.interior.dto.InteriorDTO.ForWhat;

public class SumanaTester {

	public static void main(String[] args) {
		// new,instance,clone,serializable
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class is loaded");
//		int id=4;
//		String name="Skanda";
//		ForWhat forWhat=ForWhat.HOME;
//		double dim=150;
//		double budget=50000;
			InteriorDTO dto1 = new InteriorDTO();
//			dto1.setHid(5);
//			dto1.setMestriName("Rashmi");
//			dto1.setForWhat(ForWhat.HOSPITAL);
//			dto1.setDimenstion(200);
//			dto1.setBudget(30000);
//			
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

}
