package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        //Criando uma lista com um tipo abstrato (generico) para armazenar diferentes instancias de subclasses do tipo
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");

            System.out.print("Rectangle or Circle (r/c): ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPES AREAS:");
        for (Shape e : shapes) {
            System.out.printf("%.2f%n", e.area());
        }

        sc.close();
    }
}