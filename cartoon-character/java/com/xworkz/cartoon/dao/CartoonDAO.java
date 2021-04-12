package com.xworkz.cartoon.dao;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;

public interface CartoonDAO {
	public void saveAll(List<CartoonEntity> entities);

	public CartoonEntity findByName(String name);

	public CartoonEntity findByChannelAndLanguage(ChannelName channel, String lang);

}
