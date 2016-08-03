package com.designpattern.memento;

public class EmployeeOriginator {
	public static void main(String[] args) throws Exception {
		Employee emp1 = new Employee("Ayush", "Choukse", "1000", "23", "101 E ", "4086685916");
		System.out.println(emp1.toString()+" "+emp1.hashCode());
		EmployeeCaretaker caretaker = new EmployeeCaretaker();
		caretaker.takeSnapshot(emp1, "snapshot1");
		System.out.println(emp1.toString()+" "+emp1.hashCode());
		emp1.setAddress("33 south");
		emp1.setAge("46");
		caretaker.takeSnapshot(emp1, "snapshot2");
		System.out.println(emp1.toString()+" "+emp1.hashCode());
		emp1 = caretaker.restoreSnapshot("snapshot1");
		System.out.println(emp1);
	}
}
