package application;

import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = null;

        try {
            System.out.println("Enter account data:");

            System.out.print("Number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            acc = new Account(number, holder, balance, withdrawLimit);
        } catch (RuntimeException e) {
            System.out.println("Unexpected Error.");
        }

        sc.close();
    }
}