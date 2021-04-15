package com.icicibank.bankaccountmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Statement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private Long id;
	private Long accountNumber;
	private Double transactionamount;
	private TransactionType transactionType;
	private Double accountBalance;
	private Date timestamp;
	
	public Statement() {}
	
	public Statement(Long accountNumber, Double transactionamount, TransactionType transactionType, Double accountBalance, Date timestamp) {
		super();
		this.accountNumber = accountNumber;
		this.transactionamount = transactionamount;
		this.transactionType = transactionType;
		this.accountBalance = accountBalance;
		this.timestamp = timestamp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Double getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(Double transactionamount) {
		this.transactionamount = transactionamount;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
