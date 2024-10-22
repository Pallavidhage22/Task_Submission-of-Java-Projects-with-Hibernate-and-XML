package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentrecord")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stud_id;
	private String name;
	private String city;
	private int Age;
	
	public Student() {
		
	}

	public Student(int stud_id, String name, String city, int age) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.city = city;
		this.Age = age;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", city=" + city + ", age=" + Age + "]";
	}

 
	
	}

	
