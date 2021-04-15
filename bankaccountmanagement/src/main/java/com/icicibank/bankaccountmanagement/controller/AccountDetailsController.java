package com.icicibank.bankaccountmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icicibank.bankaccountmanagement.model.Account;
import com.icicibank.bankaccountmanagement.service.AccountService;

@Deprecated
@Controller
@RequestMapping(value = "/account_details")
public class AccountDetailsController {
	
	@Autowired
	AccountService accountService;

	@RequestMapping(method = RequestMethod.GET)
	public Account getAccountDetails(@RequestParam Long accountNumber) {
		
		return accountService.getAccountDetails(accountNumber);
	}
}
