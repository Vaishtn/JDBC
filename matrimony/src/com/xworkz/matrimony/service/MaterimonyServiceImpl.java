package com.xworkz.matrimony.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dto.DTO;

public class MaterimonyServiceImpl implements MaterimonyService {
	
	MatrimonyDAO dao;
	public MaterimonyServiceImpl (MatrimonyDAO dao) {
		this.dao=dao;
		
		
	}

	@Override
	public DTO getBride(int id) {
		if(0==id) {
			System.out.println("invalid id");
			return null;
		}
		return dao.getById(1);
	}

	@Override
	public DTO getAllBride() {
		
		return dao.getAllBride();
		
	}

}
