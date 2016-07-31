package com.designpattern.abstractfactory;

public abstract class TextBox {
	private String textBoxName;

	public void setTextBoxName(String textBoxName) {
		this.textBoxName = textBoxName;
	}

	public String getTextBoxName() {
		return textBoxName;
	}

}
