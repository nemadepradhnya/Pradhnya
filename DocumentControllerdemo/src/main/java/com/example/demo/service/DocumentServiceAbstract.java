package com.example.demo.service;

public  abstract class DocumentServiceAbstract implements DocumentInterface {
	@Override
	public void readdatafromdb() {
		System.out.println("read data from db");
	}
	
	public String printDocument() 
	{
		readdatafromdb();
		processdata();
	return 	printdata();
	}
}
