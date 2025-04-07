package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.exceptions.DomainException;
import model.services.BrazilTaxServices;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rental data:");

        try {
            System.out.print("Car model: ");
            String model = sc.nextLine();

            System.out.print("Introduced on: ");
            LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

            System.out.print("Retrieved on: ");
            LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

            CarRental cr = new CarRental(start, finish, new Vehicle(model));

            System.out.print("Enter the price per hour: ");
            double pricePerHour = sc.nextDouble();

            System.out.print("Enter the price per day: ");
            double pricePerDay = sc.nextDouble();

            //Embora na classe há um atributo de uma interface, por implementar tal interface, é possivel utilizar BrazilTaxServices
            //... ou outra classe que implemente a interface
            RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
            rentalService.proccessInvoice(cr);

            System.out.println("Invoice:");
            System.out.println(cr);

            //Acessando ouma variavel do invoice usando CarRental como intermediario
//            System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
//            System.out.println("Tax: " + cr.getInvoice().getTax());
//            System.out.println("Total payment: " + cr.getInvoice().getTotalPayment());
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Data Entry.");
        } catch (DateTimeParseException e) {
            System.out.println("Error converting the date.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected Error.");
        }

        sc.close();
    }
}