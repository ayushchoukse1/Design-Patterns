package com.designpattern.abstractfactory;

public class Client {

	public static void main(String[] args) {
		WidgetFactory wf = FactoryMaker.getFactory("linux");
		TextBox textBox1 = wf.createTextBox();
		ComboBox comboBox1 = wf.createComboBox();
		
		System.out.println(textBox1.getTextBoxName() +" "+ comboBox1.getComboBoxName());

	}

}
