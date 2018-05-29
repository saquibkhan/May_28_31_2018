package com.intuit.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountService
{
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private StatementDao statementDao;
	@Autowired
	private TransactionTemplate transactionTemplate;
	
	public void withdraw2(int accountNumber,String type, int amount)throws Exception
	{
		int i = 2;
		i++;
		transactionTemplate.execute(new TransactionCallback<Boolean>() {
			public Boolean doInTransaction(TransactionStatus transactionStatus) {
				try {
					accountDao.withdraw(accountNumber, amount);
					statementDao.addStatement(accountNumber, type, amount);
					return true;
				}
				catch(Exception ex) {
					transactionStatus.setRollbackOnly();
					return false;
				}
			}
		});
		
	}
	
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




