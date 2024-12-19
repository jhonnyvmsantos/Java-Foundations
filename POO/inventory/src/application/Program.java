package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

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