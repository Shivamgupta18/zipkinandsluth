package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentOperationController {
	Logger logger = LoggerFactory.getLogger(PaymentOperationController.class);

	@GetMapping("/payment")
	public String dobilling() {
		logger.info("payment is done");
		return "PAyment is done";
	}
}
