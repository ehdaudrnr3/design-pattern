package com.design.pattern.adapter.security;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword("1234");
        account.setEmail("test@email.com");
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}
