import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class start {
   public static void main(String[] args) {
      PrintStream ps = new PrintStream(System.out);
      Scanner sc = new Scanner(System.in);
      int operation_choice;
      //account[] acc=new account[20];
      
      ps.println("1. Create a new account");
      ps.println("2. Display all accounts");
      ps.println("3. Update an account");
      ps.println("4. Delete an account"); 
      ps.println("5. Deposit an amount into your account");
      ps.println("6. Withdraw an amount from your account");
      ps.println("7. Search for account");
      ps.println("8. Exit");

      int run_while=2;
      while (run_while==1) 
      {
         ps.print("Please select your choice: ");
         operation_choice = sc.nextInt();
         switch (operation_choice)
         {
            case 1:
            ps.println("You choose to create a new account");
            break;
            case 2:
            ps.println("You choose to display all accounts");
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
            case 6:
            break;
            case 7:
            break;
            case 8:
            run_while=2;
            break;
            default:
            ps.println("Invalid Choice .. Try Again.");
         }   
      }

      //account n1=new account();
      List <account> accounts=new ArrayList <account>();
      account a1=new account("Emam Hossain",1200,10000.00,"Current");
      account a2=new account("Ryad Islam",1212,130000.00,"Saving");
      account a3=new account("Tasnim Anjum",1234,20000.00,"Salary");
      accounts.add(a1);
      accounts.add(a2);
      accounts.add(a3);
      for(int i=0; i<accounts.size(); i++)
      {
         //account printaAccount=new account(accounts[i]);
         System.out.println("Account Info...................");
         System.out.println("Account Name     :"+accounts.get(i).accountName);
         System.out.println("Account Number   :"+accounts.get(i).accountNumber);
         System.out.println("Account Balance  :"+accounts.get(i).balance);
         System.out.println("Date of crration :"+accounts.get(i).creationDate);
         System.out.println("Account Type     :"+accounts.get(i).accountType);
      }
      
      //account n1=new account("Emam Hossain",1243,10000.00,"Current");
      //n1.printDetails();
   }
}