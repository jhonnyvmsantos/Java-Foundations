package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try { //Executa o codigo em seu interior
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();

            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) { //Tal erro se refere a uma posição inexistente no array
            //Captura um possivel erro e executa o codigo em seu interior
            System.out.println("Invalid position!");
        } catch (InputMismatchException e) { //Tal erro se refere a uma entrada de dados invalida
            System.out.println("Input Error!");
        }

        System.out.println("Hello, World!");

        sc.close();
    }
}