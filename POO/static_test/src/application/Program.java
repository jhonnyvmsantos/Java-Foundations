package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //Não há instância ou objetos para classes/membros "static", apenas chame pelo seu nome
//    public static final double PI = 3.14159; //Declaração de um membro "static"

    public static void main(String[] args) {
        //Dentro de um método "static", não é possível chamar outro que não seja "static", exceto atraves de um objeto/instância

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        //Chamando um metodo static atraves do nome da classe (sem objeto/instancia)
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.println("Circumference: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("PI Value: " + Calculator.PI);

        sc.close();
    }

//    public static double circumference(double radius) {
//        return 2 * PI * radius;
//    }
//
//    public static double volume(double radius) {
//        return  4 * PI * Math.pow(radius, 3) / 3;
//    }
}