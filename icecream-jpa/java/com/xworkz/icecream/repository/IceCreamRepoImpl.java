package com.xworkz.icecream.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.xworkz.icecream.entity.IceCreamEntity;



public class IceCreamRepoImpl implements IceCreamRepo{

	@Override
	public void persist(IceCreamEntity entity) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("deleteByName");
	
		query.setParameter("nm", name);
		Integer num= query.executeUpdate();
		System.out.println(num);
		session.getTransaction().commit();
		session.close();
		factory.close();


		
	}

	@Override
	public void updatePriceByName(String name, double price) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("updatePriceByName");
		query.setParameter("pr", price);
		query.setParameter("nm", name);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		factory.close();

			
		}

		
	

	@Override
	public List<IceCreamEntity> getAll() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("getAll");
		List<IceCreamEntity> list=query.getResultList();
		return list;
	}

	@Override
	public IceCreamEntity findByNameAndPrice(String name, double price) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("findByNameAndPrice");
		query.setParameter("pr", price);
		query.setParameter("nm", name);
		IceCreamEntity result=(IceCreamEntity) query.getSingleResult();
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public IceCreamEntity getByMaxPrice() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("getByMaxPrice");
		return (IceCreamEntity) query.getSingleResult();
	}

	@Override
	public IceCreamEntity getByMinPrice() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("getByMinPrice");
		return (IceCreamEntity) query.getSingleResult();
	}

	@Override
	public double getBySumPrice() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("getBySumPrice");
		double singleResult=(double) query.getSingleResult();
		return singleResult;
		
		
		
	}

	@Override
	public double getPriceByName(String name) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("getPriceByName");
		double singleResult=(double) query.getSingleResult();		
		return singleResult;
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session=factory.createEntityManager();
		Query query=session.createNamedQuery("getNameAndFlavourByPrice");
		query.setParameter("pr", price);
		List<Object[]> singleResult=query.getResultList();		
		return singleResult;
	}
}
