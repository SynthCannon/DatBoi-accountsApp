//package com.qa.application;
//
//import com.qa.domain.Account;
//import com.qa.service.repository.RepositoryInterface;
//import com.qa.service.repository.DBRepository;
//import com.qa.util.JSONUtil;
//
//public class App {
//
//	public static void main(String[] args) {
//		RepositoryInterface service = new DBRepository();
//		JSONUtil util = new JSONUtil();
//		Account joeBloggs = new Account("Joe", "Bloggs", "1234");
//		Account janeBloggs = new Account("Jane", "Bloggs", "1234");
//		service.createAccount(util.getJSONForObject(joeBloggs));
//		service.createAccount(util.getJSONForObject(janeBloggs));
//		String mapAsJSON = util.getJSONForObject(service.getAllAccounts());
//		System.out.println("This is the account map as JSON " + mapAsJSON);
//	}
//
//}
