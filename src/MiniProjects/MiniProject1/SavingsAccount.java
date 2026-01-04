package MiniProjects.MiniProject1;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            return true;
        }
        System.out.println("Minimum balance must be 500");
        return false;
    }
}
