package com.example.demo.factory;

import com.example.demo.service.DocumentInterface;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;

public class Factory {
	
  public static	DocumentInterface getObject(String type)
	{
		if(type.equals("pdfServiceImpl"))
			return new PdfServiceImpl();
		
		if(type.equals("excelServiceImpl"))
			return new ExcelServiceImpl();
		
		return null;
	}

}
