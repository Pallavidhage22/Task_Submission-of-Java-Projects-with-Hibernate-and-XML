package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Patient;

public class DeleteData {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int pid=1;
		Patient p=ss.get(Patient.class, pid);
		
		ss.remove(p);
		System.out.println("deleted...");
		
		tr.commit();
		ss.close();

	}

}
