package com.xworkz.icecream;

import com.xworkz.icecream.repository.IceCreamRepoImpl;

public class SumPriceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double sumPrice=new IceCreamRepoImpl().getBySumPrice();
		System.out.println(sumPrice);

	}

}
