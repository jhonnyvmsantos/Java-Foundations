package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.quantity = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + CurrencyConverter.dollarConvert());

        sc.close();
    }
}