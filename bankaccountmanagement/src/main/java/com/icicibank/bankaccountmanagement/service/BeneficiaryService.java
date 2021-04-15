package com.icicibank.bankaccountmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icicibank.bankaccountmanagement.dao.BeneficiaryRepository;
import com.icicibank.bankaccountmanagement.model.Beneficiary;

@Component
public class BeneficiaryService {

	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	public List<Beneficiary> getBeneficiaryList(Long accountNumber) { 
		
		return beneficiaryRepository.findByAccountNumber(accountNumber);
	}
	
	public Beneficiary addBeneficiary(Beneficiary beneficiary) {
		
		return beneficiaryRepository.save(beneficiary);
	}
}
