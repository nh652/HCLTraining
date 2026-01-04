package MiniProjects.MiniProject1;

public class CurrentAccount extends Account {

    public CurrentAccount(int accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }
}
