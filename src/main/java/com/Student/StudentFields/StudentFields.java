package com.Student.StudentFields;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentFields {
	@Id
	private int id;
	private String name;
	private double salary;
	private String collegename;
	private String university;
	private Double phoneNumber;
	private String city;
	private double pincode;
	public StudentFields(int id, String name, double salary, String collegename, String university, Double phoneNumber,
			String city, double pincode) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.collegename = collegename;
		this.university = university;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.pincode = pincode;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	public StudentFields() {
		super();
	}
}
