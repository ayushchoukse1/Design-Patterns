package com.designpattern.abstractfactory;

public class FactoryMaker {
	private static WidgetFactory wf = null;
	static WidgetFactory getFactory(String choice){
		if(choice.equals("windows")){
			wf = new WindowsFactory();
		}else if(choice.equals("linux")){
			wf = new LinuxFactory(); 
		}
		return wf;
	}
}
