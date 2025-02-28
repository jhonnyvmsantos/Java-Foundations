package entities;

//prefixo "final" torna impossivel de criar uma subclass de determinada classe...
public final class SavingsAccount extends Account {
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
    public void withdraw(Double amount) {//Sobrepondo a logica de um metodo herdade da superclass
        //OBS: Não há necessidade de adicionar o prefixo "final" numa "final class", pois nada irá herda-lo
        this.balance -= amount;
    }
}
