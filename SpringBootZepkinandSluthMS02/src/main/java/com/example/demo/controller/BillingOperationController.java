package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillingOperationController {
	@Autowired
	private RestTemplate template;

	Logger logger = LoggerFactory.getLogger(BillingOperationController.class);

	@GetMapping("/billing")
	public String dobilling() {
		logger.info("Welcome to billing module");
		
		String resp = template.getForObject("http://localhost:9093/payment", String.class);
		logger.info("BAck to billing module "+ resp);
		return resp;
	}

}
