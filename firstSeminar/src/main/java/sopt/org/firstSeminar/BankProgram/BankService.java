package sopt.org.firstSeminar.BankProgram;

public class BankService {
    private Bank bank;

    //생성자 주입
    public BankService(Bank bank) {
        this.bank = bank;
    }

    public void printWelcomeComment() {
        bank.printWelcomeComment();
    }

    public void printClosingComment() {
        bank.printClosingComment();
    }

    public void deposit(int accountNumber, int money) {
        bank.deposit(accountNumber, money);
    }

    public void withdraw(int accountNumber, int money) {
        bank.withdraw(accountNumber, money);
    }

    public void checkBalance(int accountNumber) {
        int balance = bank.getBalance(accountNumber);
        System.out.printf("고객님의 잔액은 %d원 입니다.", balance);
        System.out.println();
    }
}
