package com.paytm.hystrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class PaytmServiceForHystricsApplication {
	
	@GetMapping("/paytm")
	public String paytm()
	{
		return "PayTmService called";
	}
// email service and paytmservice applications
	// bookmyshow service application for  enablinghystrix
	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceForHystricsApplication.class, args);
	}

}
