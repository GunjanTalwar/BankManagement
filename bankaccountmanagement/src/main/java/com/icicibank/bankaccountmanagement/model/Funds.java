package com.icicibank.bankaccountmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funds {

	@Id
	@GeneratedValue
	private Long id;
	private Long accountNumber;
	private Double cashBalance;
	private Double fixedDeposit;
	
	public Funds() {}
	
	public Funds(Long id, Long accountNumber, Double cashBalance, Double fixedDeposit) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.cashBalance = cashBalance;
		this.fixedDeposit = fixedDeposit;
	}
	public Double getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(Double cashBalance) {
		this.cashBalance = cashBalance;
	}
	public Double getFixedDeposit() {
		return fixedDeposit;
	}
	public void setFixedDeposit(Double fixedDeposit) {
		this.fixedDeposit = fixedDeposit;
	}
	public Long getId() {
		return id;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Funds [id=" + id + ", accountNumber=" + accountNumber + ", cashBalance=" + cashBalance
				+ ", fixedDeposit=" + fixedDeposit + "]";
	}
}
