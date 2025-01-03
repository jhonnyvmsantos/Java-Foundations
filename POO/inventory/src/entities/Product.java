package entities;

/* Padrão p/organização das classes:
        1. Variaveis da(o) classe/objeto
        2. Constructor da(o) classe/objeto
        3. Operações/Métodos de encapsulamento
        4. Métodos da(o) classe/objeto
*/

public class Product {

    //Tornando o atributo inacessivel, diretamente, por outras classes
    private String name; //Valor padrão: null
    private double price; //Valor padrão: 0.0
    private int quantity; //Valor padrão: 0
    //Muito utilizado para o encapsulamento (Tornando segura a execução de uma classe e seus metodos para o usuario)

    // -----------------------------------------------------------------------------------------------------------

    //"Constructor" é uma operação especial da classe, executada no momento da instanciação do objeto
//    public Product() { //É possivel ter varios construtores...
//        //Definindo um "Constructor" padrão para caso não queira alocar os parametros no momento da instanciação do obj
//    }

    //Definindo parametros a serem, obrigatoriamente, alocados durante a instanciação
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //"Sobrecarga" de um constructor (mesma operação com parametros diferentes)
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
//        quantity = 0; //Linha de código opcional, pois a variavel já inicia com valor 0
    }

    // -----------------------------------------------------------------------------------------------------------

    //Operação padrão de encapsulamento para alterar o valor de uma variavel
    public void setName(String name) {
        this.name = name;
    }

    //Operação padrão de encapsulamento para chamar o valor de uma variavel
    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    //Sem metodo set p/tal variavel, pois só pode ser alterada pelos metodos addProduct e removeProduct (Regra de negocio)
    public int getQuantity() {
        return this.quantity;
    }

    // -----------------------------------------------------------------------------------------------------------

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
