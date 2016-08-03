package com.designpattern.memento;

public class Employee {
	private String name;
	private String lastname;
	private String salary;
	private String age;
	private String address;
	private String contact;

	public Employee(String name, String lastname, String salary, String age, String address, String contact) {
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

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", salary=" + salary + ", age=" + age
				+ ", address=" + address + ", contact=" + contact + "]";
	}

}
