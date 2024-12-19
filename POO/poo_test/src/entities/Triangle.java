package entities;

public class Triangle {
    public double a, b, c; //Definindo todos os atributos como publicos (acessaveis por outros arquivos)

    public double area() { //Criando um metodo que retorna um valor double, acessavel por outro arquivo
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
