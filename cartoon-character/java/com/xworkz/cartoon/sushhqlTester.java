package com.xworkz.cartoon;

import java.nio.channels.Channel;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;

public class sushhqlTester {

	public static void main(String[] args) {
		//System.out.println(ChannelName.ABC.valueOf("XYZ"));
		CartoonDAO dao=new CartoonDAOImpl();
		CartoonEntity entity=dao.findByChannelAndLanguage(ChannelName.MNO,"Manipuri");
		System.out.println(entity);
	}

}
