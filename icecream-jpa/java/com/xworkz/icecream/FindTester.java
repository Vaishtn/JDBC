package com.xworkz.icecream;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepo;
import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class FindTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("find name by price");
IceCreamRepo repo=new IceCreamRepoImpl();
IceCreamEntity entity=repo.findByNameAndPrice("Dark", 500);
System.out.println(entity);
	}

}
