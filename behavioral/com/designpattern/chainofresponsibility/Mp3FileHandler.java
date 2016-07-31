package com.designpattern.chainofresponsibility;

public class Mp3FileHandler extends Handler {

	private String name = "mp3FileHandler";

	@Override
	public void handleFile(File file) {
		if (file.getFileType() == "mp3") {
			System.out.println("mp3FileHandler saving the file");
		} else {
			System.out.println("mp3FileHandler cannot process this file, passing to next handler: "+nextHandler.getName());
			nextHandler.handleFile(file);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
