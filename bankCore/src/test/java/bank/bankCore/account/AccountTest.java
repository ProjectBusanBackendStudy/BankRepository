package bank.bankCore.account;

import bank.bankCore.AppConfig;
import bank.bankCore.bank.BankService;
import bank.bankCore.member.Member;
import bank.bankCore.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class AccountTest {

    @Test
    @DisplayName("입출금 테스트")
    void InOutTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        AccountService accountService = ac.getBean(AccountService.class);
        BankService bankService = ac.getBean(BankService.class);

        //given
        Member member = new Member(1L, "csw", 123, 0);
        memberService.join(member);

        System.out.println("member = " + member.getMoney());
        System.out.println("bankService = " + bankService.myBank().getBankMoney());

        //when1
        accountService.inputMoney(member, bankService.myBank(), 5000);

        //then2
        assertThat(bankService.myBank().getBankMoney()).isEqualTo(5000);
        System.out.println("member = " + member.getMoney());
        System.out.println("bankService = " + bankService.myBank().getBankMoney());

        //when2
        accountService.outputMoney(member, bankService.myBank(), 3000);

        //then2
        assertThat(bankService.myBank().getBankMoney()).isEqualTo(2000);
        System.out.println("member = " + member.getMoney());
        System.out.println("bankService = " + bankService.myBank().getBankMoney());

        //when3
        accountService.outputMoney(member, bankService.myBank(), 3000);

        //then3
        assertThat(bankService.myBank().getBankMoney()).isEqualTo(-1000);
        System.out.println("member = " + member.getMoney());
        System.out.println("bankService = " + bankService.myBank().getBankMoney());
    }
}
