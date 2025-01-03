package entities;

public class Account {

    final int tax = 5;
    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        balanceDeposit(initialDeposit);
    }

    public double getNumber() {
        return this.number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void balanceDeposit(double value) {
        this.balance += value;
    }

    public void balanceWithdraw(double value) {
        this.balance -= (value + tax);
    }

    public String toString() {
        return "Account " + number + ", holder: " + holder + ", balance: $ " + String.format("%.2f", balance);
    }
}
