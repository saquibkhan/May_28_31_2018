package com.intuit.lab01;

import org.springframework.stereotype.Repository;

@Repository
public class StatementDaoImpl extends BaseDaoSupport implements StatementDao
{
	public void addStatement(int accountNumber,String type,int amount)
	{
		getJdbcTemplate().update("insert into statements(account_number,amount,type) values(?,?,?)",
				accountNumber,amount,type);
	}
}
