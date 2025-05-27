package com.example.demo.service;

public class PdfServiceImpl extends DocumentServiceAbstract {

	
	@Override
	public void processdata() {
		System.out.println("process data for pdf");
		
	}

	@Override
	public String printdata() {
		System.out.println("print data");
		return "pdf";
	}
	
	

}
