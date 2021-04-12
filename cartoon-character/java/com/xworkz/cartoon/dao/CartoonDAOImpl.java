package com.xworkz.cartoon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;
import com.xworkz.util.sfUtil.SFUtil;

public class CartoonDAOImpl implements CartoonDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void saveAll(List<CartoonEntity> entities) {
		Transaction transaction=null;
		System.out.println("invoke the list");
		try(Session session=factory.openSession()){
			 transaction=session.beginTransaction();
			for (CartoonEntity couponEntity:entities) {
				session.save(couponEntity);
			}
			transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}

		
	}

	@Override
	public CartoonEntity findByName(String name) {
		try(Session session=this.factory.openSession()) {
			String hqlSyntax="SELECT CART FROM CartoonEntity CART WHERE CART.name='"+name+"'";
	Query<CartoonEntity> query=session.createQuery(hqlSyntax);
	CartoonEntity cartoonEntity=query.uniqueResult();
	return cartoonEntity;
			
		} 
		}

	@Override
	public CartoonEntity findByChannelAndLanguage(ChannelName channel, String lang) {
		try(Session session=this.factory.openSession()){
			String hqlSyntax="SELECT CART FROM CartoonEntity CART WHERE CART.channelName='"+channel+"' and CART.language='"+lang+"'";
			Query<CartoonEntity> query=session.createQuery(hqlSyntax);
			CartoonEntity cartoonEntity=query.uniqueResult();
			return cartoonEntity;
		
		}
		
	}

}
