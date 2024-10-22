package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int stud_id=2;
		 Student s=ss.get(Student.class, stud_id);
		 
		 s.setName("sayali");
		 s.setAge(22);
		 s.setCity("nashik");
		 
		// ss.update(s);
		 ss.merge(s);
		 
		 System.out.println("data updated...");
		 tr.commit();
		 ss.close();
	}

}
