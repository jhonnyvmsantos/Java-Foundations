package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.InstallmentService;
import model.services.PayPalPayment;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static model.services.DateFormat.dtFormat;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        System.out.print("");

        System.out.println("Enter the contract data:");
        try {
            System.out.print("Contract number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Contract date (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), dtFormat);

            System.out.print("Contract value: ");
            double total = sc.nextDouble();

            Contract contract = new Contract(number, date, total);

            System.out.print("Number of installments: ");
            int quantity = sc.nextInt();

            InstallmentService installmentService = new InstallmentService(quantity, contract, new PayPalPayment());
            installmentService.installmentProcess();

            for (Installment installment : contract.getParcels()) {
                System.out.println(installment);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid contract date.");
        } catch (InputMismatchException e) {
            System.out.println("Entry invalid data.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
            e.printStackTrace();
        }

        sc.close();
    }
}