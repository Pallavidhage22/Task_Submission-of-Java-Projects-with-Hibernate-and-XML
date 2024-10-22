package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Patient;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Patient p=new Patient();
         p.setPatient_name("neha");
         p.setPatient_age(30);
         p.setDisease("TB");
         
         ss.persist(p);
         System.out.println("inserted...");
         
        tr.commit();
        ss.close();
	}
}
