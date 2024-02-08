package com.techpalle.model;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
     private int eno;
     private String ename;
     private int esalary;
     private String edesignation;
     
	public Employee() {
		super();
	}
	public Employee(int eno, String ename, int esalary, String edesignation) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
		this.edesignation = edesignation;
	}
	public Employee(String ename, int esalary, String edesignation) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.edesignation = edesignation;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	
}
