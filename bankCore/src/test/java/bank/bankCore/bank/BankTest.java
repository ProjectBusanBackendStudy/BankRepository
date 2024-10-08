package bank.bankCore.bank;

import bank.bankCore.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class BankTest {

    @Test
    @DisplayName("은행 연결 확인 및 서비스 확인")
    public void CheckBank() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        BankService bankService = ac.getBean(BankService.class);
        //given
        BankMoney bank;
        //when
        bank = bankService.myBank();
        System.out.println("bank = " + bank.getBankMoney());
        bankService.changeMoney(5000);
        //then
        assertThat(bankService.myBank()).isEqualTo(bank);
        System.out.println("bank = " + bank.getBankMoney());
        System.out.println("bankService = " + bankService.myBank().getBankMoney());
    }
}
