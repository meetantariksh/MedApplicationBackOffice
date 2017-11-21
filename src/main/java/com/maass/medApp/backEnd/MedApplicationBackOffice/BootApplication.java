package com.maass.medApp.backEnd.MedApplicationBackOffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({"com.maass.medApp.backEnd"})
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class BootApplication {
	
	@RequestMapping("/")
	public String hello() {
		return "*********************************Medical Back End For Back Office Application is UP and RUNNING*********************************";
	}
	
	public static void main (String args[]){
		SpringApplication.run(BootApplication.class, args);
	}
	
}
