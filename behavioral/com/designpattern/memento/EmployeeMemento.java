package com.designpattern.memento;

public class EmployeeMemento {
	private String name;
	private String lastname;
	private String salary;
	private String age;
	private String address;
	private String contact;

	public EmployeeMemento(String name, String lastname, String salary, String age, String address, String contact) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
		this.age = age;
		this.address = address;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getSalary() {
		return salary;
	}

	public String getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

}
