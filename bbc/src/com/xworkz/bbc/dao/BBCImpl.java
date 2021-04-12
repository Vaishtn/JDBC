package com.xworkz.bbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbc.entity.BBCEntity;

public class BBCImpl implements BBCDAO {

	public BBCImpl() {
		System.out.println("created BBCImpl ");
	}

	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoked Create");
		System.out.println("Entity" + entity);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BBCEntity getById(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entityFromDB = session.get(BBCEntity.class, id);
		transaction.commit();
		session.close();
		factory.close();
		return entityFromDB;
	}

	@Override
	public BBCEntity updateNoOfTaskAndDaysInById(int id, int NoOfTask, int daysIn) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(BBCEntity.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entity = session.get(BBCEntity.class, id);
		if (entity != null) {
			System.out.println("can update " + id);
			entity.setNoOfTask(NoOfTask);
			entity.setDaysIn(daysIn);
			session.update(entity);
			transaction.commit();
		} else {
			System.out.println("can't update");
		}
		session.close();
		factory.close();
		return entity;

	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(BBCEntity.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BBCEntity entity = session.get(BBCEntity.class, id);
		if (entity != null) {
			System.out.println("can delete" + id);
			session.delete(entity);
			transaction.commit();
		} else {
			System.out.println("cant delete");
		}
		session.close();
		factory.close();
	}

}
