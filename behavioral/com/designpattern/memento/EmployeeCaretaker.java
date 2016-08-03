package com.designpattern.memento;

import java.util.HashMap;

public class EmployeeCaretaker {

	private HashMap<String, EmployeeMemento> employeeMap = new HashMap<String, EmployeeMemento>();

	public void takeSnapshot(Employee employee, String name) {
		System.out.println("Taking Snapshot: name=" + name);
		EmployeeMemento memento = new EmployeeMemento(employee.getName(), employee.getLastname(), employee.getSalary(),
				employee.getAge(), employee.getAddress(), employee.getContact());
		employeeMap.put(name, memento);
	}

	public Employee restoreSnapshot(String name) throws Exception {

		EmployeeMemento memento = employeeMap.get(name);
		Employee e = new Employee(memento.getName(), memento.getLastname(), memento.getSalary(), memento.getAge(),
				memento.getAddress(), memento.getContact());
		System.out.println("Restoring to snapshot: " + name);
		return e;
	}

}
