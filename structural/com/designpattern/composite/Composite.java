package com.designpattern.composite;

import java.util.ArrayList;

public class Composite implements Component {

	private String compositeName;
	private String compositeSalary;
	private String compositeType;
	private ArrayList<Component> componentsList;

	public Composite(String compositeName, String compositeSalary, String compositeType,
			ArrayList<Component> componentsList) {
		this.compositeName = compositeName;
		this.compositeSalary = compositeSalary;
		this.compositeType = compositeType;
		this.componentsList = componentsList;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return compositeName;
	}

	@Override
	public String getSalary() {
		// TODO Auto-generated method stub
		return compositeSalary;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return compositeType;
	}

	@Override
	public void ShowInfo() {
		toString();
	}

	@Override
	public String toString() {
		return "Composite [compositeName=" + compositeName + ", compositeSalary=" + compositeSalary + ", compositeType="
				+ compositeType + ", componentsList=" + componentsList + "]";
	}

	@Override
	public void addComponent(Component component) {
		componentsList.add(component);

	}

	@Override
	public void deleteComponent(Component component) {
		componentsList.remove(component);
	}

}
