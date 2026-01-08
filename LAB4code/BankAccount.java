import java.util.*;

class Account {
    static int autoAccNo = 1000;
    int accNo;
    String name, accType;
    double balance;
    int day, month, year;

    Account(String name, String accType, double balance, int d, int m, int y) {
        this.accNo = ++autoAccNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        this.day = d;
        this.month = m;
        this.year = y;
        System.out.println("Account created. Account No: " + accNo);
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Withdrawal rule defined in subclass");
    }
}

class PremiumAccount
class StandardAccount extends Account {
    StandardAccount(String name, double balance, int d, int m, int y) {
        super(name, "Standard", balance, d, m, y);
    }

    @Override
    void withdraw(double amt) {
        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " (No charge)");
        } else if (amt <= 500000) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs " + amt + " with penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class PremiumAccount extends Account {
    PremiumAccount(String name, double balance, int d, int m, int y) {
        super(name, "Premium", balance, d, m, y);
    }

    @Override
    void withdraw(double amt) {
        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Daily limit exceeded");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account a1 = new StandardAccount("Rahul", 800000, 1, 1, 2026);
        Account a2 = new PremiumAccount("Anita", 2000000, 2, 1, 2026);

        a1.withdraw(200000);   // Dynamic Method Dispatch
        a1.checkBalance();

        a2.withdraw(700000);   // Dynamic Method Dispatch
        a2.checkBalance();
    }
}
