package com.designpattern.chainofresponsibility;

public class PdfFileHandler extends Handler {
	private String name = "pdfFileHandler";

	public String getName() {
		return name;
	}

	@Override
	public void handleFile(File file) {
		if (file.getFileType() == "pdf") {

			System.out.println("PDF handler saving " + file.getFileName() + " to drive.");

		} else {
			System.out
					.println("PDF handler cannot process this file. passing to next handler: " + nextHandler.getName());
			nextHandler.handleFile(file);
		}
	}

}
