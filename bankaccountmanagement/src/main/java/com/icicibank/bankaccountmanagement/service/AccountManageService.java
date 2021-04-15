package com.icicibank.bankaccountmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.icicibank.bankaccountmanagement.dao.AccountRepository;
import com.icicibank.bankaccountmanagement.model.Account;

@Component
public class AccountManageService {
	
	@Autowired
	AccountRepository accountRepository;

	public Account getAccountDetails(Long accountNumber) {
		
		return accountRepository.findByAccountNumber(accountNumber);
	}

	public Account addNewAccount(Account account) {
		
		return accountRepository.save(account);
	}
	
	public void removeAccount(Long accountNumber) {
		
		accountRepository.deleteByAccountNumber(accountNumber);
	}
}
