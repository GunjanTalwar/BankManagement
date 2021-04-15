package com.icicibank.bankaccountmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icicibank.bankaccountmanagement.dao.AccountRepository;
import com.icicibank.bankaccountmanagement.model.Account;

@Deprecated
@Component
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public Account getAccountDetails(Long accountNumber) {
		
		return accountRepository.findByAccountNumber(accountNumber);
	}
}
