package com.icicibank.bankaccountmanagement.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icicibank.bankaccountmanagement.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>  {

	Account findByAccountNumber(Long accountNumber);
	
	@Transactional
	void deleteByAccountNumber(Long accountNumber);
}
