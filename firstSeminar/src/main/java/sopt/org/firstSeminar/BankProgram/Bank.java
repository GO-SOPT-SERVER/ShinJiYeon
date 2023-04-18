package sopt.org.firstSeminar.BankProgram;

public abstract class Bank {

    abstract public void printWelcomeComment();

    abstract public void deposit(int accountNumber, int money);

    abstract public void withdraw(int accountNumber, int money);

    abstract public int getBalance(int accountNumber);

    //클로징 멘트는 고정
    public void printClosingComment() {
        System.out.println("이용해주셔서 감사합니다.");
    }
}
