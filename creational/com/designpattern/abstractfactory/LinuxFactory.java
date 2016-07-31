package com.designpattern.abstractfactory;

public class LinuxFactory extends WidgetFactory{

	@Override
	TextBox createTextBox() {
		
		return new LinuxTextBox();
	}

	@Override
	ComboBox createComboBox() {
		
		return new LinuxComboBox();
	}

}
