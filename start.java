import java.io.*;
import java.util.Scanner;

public class start {
   public static void main(String[] args) {
      PrintStream ps = new PrintStream(System.out);
      Scanner sc = new Scanner(System.in);
      int operation_choice;
      
      ps.println("1. Create a new account");
      ps.println("2. Display all accounts");
      ps.println("3. Update an account");
      ps.println("4. Delete an account"); 
      ps.println("5. Deposit an amount into your account");
      ps.println("6. Withdraw an amount from your account");
      ps.println("7. Search for account");
      ps.println("8. Exit");

      int run_while=1;
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
            System.out.println("Invalid Choice .. Try Again.");
         }   
      }

   }
}