package oldApplication;

import java.util.Locale;
import java.util.Scanner;

public class OldProgram {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        double pX, pY, areaX, areaY;

        System.out.println("Enter the measures (3) of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        pX = (xA + xB + xC) / 2;
        areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        System.out.println("Enter the measures (3) of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        pY = (yA + yB + yC) / 2;
        areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        System.out.printf("Larger area: %s", areaX > areaY ? "X" : "Y");

        sc.close();
    }
}