package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Patient;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int patient_id=2;
        Patient p=ss.get(Patient.class, patient_id);
        p.setPatient_name("kalyani");
        p.setPatient_age(59);
        p.setDisease("Maleria");
        
        ss.merge(p);
        System.out.println("updated...");
        tr.commit();
        ss.close();
	}

}
