import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class start {
   public static void main(String[] args) {
      PrintStream ps = new PrintStream(System.out);
      //LocalDateTime accCreationDate=LocalDateTime.now();
      Scanner sc = new Scanner(System.in);
      int operation_choice;
      account acc = new account();
      account a1=new account("Emam Hossain",1200,10000.00,LocalDateTime.now(),"Current");
      account a2=new account("Ryad Islam",1212,130000.00,LocalDateTime.now(),"Saving");
      account a3=new account("Tasnim Anjum",1234,20000.00,LocalDateTime.now(),"Salary");
      account.accounts.add(a1);
      account.accounts.add(a2);
      account.accounts.add(a3);

      int run_while=1;
      while (run_while==1) 
      {
         ps.println("<------------------------------------------------------------>");
         ps.println("1. Create a new account");
         ps.println("2. Display all accounts");
         ps.println("3. Update an account");
         ps.println("4. Delete an account"); 
         ps.println("5. Deposit an amount into your account");
         ps.println("6. Withdraw an amount from your account");
         ps.println("7. Search for account");
         ps.println("8. Exit");
         ps.print("Please enter your choice: ");
         operation_choice = sc.nextInt();


         switch (operation_choice)
         {
            case 1:
               ps.println("You choose to create a new account. Please Enter details");
               ps.print("Please choose an account type 1/Current 2/Saving 3/Salary :");
               int acctype= sc.nextInt();
               acc.setAccountType(acctype);
               ps.print("Please enter account Name :");
               String accName=sc.nextLine();
               acc.setAccountName(accName);
               ps.print("Please enter account Number :");
               int accNumber= sc.nextInt();
               acc.setAccountNumber(accNumber);
               ps.print("Please enter deposit amount :");
               double accDepo= sc.nextDouble();
               if(acctype==1 && accDepo>=5000)
               {
                  acc.setBalance(accDepo);
               }
               else if (acctype==2 && accDepo>=10000)
               {
                  acc.setBalance(accDepo);
               }
               else if (acctype==3 && accDepo>=12000)
               {
                  acc.setBalance(accDepo);
               }
               else
               {
                  ps.println("For Current account Minimum opening Deposit is 5000");
                  ps.println("For Saving account Minimum opening Deposit is 10000");
                  ps.println("For Salary account Minimum opening Deposit is 12000");
               }
               acc.setCreationDate();
               account.accounts.add(acc);

               break;

            case 2:
               ps.println("You choose to display all accounts");
               acc.printDetails();
               break;

            case 3:
               ps.println("You choose to update an account");
               ps.print("Please enter account Number you want to update:");
               int updateAccountNumber= sc.nextInt();
               ps.print("Please enter account Name: ");
               String updateAccountName= sc.nextLine();
               ps.print("Please choose an account type 1/Current 2/Saving 3/Salary :");
               int updateAccountType= sc.nextInt();
               acc.updateAccountDetails(updateAccountNumber,updateAccountName,updateAccountType);
               break;

            case 4:
               ps.println("You choose to delete an account");
               ps.print("Please enter account Number you want to delete:");
               int deleteAccountNumber= sc.nextInt();
               acc.deleteAccountDetails(deleteAccountNumber);
               break;

            case 5:
               ps.println("You choose to deposit into an account");
               ps.print("Please enter account Number to deposit money:");
               int depositAccountNumber= sc.nextInt();
               ps.print("Please enter the amount you want to deposit :");
               double depositAmount= sc.nextDouble();
               acc.deposit(depositAccountNumber,depositAmount);
               break;

            case 6:
               ps.println("You choose to withdraw from an account");
               ps.print("Please enter account Number to withdraw money:");
               int withdrawAccountNumber= sc.nextInt();
               ps.print("Please enter the amount you want to withdraw :");
               double withdrawAmount= sc.nextDouble();
               acc.withdraw(withdrawAccountNumber,withdrawAmount);
               break;

            case 7:
               ps.println("You choose to search an account");
               ps.print("Please enter account Number you want to search:");
               int searchAccountNumber= sc.nextInt();
               acc.searchAccountDetails(searchAccountNumber);
               break;

            case 8:
               run_while=2;
            break;
            default:
            ps.println("Invalid Choice .. Try Again.");
         }   
      }
   }
}