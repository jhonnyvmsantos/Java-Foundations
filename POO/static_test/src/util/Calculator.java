package util;

public class Calculator {

    //"final" torna o valor constante (sem mudanças)
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return  4 * PI * Math.pow(radius, 3) / 3;
    }
}
