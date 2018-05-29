class AccountService$$EnhancerBySpringCGLIB$$4c06a160 extends AccountService{
	private TransactionManager transactionManager;
	private AccountService accountService;
	
	public void deposit(...){
		transactionManager.begin();
		accountService.deposit(...)
		transactionManager.commit();
	}
	
	public void withdraw(...){
		transactionManager.begin();
		accountService.withdraw(...)
		transactionManager.commit();
	}
}
