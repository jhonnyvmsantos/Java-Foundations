package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Retire os comentários no código para começar os calculos.");


        //Leitura do valor do número (Um valor na entrada)
//        int x = sc.nextInt();
//        valueReading(x);


        //Separação de número par/ímpar (Um valor na entrada)
//        int y = sc.nextInt();
//        oddOrEven(y);


        //Identificação de números multiplos (Dois valores na entrada)
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        multipleIdentifier(a, b);


        //Calculo de tempo de um jogo (Dois valores na entrada)
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        gamerTimer(c, d);

        sc.close();
    }

    public static void valueReading(int x) {
        if (x >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }
    }

    public static void oddOrEven(int y) {
        if ((y % 2) == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }

    public static void multipleIdentifier(int a, int b) {
        if ((b % a) == 0 || (a % b) == 0) {
            System.out.println("São multiplos.");
        } else {
            System.out.println("Não são multiplos.");
        }
    }

    public static void gamerTimer(int c, int d) {
        if (c < d) {
            System.out.printf("O jogo durou %d hora(s)", Math.abs(c - d));
        }
        else {
            System.out.printf("O jogo durou %d hora(s)", Math.abs(24 - c + d));
        }
    }

}