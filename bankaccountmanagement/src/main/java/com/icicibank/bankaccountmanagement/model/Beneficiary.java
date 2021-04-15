package com.icicibank.bankaccountmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private Long id;
	
	private String name;
	private Long accountNumber;
	private Long beneficiaryAccountNumber;
	private String beneficiaryIfsc;
	private String beneficiaryBranch;
	
	public Beneficiary() {}
	
	public Beneficiary(Long id, String name, Long accountNumber, Long beneficiaryAccountNumber, String beneficiaryIfsc,
			String beneficiaryBranch) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
		this.beneficiaryIfsc = beneficiaryIfsc;
		this.beneficiaryBranch = beneficiaryBranch;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}
	public void setBeneficiaryAccountNumber(Long beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}
	public String getBeneficiaryIfsc() {
		return beneficiaryIfsc;
	}
	public void setBeneficiaryIfsc(String beneficiaryIfsc) {
		this.beneficiaryIfsc = beneficiaryIfsc;
	}
	public String getBeneficiaryBranch() {
		return beneficiaryBranch;
	}
	public void setBeneficiaryBranch(String beneficiaryBranch) {
		this.beneficiaryBranch = beneficiaryBranch;
	}
}
