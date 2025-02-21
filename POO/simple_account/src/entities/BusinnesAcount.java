package entities;

//"Extends" método que torna possivel "herdar" atributos e operações de outras classes...
public class BusinnesAcount extends Account{ //"BusinnesAcount" é chamada de "subclass", por derivar de uma "superclass" (Account), tornando-se uma classe "especializada"
    private final Integer fee = 10;
    private Double loanLimit;

    public BusinnesAcount() {
        super(); //"super" torna possivel reaproveitar alguma logica inclusa na "SuperClasse" (Account), msm que não exista argumentos sendo reaproveitados...
    }

    public BusinnesAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //"super" torna possivel reaproveitar os argumentos da "SuperClasse" (Account)
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            //Utilizando o prefixo "protected" é possivel acessar o atributo da superclass ao herda-la
            this.balance += amount - this.fee;
        }
    }
}
