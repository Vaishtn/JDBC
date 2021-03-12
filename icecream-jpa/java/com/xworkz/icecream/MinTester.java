package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class MinTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamRepo repo=new IceCreamRepoImpl();
		IceCreamEntity entity=repo.getByMinPrice();
		System.out.println(entity);


	}

}
