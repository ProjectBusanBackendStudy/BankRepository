package bank.bankCore.bank;

import org.springframework.stereotype.Component;

@Component
public class MemoryBankRepository implements BankRepository{

    private static BankMoney bankMoney = new BankMoney(0);
    @Override
    public void save(int money) {
        bankMoney.setBankMoney(bankMoney.getBankMoney() + money);
    }

    @Override
    public BankMoney getBank() {
        return bankMoney;
    }
}
