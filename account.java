//import java.lang.*;
import java.util.*;
import java.time.LocalDateTime;  

public class account
{
	public String accountName;
    public int accountNumber;
    public LocalDateTime creationDate;
	public double balance;
    public String accountType;
	
    public void setAccountName(String accountName) {this.accountName= accountName;}
	public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
	public void setBalance(double balance){this.balance = balance;}
    public void setCreationDate(){this.creationDate=LocalDateTime.now();}
    public void setAccountType(String accountType) {this.accountType= accountType;}

    public account(String accountName,int accountNumber,double balance, String accountType)
    {
        this.accountName= accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creationDate=LocalDateTime.now();
        this.accountType= accountType;
    }
	
    public String getAccountName(){return accountName;}
	public int getAccountNumber(){return accountNumber;}
	public double getBalance(){return balance;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public String getAccountType(){return accountType;}

    public void printDetails()
	{
		System.out.println("Account Info...................");
		System.out.println("Account Name     :"+accountName);
		System.out.println("Account Number   :"+accountNumber);
		System.out.println("Account Balance  :"+balance);
        System.out.println("Date of crration :"+creationDate);
        System.out.println("Account Type     :"+accountType);
	}
	
	//public abstract void showInfo();
	
	/*public void deposit(double amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Balance: "+ balance);
			System.out.println("Deposit Amount: "+ amount);
			balance += amount;
			System.out.println("Current Balance: "+ balance);
		}
		else
		{
			System.out.println("Can Not Deposit");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			System.out.println("Previous Balance:	"+ balance);
			System.out.println("Withdraw Amount:	"+ amount);
			balance -= amount;
			System.out.println("Current Balance:	"+ balance);
		}
		else
		{
			System.out.println("Can Not Withdraw");
		}
	}*/
}