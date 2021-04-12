package com.xworkz.cartoon;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;

public class AishhqlTester {

	public static void main(String[] args) {
		CartoonDAO dao=new CartoonDAOImpl();
		CartoonEntity cartoonEntity=dao.findByName("Motu");
		System.out.println(cartoonEntity);
		
	}

}
