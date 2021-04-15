package com.icicibank.bankaccountmanagement.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.icicibank.bankaccountmanagement.model.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Long>  {

	List<Statement> findByAccountNumber(Long accountNumber);
}
