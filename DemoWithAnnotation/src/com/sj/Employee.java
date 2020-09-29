package com.sj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")

public class Employee {

	@Id
	@Column(name="id",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int id;	
	String name;
	
	@Column(name="sal")
	int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("parameterless constructor");
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterisedw constructor");
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
