package bank.bankCore.bank;

public class BankMoney {
    private int bankMoney; // 마이너스 가능

    public BankMoney(int bankMoney) {
        this.bankMoney = bankMoney;
    }

    public int getBankMoney() {
        return bankMoney;
    }

    public void setBankMoney(int bankMoney) {
        this.bankMoney = bankMoney;
    }
}
