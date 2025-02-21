package entities;

public class Account { //"Account" é chamada de "superclass", por ser uma "classe base" (generica)
    //Ao compor duas classes, tem-se uma associação entre classes
    //OBS: Um objeto criado a partir de uma subclasse n mantém essa associação, apenas é construido com os mesmos atributos e operações de ambas as classe...

    private Integer number;
    private String holder;
    //private torna o atributo manipulavel APENAS pela propria classe...
//    private Double balance;

    //private torna o atributo manipulavel pela propria classe, classes do mesmo pacote e classes "herdeiras"...
    protected Double balance;

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
