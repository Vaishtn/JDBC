package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class PoojaTester {

	public static void main(String[] args) {
		BBCDAO bbc = new BBCImpl();
		BBCEntity entity = bbc.getById(2);
		System.out.println(entity.getName());
		System.out.println(entity.getGender());
		System.out.println(entity);

	}

}
