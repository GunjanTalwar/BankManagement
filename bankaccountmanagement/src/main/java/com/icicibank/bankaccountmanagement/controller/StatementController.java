package com.icicibank.bankaccountmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.icicibank.bankaccountmanagement.model.Statement;
import com.icicibank.bankaccountmanagement.service.StatementService;

@RestController
@RequestMapping(value = "/statement")
public class StatementController {
	
	@Autowired
	StatementService statementService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Statement> getStatement(@RequestParam Long accountNumber) {
		
		return statementService.getStatement(accountNumber);
	}
}
