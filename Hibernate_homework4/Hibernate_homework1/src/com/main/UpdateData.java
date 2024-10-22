package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int cid=6;
		Car c=ss.get(Car.class,cid);
		c.setCname("Wagnor");
		c.setColor("white");
		c.setPrice(700000);
		
		ss.merge(c);
		System.out.println("updated");
		tr.commit();
		ss.close();

	}

}
