package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

    public Account() {
        //Vazio...
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
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

    public void withdraw(Double amouunt) {
        this.balance -= amouunt;
    }

    public void deposit(Double amouunt) {
        this.balance += amouunt;
    }
}
