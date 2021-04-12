package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCImpl;

public class VaishnaviTester {

	public static void main(String[] args) {
		BBCDAO dao=new BBCImpl();
		dao.updateNoOfTaskAndDaysInById(1, 6, 10);
		
		dao.deleteById(4);
	}

}
