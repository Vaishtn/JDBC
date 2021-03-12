package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.entity.IceCreamEntity.Color;
import com.xworkz.icecream.entity.IceCreamEntity.Flavour;
import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamEntity entity=new IceCreamEntity();
		entity.setId(4);
		entity.setName("Dark");
		entity.setColor(Color.BLACK);
		entity.setCompany("Arun");
		entity.setFlavour(Flavour.BUTTERSCOTCH);
		entity.setPrice(50.00);
		
		IceCreamRepo repo=new IceCreamRepoImpl();
		repo.persist(entity);
	}

}
