package com.icicibank.bankaccountmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icicibank.bankaccountmanagement.model.Account;
import com.icicibank.bankaccountmanagement.service.AccountManageService;

@RestController
@RequestMapping(value = "/account/manage")
public class AccountManageController {
	
	@Autowired
	AccountManageService accountManageService;

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public Account getAccountDetails(@RequestParam Long accountNumber) {
		
		return accountManageService.getAccountDetails(accountNumber);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Account addNewAccount(@RequestBody Account account) {
		
		return accountManageService.addNewAccount(account);
	}
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE)
	public void removeAccount(@RequestParam Long accountNumber) {
		
		accountManageService.removeAccount(accountNumber);
	}
}
