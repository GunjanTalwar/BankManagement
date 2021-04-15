package com.icicibank.bankaccountmanagement.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.icicibank.bankaccountmanagement.dao.FundsRepository;
import com.icicibank.bankaccountmanagement.dao.StatementRepository;
import com.icicibank.bankaccountmanagement.model.Funds;
import com.icicibank.bankaccountmanagement.model.Statement;
import com.icicibank.bankaccountmanagement.model.TransactionType;

@Component
public class ManageFundService {
	
	@Autowired
	FundsRepository fundsRepository;
	
	@Autowired
	StatementRepository statementRepository;

	public Funds getBalance(Long accountNumber) {
		//Funds funds = fundsRepository.findById(accountNumber).orElse(null);
		/*
		 * System.out.println("Funds :"+funds); List<Funds> allFunds =
		 * fundsRepository.findAll(); System.out.println("All Funds:"+allFunds);
		 */
		Funds funds = fundsRepository.findByAccountNumber(accountNumber);
		return funds;
	}
	
	public Funds deposit(Long accountNumber, Double amount) {
		
		Funds funds = fundsRepository.findByAccountNumber(accountNumber);
		Double currentCashBalance = funds.getCashBalance();
		Double updatedCashBalance = currentCashBalance+amount;
		funds.setCashBalance(updatedCashBalance);
		fundsRepository.save(funds);
		
		// Update Statement
		statementRepository.save(new Statement(accountNumber, amount, TransactionType.CREDIT, updatedCashBalance, new Date()));
		
		return funds;
	}
	
	public Funds withdraw(Long accountNumber, Double amount) {
		
		Funds funds = fundsRepository.findByAccountNumber(accountNumber);
		Double currentCashBalance = funds.getCashBalance();
		Double updatedCashBalance = currentCashBalance-amount;
		funds.setCashBalance(updatedCashBalance);
		fundsRepository.save(funds);
		
		// Update Statement
		statementRepository.save(new Statement(accountNumber, amount, TransactionType.DEBIT, updatedCashBalance, new Date()));
				
		return funds;
	}
}
