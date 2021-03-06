//package com.qa.service;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.qa.domain.Account;
//import com.qa.service.business.AccountServiceMapToDelete;
//import com.qa.util.JSONUtil;
//
//public class AccountServiceTest {
//
//	private AccountServiceMapToDelete service;
//	private Account joeBloggs;
//	private Account janeBloggs;
//	private JSONUtil util;
//
//	@Before
//	public void init() {
//		service = new AccountServiceMapToDelete();
//		joeBloggs = new Account("Joe", "Bloggs", "1234");
//		janeBloggs = new Account("Jane", "Bloggs", "1234");
//		util = new JSONUtil();
//	}
//
//	@Test
//	public void addAndRemoveAccountTest() {
//		service.addAccountFromMap(joeBloggs);
//		Assert.assertEquals(service.getAccountMap().size(), 1);
//		service.addAccountFromMap(janeBloggs);
//		Assert.assertEquals(service.getAccountMap().size(), 2);
//		service.removeAccountFromMap(0);
//		Assert.assertEquals(service.getAccountMap().size(), 1);
//		service.removeAccountFromMap(1);
//		Assert.assertEquals(service.getAccountMap().size(), 0);
//		service.removeAccountFromMap(5);
//		Assert.assertEquals(service.getAccountMap().size(), 0);
//	}
//
//	@Test
//	public void accountConversionToJSONTest() {
//		String emptyMap = util.getJSONForObject(service.getAccountMap());
//		Assert.assertEquals("{}", emptyMap);
//		String accountAsJSON = "{\"0\":{\"firstName\":\"Joe\",\"secondName\":\"Bloggs\",\"accountNumber\":\"1234\",\"blocked\":false},\"1\":{\"firstName\":\"Jane\",\"secondName\":\"Bloggs\",\"accountNumber\":\"1234\",\"blocked\":false}}";
//		Assert.assertEquals("{}", emptyMap);
//		service.addAccountFromMap(joeBloggs);
//		service.addAccountFromMap(janeBloggs);
//		String populatedAccountMap = util.getJSONForObject(service.getAccountMap());
//		Assert.assertEquals(accountAsJSON, populatedAccountMap);
//	}
//
//	@Test
//	public void getCountForFirstNamesInAccount() {
//		Assert.assertEquals(service.getNumberOfAccountWithFirstName("Joe"), 0);
//		service.addAccountFromMap(joeBloggs);
//		Assert.assertEquals(service.getNumberOfAccountWithFirstName("Joe"), 1);
//		Account joeGordon = new Account("Joe", "Gordon", "1234");
//		service.addAccountFromMap(joeGordon);
//		Assert.assertEquals(service.getNumberOfAccountWithFirstName("Joe"), 2);
//	}
//
//	@Test
//	public void rejectAccountsWithAccountNum9999() {
//		Account blockPerson = new Account("Block","Person","9999");
//		service.addAccountFromMap(blockPerson);
//		Assert.assertEquals(service.isAccountBlocked("9999"),false);
//		service.blockAccount("9999");
//		Assert.assertEquals(service.isAccountBlocked("9999"),true);
//	}
//	
//}
