package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import static javax.transaction.Transactional.TxType.*;

import com.google.gson.Gson;
import com.qa.domain.Account;

@Transactional(SUPPORTS)
public class AccountServiceDBImpl {
	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Transactional(REQUIRED)
	public String createAccount(String account) {
		Account aAccount = new Gson().fromJson(account,Account.class);
		em.persist(aAccount);
		return "{\"message\": \"account sucessfully added\"}";
	}
	
	public List<Account> findAllAccounts() {
        TypedQuery<Account> query = em.createQuery("SELECT * FROM Account a ORDER BY a.title DESC", Account.class);
        return query.getResultList();
    }
	
	public Account findAnAccount(Account account) throws NullPointerException{
		return em.find(Account.class, account.getAccountNumber());
    }
	
	@Transactional(REQUIRED)
	public String deleteAccount(Account account) throws NullPointerException{
		if(this.findAnAccount(account) == null) return "{\"message\": \"account not found\"}";
	
		em.remove(this.findAnAccount(account));
		return "{\"message\": \"account deleted\"}";
	}
	
	@Transactional(REQUIRED)
	public String updateAnAccount(Account account, Account newAccount) {
		if(this.findAnAccount(account) == null) return "{\"message\": \"account not found\"}";
		
		this.findAnAccount(account).setFirstName(newAccount.getFirstName());
		this.findAnAccount(account).setSecondName(newAccount.getSecondName());
		this.findAnAccount(account).setAccountNumber(newAccount.getAccountNumber());
		em.merge(this.findAnAccount(account));
		return "{\"message\": \"account sucessfully updated\"}";
	}

}
