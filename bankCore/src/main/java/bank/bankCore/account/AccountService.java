package bank.bankCore.account;

import bank.bankCore.bank.BankMoney;
import bank.bankCore.member.Member;

public interface AccountService {
    // 각각 멤버와 은행의 잔고 변경 필요
    void inputMoney(Member member, BankMoney bankMoney, int money);
    void outputMoney(Member member, BankMoney bankMoney,int money);
}
