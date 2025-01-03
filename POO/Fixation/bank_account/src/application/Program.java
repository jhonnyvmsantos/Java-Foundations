package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Enter initial deposit value (y/n)?: ");
        char initial = sc.next().charAt(0);

        if (initial == 'y') {
            System.out.print("Enter initial deposit value: ");
            account = new Account(number, holder, sc.nextDouble());
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data:\n" + account);

        System.out.print("Enter a deposit value: ");
        account.balanceDeposit(sc.nextDouble());
        System.out.println("Updated account data:\n" + account);

        System.out.print("Enter a withdraw value: ");
        account.balanceWithdraw(sc.nextDouble());
        System.out.println("Updated account data:\n" + account);

        sc.close();
    }
}