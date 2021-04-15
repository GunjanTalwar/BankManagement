package com.icicibank.bankaccountmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.icicibank.bankaccountmanagement.model.Beneficiary;
import com.icicibank.bankaccountmanagement.service.BeneficiaryService;

@RestController
@RequestMapping(value = "/payee/manage")
public class BeneficiaryController {

	@Autowired
	BeneficiaryService beneficiaryService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Beneficiary> getBeneficiaryList(@RequestParam Long accountNumber) {
		
		return beneficiaryService.getBeneficiaryList(accountNumber);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Beneficiary addBeneficiary(@RequestBody Beneficiary beneficiary) {
		
		return beneficiaryService.addBeneficiary(beneficiary);
	}
}
