package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class UpdateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("update");
		new IceCreamRepoImpl().updatePriceByName("Death by Chacolate", 100);
		System.out.println();

		
	}

}
