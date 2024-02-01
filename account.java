//import java.lang.*;
import java.util.*;
import java.io.PrintStream;
import java.time.LocalDateTime;  

public class account
{
	public String accountName;
    public int accountNumber;
    public LocalDateTime creationDate;
	public double balance;
    public String accountType;
    public static List <account> accounts=new ArrayList <account>();
    PrintStream pl = new PrintStream(System.out);
	
    public void setAccountName(String accountName) {this.accountName= accountName;}
	public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
	public void setBalance(double balance){this.balance = balance;}
    public void setCreationDate(){this.creationDate=LocalDateTime.now();}
    public void setAccountType(int accountType) 
    {
        if(accountType==1)
        {
            this.accountType = "Current";
        }
        else if(accountType==2)
        {
            this.accountType = "Saving";
        }
        if(accountType==3)
        {
            this.accountType = "Salary";
        }
        else
        {
            this.accountType = "Current";
        }
    }

    public account(String accountName,int accountNumber,double balance,LocalDateTime creationDate, String accountType)
    {
        this.accountName= accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creationDate=creationDate;
        this.accountType= accountType;
    }
	
    public String getAccountName(){return accountName;}
	public int getAccountNumber(){return accountNumber;}
	public double getBalance(){return balance;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public String getAccountType(){return accountType;}

    public void printDetails()
	{
		for(int i=0; i<accounts.size(); i++)
        {
            pl.println("Account Info...................");
            pl.println("Account Name     :"+accounts.get(i).accountName);
            pl.println("Account Number   :"+accounts.get(i).accountNumber);
            pl.println("Account Balance  :"+accounts.get(i).balance);
            pl.println("Date of crration :"+accounts.get(i).creationDate);
            pl.println("Account Type     :"+accounts.get(i).accountType);
        }
	}

    public account()
    {}


    public void updateAccountDetails(int accNumber, String accName, int accType)
    {
        int valid=0;
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).accountNumber==accNumber)
            {
                accounts.set(i, new account(accName,accNumber,accounts.get(i).balance,accounts.get(i).creationDate,accountType));
                pl.println("Account was Updated");
            }
        }
        if(valid==0)
        {
            pl.println("No account was found");
        }
    }

    public void deleteAccountDetails(int accNumb)
    {
        int valid=0;
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).accountNumber==accNumb)
            {
                accounts.remove(i);
                pl.println("Account was Deleted");
                valid=1;
            }
        }
        if(valid==0)
        {
            pl.println("No account was found");
        }
    }

    public void deposit(int accNumb, double amount)
    {
        int valid=0;
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).accountNumber==accNumb)
            {
                double newBalance=accounts.get(i).balance+amount;
                accounts.set(i, new account(accounts.get(i).accountName,accNumb,newBalance,accounts.get(i).creationDate,accounts.get(i).accountType));
                pl.println("Amount was deposited");
                valid=1;
            }
        }
        if(valid==0)
        {
            pl.println("No account was found");
        }
    }


    public void withdraw(int accNumb, double amount)
    {
        int valid=0;
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).accountNumber==accNumb)
            {
                double newBalance=accounts.get(i).balance-amount;
                if (accounts.get(i).accountType=="Current" && newBalance>=500)
                {
                    accounts.set(i, new account(accounts.get(i).accountName,accNumb,newBalance,accounts.get(i).creationDate,accounts.get(i).accountType));
                    pl.println("Amount withdrawn successfully");
                    pl.println("Account Balance: "+newBalance);
                    valid=1;
                }
                else if (accounts.get(i).accountType=="Saving" && newBalance>=5000)
                {
                    accounts.set(i, new account(accounts.get(i).accountName,accNumb,newBalance,accounts.get(i).creationDate,accounts.get(i).accountType));
                    pl.println("Amount withdrawn successfully");
                    pl.println("Account Balance: "+newBalance);
                    valid=1;
                }
                else if (accounts.get(i).accountType=="Salary" && newBalance>=1000)
                {
                    accounts.set(i, new account(accounts.get(i).accountName,accNumb,newBalance,accounts.get(i).creationDate,accounts.get(i).accountType));
                    pl.println("Amount withdrawn successfully");
                    pl.println("Account Balance: "+newBalance);
                    valid=1;
                }
                else
                {
                    pl.println("Minimum account balance limit has crossed.");
                    valid=1;
                }
            }
        }
        if(valid==0)
        {
            pl.println("No account was found");
        }
    }


    public void searchAccountDetails(int accNumb)
    {
        int valid=0;
        for(int i=0; i<accounts.size(); i++)
        {
            if(accounts.get(i).accountNumber==accNumb)
            {
                pl.println("Account Info...................");
                pl.println("Account Name     :"+accounts.get(i).accountName);
                pl.println("Account Number   :"+accounts.get(i).accountNumber);
                pl.println("Account Balance  :"+accounts.get(i).balance);
                pl.println("Date of crration :"+accounts.get(i).creationDate);
                pl.println("Account Type     :"+accounts.get(i).accountType);
                valid=1;
            }
        }
        if(valid==0)
        {
            pl.println("No account was found");
        }
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