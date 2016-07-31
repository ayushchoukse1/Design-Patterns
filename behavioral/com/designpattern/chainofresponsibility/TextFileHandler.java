package com.designpattern.chainofresponsibility;

public class TextFileHandler extends Handler {
	private String name = "textFileHandler";

	public String getName() {
		return name;
	}

	@Override
	public void handleFile(File file) {
		// TODO Auto-generated method stub
		if (file.getFileType() == "txt") {
			System.out.println("Handling Text File with TextHandler");
		} else {
			System.out.println("TextHandler Cannot Store this file, Sending to nextHandler: " + nextHandler.getName());
			nextHandler.handleFile(file);
		}

	}

}
