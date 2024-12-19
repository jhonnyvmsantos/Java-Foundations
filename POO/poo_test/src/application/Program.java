package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures (3) of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        x.p = (x.a + x.b + x.c) / 2;
        x.area = Math.sqrt(x.p * (x.p - x.a) * (x.p - x.b) * (x.p - x.c));

        System.out.println("Enter the measures (3) of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        y.p = (y.a + y.b + y.c) / 2;
        y.area = Math.sqrt(y.p * (y.p - y.a) * (y.p - y.b) * (y.p - y.c));

        System.out.printf("Triangle X area: %.4f\n", x.area);
        System.out.printf("Triangle Y area: %.4f\n", y.area);

        System.out.printf("Larger area: %s", x.area > y.area ? "X" : "Y");

        sc.close();
    }
}
