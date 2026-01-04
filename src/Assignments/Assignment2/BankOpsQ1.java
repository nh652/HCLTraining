package Assignments.Assignment2;

interface BankOps {
    void deposit(double amt);
    void withdraw(double amt);
}

interface CustomerOps {
    void showDetails();
}

class BankOpsQ1 implements BankOps, CustomerOps {
    String name;
    double balance;

    BankOpsQ1(String n, double b) {
        name = n;
        balance = b;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance)
            throw new ArithmeticException("Insufficient Balance");
        balance -= amt;
    }

    public void showDetails() {
        System.out.println(name + " " + balance);
    }

    public static void main(String[] args) {
        BankOpsQ1 b = new BankOpsQ1("Nikhil", 5000);
        try {
            b.deposit(2000);
            b.withdraw(1000);
            b.showDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
