package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class DeleteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("delete");
		new IceCreamRepoImpl().deleteByName("Dark");
	}

}
