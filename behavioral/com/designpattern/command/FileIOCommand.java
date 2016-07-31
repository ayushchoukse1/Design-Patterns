package com.designpattern.command;

public class FileIOCommand implements Command{
	private FileIO fileIO;
	
	public FileIOCommand(FileIO fileIO) {
		this.fileIO = fileIO;
	}
	@Override
	public void execute() {
		System.out.println("Executing FileIO Command");
		fileIO.doFileIO();
	}

}
