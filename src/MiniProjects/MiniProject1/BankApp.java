package MiniProjects.MiniProject1;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = FileUtil.load();

        if (acc == null) {
            System.out.println("Create Account");
            
            
            int no = (int)(Math.random() * 100000); 
            System.out.println("Generated Account No: " + no); 

            sc.nextLine(); // Buffer clear
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("1.Savings 2.Current: ");
            int type = sc.nextInt();

            
            acc = (type == 1)
                    ? new SavingsAccount(no, name, 0) 
                    : new CurrentAccount(no, name, 0);
            FileUtil.save(acc);
        }

        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Details 5. Close A/c 6.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Amount: ");
                    acc.deposit(sc.nextDouble());
                    FileUtil.save(acc);
                    break;
                case 2:
                    System.out.print("Amount: ");
                    acc.withdraw(sc.nextDouble());
                    FileUtil.save(acc);
                    break;
                case 3:
                    System.out.println("Balance: " + acc.balance);
                    break;
                case 4:
                    acc.display();
                    break;
                case 5:
                    
                    new java.io.File("bankdata.dat").delete();
                    System.out.println("Account Closed Successfully. Restart app to create new.");
                    System.exit(0);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}