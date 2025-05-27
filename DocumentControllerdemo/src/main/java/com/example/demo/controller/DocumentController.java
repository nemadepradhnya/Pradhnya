package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.Factory;
import com.example.demo.service.DocumentInterface;

@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		DocumentInterface ds = Factory.getObject(type);
		                   
	                   return  ds.printDocument();
	}

}
