package com.icicibank.bankaccountmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icicibank.bankaccountmanagement.dao.StatementRepository;
import com.icicibank.bankaccountmanagement.model.Statement;

@Component
public class StatementService {

	@Autowired
	StatementRepository statementRepository;
	
	public List<Statement> getStatement(Long accountNumber) {
		
		List<Statement> statementList = statementRepository.findByAccountNumber(accountNumber);
		return statementList;
	}
}
