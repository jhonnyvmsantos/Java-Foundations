package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        sc.close();
//    }

    //"throws ParseException" diz que esse metodo NÃO trata de exceções, tendo permissão para lançar exceções não tratadas
    public static void main(String[] args) throws ParseException {
        //OBS: Ainda é possivel tratar tais exceções "propagadas" no método através de outros métodos que a chamem

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        //A função "after" da classe "Date" verifica se uma data é posterior a outra
        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date nust be after check-in date.");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);

            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }

        sc.close();
    }
}