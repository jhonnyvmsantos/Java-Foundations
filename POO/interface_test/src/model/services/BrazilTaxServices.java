package model.services; //Pacote focado em guardar "Serviços"
//OBS: Porque não tornar a classe "...Service" em uma static class?

//Uma classe focada em realizar um serviço envolvendo, principalmente, interação co classe(s)
public class BrazilTaxServices {
    //OBS: Não há construtores por não haver atributos, apenas um método que já recebe um argumento

    public double tax(double amount) {
        if (amount <= 100) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
