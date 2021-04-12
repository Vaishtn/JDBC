package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;

import com.xworkz.bbc.dao.BBCImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class BBCTester {

	public static void main(String[] args) {
		BBCEntity bbc = new BBCEntity();
		// bbc.setId(1);
		bbc.setName("VVish");

		bbc.setSeasonNo(8);
		bbc.setContestantType("Singer");
		bbc.setGender("Female");
		bbc.setDaysIn(8);
		bbc.setNoOfTask(1);

		BBCDAO dao = new BBCImpl();
		// dao.create(bbc);

		BBCEntity bbc1 = new BBCEntity();
		bbc1.setId(4);
		bbc1.setName("Bro Gowda");
		bbc1.setGender("Male");
		bbc1.setSeasonNo(8);
		bbc1.setContestantType("YouTube Trender ");
		bbc1.setDaysIn(100);
		bbc1.setNoOfTask(40);

		dao.create(bbc1);
	}

}
