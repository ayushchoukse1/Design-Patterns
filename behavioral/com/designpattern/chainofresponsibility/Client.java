package com.designpattern.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		File jpegFile = new File("jpegFile", "jpeg", "10mb");
		File mp3File = new File("mp3File", "mp3", "4mb");
		File pdfFile = new File("pdfFile", "pdf", "5mb");
		File textFile = new File("textFile", "txt", "1mb");
		File datFile = new File("datFile", "dat", "1mb");
		
		Handler txtHandler = new TextFileHandler();
		Handler pdfHandler = new PdfFileHandler();
		Handler mp3Handler = new Mp3FileHandler();
		Handler jpegHandler = new JpegFileHandler();
		
		txtHandler.setNextHandler(pdfHandler);
		pdfHandler.setNextHandler(mp3Handler);
		mp3Handler.setNextHandler(jpegHandler);
		
		txtHandler.handleFile(jpegFile);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		txtHandler.handleFile(mp3File);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		txtHandler.handleFile(pdfFile);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		txtHandler.handleFile(textFile);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		txtHandler.handleFile(datFile);
	}
}
