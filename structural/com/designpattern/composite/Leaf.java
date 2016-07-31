package com.designpattern.composite;

public class Leaf implements Component {

	private String leafName;
	private String leafSalary;
	private String leafType;

	public Leaf(String leafName, String leafSalary, String leafType) {
		this.leafName = leafName;
		this.leafSalary = leafSalary;
		this.leafType = leafType;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return leafName;
	}

	@Override
	public String getSalary() {
		// TODO Auto-generated method stub
		return leafSalary;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return leafType;
	}

	@Override
	public void ShowInfo() {
		this.toString();
	}

	@Override
	public String toString() {
		return "Leaf [leafName=" + leafName + ", leafSalary=" + leafSalary + ", leafType=" + leafType + "]";
	}

	@Override
	public void addComponent(Component component) {
		throw new UnsupportedOperationException("Cannot add component to a leaf");

	}

	@Override
	public void deleteComponent(Component component) {
		throw new UnsupportedOperationException("Cannot add component to a leaf");

	}

}
