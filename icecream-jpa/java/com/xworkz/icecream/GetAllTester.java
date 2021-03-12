package com.xworkz.icecream;

import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class GetAllTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamEntity entity=new IceCreamEntity();
		IceCreamRepo repo=new IceCreamRepoImpl();
		List<IceCreamEntity> entity1=repo.getAll();
		System.out.println(entity1);
		
		List<Object[]> entity11=repo.getNameAndFlavourByPrice(50);
		System.out.println(entity11);
		

	}

}
