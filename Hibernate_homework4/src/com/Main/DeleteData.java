package com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class DeleteData {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 cfg.addAnnotatedClass(Student.class);
		 
		 SessionFactory sf= cfg.buildSessionFactory();
		 Session ss=sf.openSession();
		 Transaction tr=ss.beginTransaction();
		 
		 int stud_id=1;
		 Student s=ss.get(Student.class, stud_id);
		
		 ss.remove(s);
		 System.out.println("deleted...");
		 tr.commit();
		 ss.close();
	}

}
