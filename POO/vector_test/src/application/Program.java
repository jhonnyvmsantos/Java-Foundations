package application;

import entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        //Vetores tem um acesso imediato ao elemento referido...
        double[] vect = new double[n]; //Criação de um vetor (Utilizando "[]")
        //Todo vetor precisa iniciar com um tamanho fixo, embora tenha "jeitos" (dificeis) de inserir ou deletar algo

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número a ser alocado no vetor: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print(Arrays.toString(vect));

        System.out.print("Executar outra função do projeto (y/n)? ");
        char verification = sc.next().charAt(0);
        if (verification == 'y') {
            alter_main();
        }

        sc.close();
    }

    public static void alter_main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        Product[] vect = new Product[sc.nextInt()]; //Por padrão, todos os itens são nulos (null)

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;

        //Laço "For Each" (Percorre um vetor por inteiro)
        for (Product obj : vect) {
            sum += obj.setPrice();
        }

        System.out.printf("Average price: %.2f", sum / vect.length);

        sc.close();
    }
}