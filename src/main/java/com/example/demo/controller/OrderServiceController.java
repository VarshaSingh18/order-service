package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.Configuration;
import com.example.demo.model.orderserviceconfiguration;

@RestController
public class OrderServiceController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/order")
	public orderserviceconfiguration retrieveorderlimitCongiguration()
	{
	
		
		return new orderserviceconfiguration(configuration.getMin(),configuration.getMax());
	}
}
