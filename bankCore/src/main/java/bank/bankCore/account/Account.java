package bank.bankCore.account;

public class Account {
    private Long accountNumber;
    private int password; // 계좌 비밀번호
    private int money;

    public Account(Long accountNumber, int password, int money) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.money = money;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
