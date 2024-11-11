package bank.bankCore.member;

import bank.bankCore.account.Account;

public class Member {
    private Long id;
    private String name;
    private int password;
    // 현재 단일 어카운트...
    private Account account;

    public Member(Long id, String name, int password, Account account) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getPassword() { return password; }

    public void setPassword(int password) { this.password = password; }
}
