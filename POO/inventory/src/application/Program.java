package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //"static" = "membros de classe". Não precisam de objetos para serem chamados, podendo ser chamado a partir do proprio nome da classe...
    public static void main(String[] args) { //classes estaticas não podem ser instanciadas

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity); //Enviando valores para o constructor

//        product.setName("Computer"); //Executando a operação de encapsulamento p/alterar uma variavel
//        System.out.println(product.getName()); //Executando a operação de encapsulamento p/chamar o valor de uma variavel

//        System.out.println(product.toString()); //Transformando o objeto em String

        //Por padrão, o objeto, ao ser exibido, é transformado em String, forçando a execução do método "toString"
        System.out.println("Product Data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProduct(sc.nextInt());
        System.out.println("Updated Data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProduct(sc.nextInt());
        System.out.println("Updated Data: " + product);

        sc.close();
    }

}