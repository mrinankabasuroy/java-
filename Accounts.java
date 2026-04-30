abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(int acc, String name, String address, double bal) {
        this.accountNumber = acc;
        this.name = name;
        this.address = address;
        this.balance = bal;
    }

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int acc, String name, String address, double bal, double roi) {
        super(acc, name, address, bal);
        rateOfInterest = roi;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        balance += balance * rateOfInterest / 100;
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Ali", "Delhi", 10000, 5);

        s.deposit(2000);
        s.withdraw(1000);
        s.calculateAmount();
        s.display();
    }
}