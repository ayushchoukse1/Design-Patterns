package com.designpattern.abstractfactory;

public class WindowsFactory extends WidgetFactory {

	@Override
	TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new WindowsTextBox();
	}

	@Override
	ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new WindowsComboBox();
	}

}
