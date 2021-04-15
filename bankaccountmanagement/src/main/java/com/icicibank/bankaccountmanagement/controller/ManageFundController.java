package com.icicibank.bankaccountmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icicibank.bankaccountmanagement.model.Funds;
import com.icicibank.bankaccountmanagement.service.ManageFundService;

@RestController
@RequestMapping(value = "/fund/manage")
public class ManageFundController {
	
	@Autowired
	ManageFundService manageFundService;

	@RequestMapping(value = "/balance", method = RequestMethod.GET)
	public Funds getBalance(@RequestParam Long accountNumber) {
		
		return manageFundService.getBalance(accountNumber);
	}
	
	@RequestMapping(value = "/deposit", method = RequestMethod.PUT)
	public Funds depositFunds(@RequestParam Long accountNumber, @RequestParam Double amount) {
		
		return manageFundService.deposit(accountNumber, amount);
	}
	
	@RequestMapping(value = "/withdraw", method = RequestMethod.PUT)
	public Funds withdrawFunds(@RequestParam Long accountNumber, @RequestParam Double amount) {
		
		return manageFundService.withdraw(accountNumber, amount);
	}
}
