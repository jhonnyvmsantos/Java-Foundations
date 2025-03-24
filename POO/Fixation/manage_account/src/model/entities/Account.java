package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
        //Vazio...
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

        if (balance < 0) {
            throw new DomainException("Account create error: Initial balance invalid");
        }

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        if (amount <= 0) {
            throw new DomainException("Deposit error: Deposit amount must be greater than zero (0)");
        }

        this.balance += amount;
    }

    public void withdraw(Double amount) {

        if (amount <= 0) {
            throw new DomainException("Withdraw error: Withdraw amount must be greater than zero (0)");
        }

        if (amount > this.withdrawLimit) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }

        if (amount > this.balance) {
            throw new DomainException("Withdraw error: Not enough balance");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Current balance: " + String.format("%.2f", this.getBalance());
    }
}
