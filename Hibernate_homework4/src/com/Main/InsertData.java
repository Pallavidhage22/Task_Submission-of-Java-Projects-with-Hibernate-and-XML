package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class InsertData {
	
	public static void main(String[] args) {
		
	
    Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	
	Student s = new Student();
	s.setName("gauri");
	s.setCity("latur");
	s.setAge(20);
	
	// ss.save(s);
	ss.persist(s);
	System.out.println("data inserted successfully...");
	tr.commit();
	ss.close();
	
	}
	
	
	
	
}
