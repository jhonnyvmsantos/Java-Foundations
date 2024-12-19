package util;

public class CurrencyConverter {
    public static final double IOF = 6;
    public static double dollar, quantity;

    public static double dollarConvert() {
        double result = dollar * quantity;
        return result + result * (IOF / 100);
    }

}
