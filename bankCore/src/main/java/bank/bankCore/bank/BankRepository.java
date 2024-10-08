package bank.bankCore.bank;

public interface BankRepository {

    void save(int money);

    BankMoney getBank();
}
