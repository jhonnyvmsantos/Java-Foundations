package entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        //Vazio...
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        this.balance += this.balance * this.interestRate;
    }

    //"@Override" diz ao compílador que há uma "sobreposição" - ato de sobrepor/modificar um metodo
    //OBS: Ao ver o metodo abaixo, nota-se que é possivel haver uma sobreposição de um metodo herdado
    @Override
    public void withdraw(Double amount) { //Sobrepondo a logica de um metodo herdade da superclass
        this.balance -= amount;
    }
}
