package bank.bankCore.account;

import bank.bankCore.bank.BankMoney;
import bank.bankCore.bank.BankRepository;
import bank.bankCore.bank.BankService;
import bank.bankCore.member.Member;
import bank.bankCore.member.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements AccountService {

    private final MemberRepository memberRepository;
    private final BankService bankService;

    public AccountServiceImpl(MemberRepository memberRepository, BankService bankService) {
        this.memberRepository = memberRepository;
        this.bankService = bankService;
    }


    @Override
    public void inputMoney(Member member, BankMoney bankMoney, int money) {
        member.setMoney(member.getMoney() + money);
        bankService.changeMoney(money);
    }

    @Override
    public void outputMoney(Member member, BankMoney bankMoney, int money) {
        int nowMoney = member.getMoney();
        if(nowMoney < money) {
            System.out.println("Your account balance is lower than money."
                    + " nowMoney = " + nowMoney);
            return;
        }
        member.setMoney(member.getMoney() - money);
        bankService.changeMoney(-money);
    }
}
