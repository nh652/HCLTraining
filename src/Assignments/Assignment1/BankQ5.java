package Assignments.Assignment1;

import java.util.Scanner;

class BankQ5 {
    String name;
    int accNo;
    double balance;

    BankQ5(String n, int a, double b) {
        name = n;
        accNo = a;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt > balance)
            throw new ArithmeticException("Insufficient Balance");
        balance -= amt;
    }

    void display() {
        System.out.println(name + " " + accNo + " " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankQ5 b = new BankQ5(sc.next(), sc.nextInt(), sc.nextDouble());
        int ch = sc.nextInt();

        try {
            if (ch == 1) b.deposit(sc.nextDouble());
            if (ch == 2) b.withdraw(sc.nextDouble());
            if (ch == 3) System.out.println(b.balance);
            if (ch == 4) b.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

