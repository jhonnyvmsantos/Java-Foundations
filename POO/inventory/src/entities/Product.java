package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) { //Criando um método sem retorno
        //Ao utilizar "this", faz-se referencia ao atributo da classe, evitando uma ambiguidade por nomes iguais
        this.quantity += quantity;
    }

    public void removeProduct(int qtd) {
        quantity -= qtd;
    }

    public String toString() { //Sobrepondo a operação (padrão) toString da classe Object para o que eu quiser
        //O método "String.format" serve para definir um formato de exibição para uma variavel
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units. Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
