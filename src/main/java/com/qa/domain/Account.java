package com.qa.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(length = 30)
	private String firstName;
	@Column(length = 30)
	private String secondName;
	@Column(length = 10)
	private String accountNumber;
	@Column(nullable = false)
	private boolean blocked = false;

	public Account(String firstName, String secondName, String accountNumber) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
}
