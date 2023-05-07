package com.raush.dao;

import java.util.List;

import bus.dto.Addbus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;
import usersignup.dto.UserSignup;

public class ServiceImplementation implements Interface{

	@Override
	public void Usersignup(UserSignup s) {
		
		
		EntityManager p=Connectionclass.getconnection();
		
		EntityTransaction et=p.getTransaction();
		
		et.begin();
		try {
		p.persist(s);
		}
		catch(PersistenceException e) {
			System.out.println(e.getMessage());
		}
		finally {
		et.commit();
		p.close();
		}
		
		
	}

	@Override
	public void Usersignup(String email, String password) {
		EntityManager p=Connectionclass.getconnection();
		
		EntityTransaction et=p.getTransaction();
		
		
		et.begin();
		
	}

	@Override
	public void addbus(Addbus bus) {
		
		EntityManager p=Connectionclass.getconnection();
		
		EntityTransaction et=p.getTransaction();
		
		et.begin();
		try {
		p.persist(bus);
		System.out.println("Bus added successfully");
		}catch(PersistenceException e) {
		System.out.println("Bus not added");
		}
		finally {
		et.commit();
		p.close();
		}
		
	}

	@Override
	public void Updatebus(int id, String busname,String busnumber,String st,String dt,double f,int sa) {
		
		Addbus b=null;
		
		EntityManager p=Connectionclass.getconnection();
		
		b=p.find(Addbus.class, id);
		
		if(b==null) {
			System.out.println("Id not found");
		}
		
		else {
			EntityTransaction et =p.getTransaction();
			
			b.setBusname(busname);
			b.setBusNo(busnumber);
			b.setFromstart(st);
			b.setTodest(st);
			b.setFare(f);
			b.setSeataviable(sa);
			
			et.begin();
			try {
			p.merge(b);
			}
			catch(IllegalAccessError e) {
				System.out.println(e.getMessage());
			}
			finally {
			et.commit();
			p.close();
			}
			
		}
		
		
	}

	@Override
	public void Delete(int id) {
		Addbus b=null;
		EntityManager p=Connectionclass.getconnection();
		
		b=p.find(Addbus.class, id);
		if(b==null) {
			System.out.println("Not found");
		}
		else {
		EntityTransaction et=p.getTransaction();
		
		et.begin();
		try {
		p.remove(b);
		System.out.println("Deleted successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		et.commit();
		
		p.close();
		}
		
	}

	@Override
	public void Print() {
		System.out.println("gsdsgfewg");
	EntityManager p=Connectionclass.getconnection();
	System.out.println("gsdsgf32323423");
	String q="select e from Addbus e";
	
	System.out.println("gsdsgf323234239999999999999999999999999");
	
	Query r=p.createQuery(q);
	
	System.out.println("gsdsgf3232342000000000000000000003");
	
	List<Addbus> list=r.getResultList();
	
	
	list.forEach(System.out::println);
	
	
		
	}

}
