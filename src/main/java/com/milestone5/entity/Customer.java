package com.milestone5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "age", nullable = false)
	private int age;

	@Column(name = "prefferedfood", nullable = false)
	private String prefferedfood;

	public Customer() {	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", prefferedfood="
				+ prefferedfood + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrefferedfood() {
		return prefferedfood;
	}

	public void setPrefferedfood(String prefferedfood) {
		this.prefferedfood = prefferedfood;
	}

	public Customer(int id, String name, String gender, int age, String prefferedfood) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.prefferedfood = prefferedfood;
	}
}
