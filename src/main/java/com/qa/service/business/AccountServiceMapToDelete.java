//package com.qa.service.business;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.qa.domain.Account;
//
//public class AccountServiceMapToDelete {
//
//	private Map<Integer, Account> accountMap;
//
//	private int count = 0;
//
//	public AccountServiceMapToDelete() {
//		accountMap = new HashMap<Integer, Account>();
//	}
//
//	public void addAccountFromMap(Account userAccount) {
//		accountMap.put(count, userAccount);
//		count++;
//	}
//
//	public void removeAccountFromMap(Integer accountToRemove) {
//		boolean countExists = accountMap.containsKey(accountToRemove);
//		if (countExists) {
//			accountMap.remove(accountToRemove);
//		}
//	}
//
//	public Map<Integer, Account> getAccountMap() {
//		return accountMap;
//	}
//
//	public int getNumberOfAccountWithFirstName(String firstNameOfAccount) {
//		return (int) accountMap.values().stream()
//				.filter(eachAccount -> eachAccount.getFirstName().equals(firstNameOfAccount)).count();
//	}
//
//	public void blockAccount(String string) {
//		for(Integer key : accountMap.keySet()) {
//			if(accountMap.get(key).getAccountNumber() == string) {
//				accountMap.get(key).setBlocked(true);
//				System.out.println("Account number "+accountMap.get(key).getAccountNumber() + " is blocked");
//			}
//		}
//	}
//	
//	public boolean isAccountBlocked(String accNum) { 
//		boolean isBlocked = false;
//		for(Integer key : accountMap.keySet()) {
//			if(accountMap.get(key).getAccountNumber() == accNum && accountMap.get(key).isBlocked()) {
//				System.out.println("Account number "+accountMap.get(key).getAccountNumber() + " is blocked");
//				isBlocked = true;
//			}
//		}
//		return isBlocked;
//	}
//}
