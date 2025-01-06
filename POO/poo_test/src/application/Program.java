package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Toda classe é uma subclasse da classe Object, herdando alguns metodos dela, como: equals, toString, getClass...
        Triangle x, y; //Criando duas variaveis do tipo classe (referencias a um objeto)
        x = new Triangle(); //Instanciando um objeto de uma classe
        y = new Triangle();

        System.out.println("Enter the measures (3) of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double areaX = x.area();

        System.out.println("Enter the measures (3) of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        System.out.printf("Larger area: %s", areaX > areaY ? "X" : "Y");

        sc.close();
    }
}
