package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class DeleteData {

	public static void main(String[] args) {
		
     Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     cfg.addAnnotatedClass(Employee.class);
     
     SessionFactory sf=cfg.buildSessionFactory();
     Session ss=sf.openSession();
     Transaction tr=ss.beginTransaction();
     
      int eid=1;
      Employee e=ss.get(Employee.class, eid);
      
      ss.remove(e);
      System.out.println("deleted...");
      tr.commit();
      ss.close();
		
	}

}
