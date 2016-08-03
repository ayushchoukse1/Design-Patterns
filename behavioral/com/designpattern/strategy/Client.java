package com.designpattern.strategy;

public class Client {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor(new CapitalTextFormatter());
		System.out.println(editor.publishText("this was written in lower text"));

		// changing the editor to lowerTextFormmater. If you dont want to give
		// this funcationality to the user, then make the Formatter variable in
		// text format class as final.
		editor.setFormatter(new LowerTextFormatter());
		System.out.println(editor.publishText("THIS WAS WRITTEN IN CAPITAL TEXT"));
	}
}
