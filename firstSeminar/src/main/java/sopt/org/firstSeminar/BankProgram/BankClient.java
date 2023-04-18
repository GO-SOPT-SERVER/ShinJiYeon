package sopt.org.firstSeminar.BankProgram;

import java.util.ArrayList;

public class BankClient {
    public static ArrayList<Account> accountArrayList;

    public static void main(String[] args) {
        //은행프로그램에서 사용할 계좌리스트
        accountArrayList = new ArrayList<>();

        //계좌 생성
        Account account = new Account("shinjiyeon");
        accountArrayList.add(account);

        //신한은행 이용
        BankService bankService = new BankService(new ShinhanBank());

        //은행 이용 시작
        bankService.printWelcomeComment();

        //입금 & 잔액 확인
        bankService.deposit(0, 1000);
        bankService.checkBalance(0);

        //출금 & 잔액 확인
        bankService.withdraw(0, 500);
        bankService.checkBalance(0);

        //은행 이용 종료
        bankService.printClosingComment();
    }
}
