package sopt.org.firstSeminar.BankProgram;

import static sopt.org.firstSeminar.BankProgram.BankClient.accountArrayList;

public class ShinhanBank extends Bank {
    @Override
    public void printWelcomeComment() {
        System.out.println("어서오세요, 신한은행 입니다.");
    }

    @Override
    public void deposit(int accountNumber, int money) {
        Account account = getAccountByNumber(accountNumber);
        account.deposit(money);
        System.out.println("신한은행에 입금이 완료되었습니다.");
    }

    @Override
    public void withdraw(int accountNumber, int money) {
        Account account = getAccountByNumber(accountNumber);
        try {
            account.withdraw(money);
            System.out.println("신한은행에서 출금이 완료되었습니다.");
        } catch (Exception e) {
            System.out.println("신한은행 계좌에 잔고가 부족합니다.");
        }
    }

    @Override
    public int getBalance(int accountNumber) {
        Account account = getAccountByNumber(accountNumber);
        return account.getBalance();
    }

    private Account getAccountByNumber(int accountNumber) {
        return accountArrayList.get(accountNumber);
    }
}
