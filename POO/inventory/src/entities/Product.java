package entities;

public class Product {

    public String name; //Valor padrão: null
    public double price; //Valor padrão: 0.0
    public int quantity; //Valor padrão: 0

    //"Constructor" é uma operação especial da classe, executada no momento da instanciação do objeto
    public Product(String name, double price, int quantity) { //Definindo valores a serem, obrigatoriamente, alocados
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) { //Criando um método sem retorno
        //Ao utilizar "this", faz-se referencia ao atributo da classe, evitando uma ambiguidade por nomes iguais
        this.quantity += quantity; //A palavra "this" é uma referencia ao proprio objeto/classe
    }

    public void removeProduct(int qtd) {
        quantity -= qtd;
    }

    public String toString() { //Sobrepondo a operação (padrão) "toString" da classe Object para o que eu quiser
        //O método "String.format" serve para definir um formato de exibição para uma variavel
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units. Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
