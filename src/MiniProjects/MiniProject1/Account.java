package MiniProjects.MiniProject1;

import java.io.Serializable;

public abstract class Account implements Serializable {
    protected int accountNo;
    protected String name;
    protected double balance;

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
