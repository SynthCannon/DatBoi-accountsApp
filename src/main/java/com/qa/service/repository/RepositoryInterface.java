package com.qa.service.repository;

public interface RepositoryInterface {

	String getAllAccounts();

	String createAccount(String accout);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);
	
	String blockAccount(Long id);
	
	String unblockAccount(Long id);

}