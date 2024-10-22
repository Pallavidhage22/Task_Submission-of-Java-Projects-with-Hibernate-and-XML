package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {
   public static void main(String[] args) {
	
    Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);
	
	SessionFactory sf= cfg.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction tr=ss.beginTransaction();
	
	Employee e=new Employee();
	e.setEname("ritika");
	e.setAge(25);
	e.setSalary(40000);
	
	ss.persist(e);
	System.out.println("inserted...");
	tr.commit();
	ss.close();
	
   }
}
