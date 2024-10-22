package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session  ss=sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		int cid=3;
		Employee e=ss.get(Employee.class, cid);
		e.setEname("laxita");
		e.setAge(22);
		e.setSalary(200000);
		
		ss.merge(e);
		System.out.println("updated...");
		tr.commit();
		ss.close();
	}

}
