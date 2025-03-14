package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            //Ao retirar as capturas de exceções lançadas, o programa quebra e desmontra a mensagem de erro
            //OBS: Incluindo, as mensagens personalizadas criadas na classe "DomainException"
        } catch (InputMismatchException e) {
            System.out.println("Invalid room number.");
        } catch (ParseException e) { //Capturando um possivel erro causado ao converter um formato de data
            //OBS: Tal erro é visivel nesta mesma classe, ao retirar essa captura
            System.out.println("Invalid date format.");

        //} catch (IllegalArgumentException e) { //Capturando um possivel erro causado por entrada de dados invalidas
        //OBS: Tal verificação do erro está dentro da classe "Reservation"

        } catch (DomainException e) {//Capturando um possivel erro com tratamento personalido na classe "DomainException"

            System.out.println("Error in reservation: " + e.getMessage());
            //Mostrando a mensagem personalizada criada para a ocorrência de tal erro na classe "Reservation" ^^^^
        } catch (RuntimeException e) { //Captura para qualquer outro erro não listado
            System.out.println("Unexpected Error.");
        }

        sc.close();
    }

    //"throws ParseException" diz que esse metodo NÃO trata de exceções, tendo permissão para lançar exceções não tratadas em outra classe/metodo
//    public static void main(String[] args) throws ParseException {
//        //OBS: Ainda é possivel tratar tais exceções "propagadas" no método através de outros métodos que a chamem
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//        System.out.print("Room number: ");
//        int number = sc.nextInt();
//
//        System.out.print("Check-in date (dd/MM/yyyy): ");
//        Date checkIn = sdf.parse(sc.next());
//
//        System.out.print("Check-out date (dd/MM/yyyy): ");
//        Date checkOut = sdf.parse(sc.next());
//
//        //A função "after" da classe "Date" verifica se uma data é posterior a outra
//        if (!checkOut.after(checkIn)) {
//            System.out.println("Error in reservation: Check-out date nust be after check-in date.");
//        } else {
//            Reservation reservation = new Reservation(number, checkIn, checkOut);
//            System.out.println("Reservation: " + reservation);
//
//            System.out.println("Enter data to update the reservation:");
//
//            System.out.print("Check-in date (dd/MM/yyyy): ");
//            checkIn = sdf.parse(sc.next());
//
//            System.out.print("Check-out date (dd/MM/yyyy): ");
//            checkOut = sdf.parse(sc.next());
//
//            String error = reservation.updateDates(checkIn, checkOut);
//
//            if (error != null) {
//                System.out.println("Error in reservation: " + error);
//            } else {
//                System.out.println("Reservation: " + reservation);
//            }
//        }
//
//        sc.close();
//    }
}