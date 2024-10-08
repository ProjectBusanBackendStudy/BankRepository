package bank.bankCore.bank;

import org.springframework.stereotype.Component;

@Component
public class BankServiceImpl implements BankService{

    private final MemoryBankRepository memoryBankRepository;

    public BankServiceImpl(MemoryBankRepository memoryBankRepository) {
        this.memoryBankRepository = memoryBankRepository;
    }

    @Override
    public BankMoney myBank() {
        BankMoney bank = memoryBankRepository.getBank();
        return bank;
    }

    @Override
    public void changeMoney(int money) {
        memoryBankRepository.save(money);
    }
}
