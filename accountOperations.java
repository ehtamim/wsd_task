interface accountOperations 
{
    void createAccount(account a);
    void updateAccount(account a);
	void deleteAccount(account a);
	account getAccount(int accountNumber);
	void showAllAccounts();
}
