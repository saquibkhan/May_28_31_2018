package com.intuit.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService
{
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private StatementDao statementDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void deposit(int accountNumber,String type, int amount) {
		accountDao.deposit(accountNumber, amount);
		statementDao.addStatement(accountNumber, type, amount);
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void withdraw(int accountNumber,String type, int amount)throws Exception
	{
		accountDao.withdraw(accountNumber, amount);
		int number = 2;
		if( number %2 == 0) {
			throw new Exception("WTH is going on?");
		}
		statementDao.addStatement(accountNumber, type, amount);
	}
}




