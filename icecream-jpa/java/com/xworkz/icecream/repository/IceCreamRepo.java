package com.xworkz.icecream.repository;

import java.util.List;


import com.xworkz.icecream.entity.IceCreamEntity;

public interface IceCreamRepo {
	public void persist(IceCreamEntity entity);

	public void deleteByName(String name);

	public void updatePriceByName(String name, double price);

	public List<IceCreamEntity> getAll();

	public IceCreamEntity findByNameAndPrice(String name, double price);

	public IceCreamEntity getByMaxPrice();

	public IceCreamEntity getByMinPrice();

	public double getBySumPrice();

	public double getPriceByName(String name);

	public List<Object[]> getNameAndFlavourByPrice(double price);

}
