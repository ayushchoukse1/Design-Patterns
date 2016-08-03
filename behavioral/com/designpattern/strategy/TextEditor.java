package com.designpattern.strategy;

public class TextEditor {
	private  TextFormat formatter;

	public TextEditor(TextFormat formatter) {
		// TODO Auto-generated constructor stub
		this.formatter = formatter;
	}

	public String publishText(String string) {
		return formatter.format(string);
	}


	public void setFormatter(TextFormat formatter) {
		this.formatter = formatter;
	}

}
