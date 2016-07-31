package com.designpattern.chainofresponsibility;

public class JpegFileHandler extends Handler {
	
	private String name = "jpegFileHandler";
	@Override
	public void handleFile(File file) {
		if (file.getFileType() == "jpeg") {
			System.out.println("JpegFileHandler Storing the file " + file.getFileName());
		} else {
			try {
				throw new Exception("Unsupported File Type.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
