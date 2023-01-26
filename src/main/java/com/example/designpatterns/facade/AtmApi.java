package com.example.designpatterns.facade;

public class AtmApi {
    private BankAccount bankAccount;
    private Transfer transfer;
    private PhoneCard phoneCard;

    public AtmApi() {
        this.bankAccount = new BankAccount();
        this.transfer = new Transfer();
        this.phoneCard = new PhoneCard();
    }

    public void start() {
        bankAccount.deposit(5000);
        bankAccount.payout(2000);
        transfer.transferMoney("John", "James", 6000);
        phoneCard.recharge(567123623, 200);
    }
}
