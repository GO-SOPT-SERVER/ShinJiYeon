package sopt.org.firstSeminar.BankProgram;

import static sopt.org.firstSeminar.BankProgram.BankClient.accountArrayList;

public class Account {
    private String ownerName;
    private int AccountNumber;
    private int balance;

    public Account(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.AccountNumber = accountArrayList.size();
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        if(balance >= money) {
            this.balance -= money;
        } else {
            throw new RuntimeException("잔고 부족");
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
