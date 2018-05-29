package com.intuit.lab01;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl extends BaseDaoSupport implements AccountDao
{
	public void deposit(int accountNumber,int amount)
	{
		getJdbcTemplate().update("update accounts set balance=balance+? where account_number=?",
				amount,
				accountNumber);
	}
	public void withdraw(int accountNumber,int amount)
	{
		getJdbcTemplate().update("update accounts set balance=balance-? where account_number=?",
				amount,
				accountNumber);
	}
}