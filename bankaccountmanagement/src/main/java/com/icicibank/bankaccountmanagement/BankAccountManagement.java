package com.icicibank.bankaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.icicibank.bankaccountmanagement")
public class BankAccountManagement {

	public static void main(String args[]) {
		SpringApplication.run(BankAccountManagement.class, args);
	}
}
