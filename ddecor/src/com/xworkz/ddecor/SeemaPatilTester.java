package com.xworkz.ddecor;

import com.xworkz.ddecor.dao.DecorInteriorImpl;
import com.xworkz.interior.dao.InteriorDAO;
import com.xworkz.interior.dto.InteriorDTO;
import com.xworkz.interior.dto.InteriorDTO.ForWhat;

public class SeemaPatilTester {

	public static void main(String[] args) {
		InteriorDTO interior=new InteriorDTO();
		interior.setHid(7);
		interior.setMestriName("Ram");
		interior.setForWhat(ForWhat.HOME);
		interior.setBudget(800000);
		interior.setDimenstion(2500);
		
		InteriorDAO dao=new DecorInteriorImpl();
		dao.create(interior);
	}

}
