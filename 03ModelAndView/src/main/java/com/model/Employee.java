package com.model;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private long mblnmbr;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary,long mblnmbr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mblnmbr=mblnmbr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaem() {
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
	

	public long getMblnmbr() {
		return mblnmbr;
	}

	public void setMblnmbr(long mblnmbr) {
		this.mblnmbr = mblnmbr;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mblnmbr=" + mblnmbr + "]";
	}

	
	

}
