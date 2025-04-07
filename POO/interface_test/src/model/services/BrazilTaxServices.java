package model.services; //Pacote focado em guardar "Serviços"
//OBS: Porque não tornar a classe "...Service" em uma static class? (Dependendo da classe)

//Uma classe focada em realizar um serviço especifico
public class BrazilTaxServices implements TaxService{ //Implementando o contrato de uma interface
    //OBS: Não há construtores por não haver atributos, apenas um método que já recebe um argumento

    public double tax(double amount) { //metodo obrigatorio definido pela interface
        if (amount <= 100) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
