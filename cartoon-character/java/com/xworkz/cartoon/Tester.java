package com.xworkz.cartoon;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;

public class Tester {

	public static void main(String[] args) {
		CartoonEntity entity = new CartoonEntity("RoolNo:21", "RoolNo:21", ChannelName.NICK, "Hindi");
		CartoonEntity entity2 = new CartoonEntity("Bheema", "Chota Bheema", ChannelName.CHINTU, "English");
		CartoonEntity entity3=new CartoonEntity("Motu","Motu-patalu",ChannelName.ABC,"tamil");
		CartoonEntity entity4=new CartoonEntity("Tom","TomandJery",ChannelName.MNO,"Manipuri");
		
		CartoonDAO dao = new CartoonDAOImpl();
		List<CartoonEntity> entities = new ArrayList<CartoonEntity>();
		entities.add(entity);
		entities.add(entity2);
		entities.add(entity3);
		entities.add(entity4);
		dao.saveAll(entities);
		System.out.println(entities);
	}

}
