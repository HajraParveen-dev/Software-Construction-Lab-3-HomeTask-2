package AccountValidation;

public class AccountValidation {
    private double balance;
    private boolean active = true;

    public void deposit(double amt) {

        if (amt < 0)
            throw new IllegalArgumentException();

        balance += amt;
    }

    public void withdraw(double amt) {

        if (amt < 0)
            throw new IllegalArgumentException();

        if (amt > balance)
            throw new IllegalStateException();

        balance -= amt;

        if (balance < 100)
            active = false;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}
