package com.designpattern.composite;

public interface Component {
	public String getName();

	public String getSalary();

	public String getType();

	public void ShowInfo();

	public void addComponent(Component component);

	public void deleteComponent(Component component);
}
