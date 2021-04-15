package com.icicibank.bankaccountmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icicibank.bankaccountmanagement.model.Funds;

@Repository
public interface FundsRepository extends JpaRepository<Funds, Long> {

	//Funds findById(Long id);
	Funds findByAccountNumber(Long accountNumber);
}
