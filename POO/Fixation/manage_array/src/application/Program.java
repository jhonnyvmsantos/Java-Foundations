package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina o número (inteiro) de colunas: ");
        int cols = sc.nextInt();

        System.out.print("Defina o número (inteiro) de linhas: ");
        int lines = sc.nextInt();

        int[][] arr = new int[cols][lines];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Insira %d números inteiros (Coluna %d):\n", lines, (i + 1));

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Escolha um número (Inserido anteriormente): ");
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    System.out.println("------------------------------");

                    System.out.printf("Position: (%d,%d)\n", i, j);

                    if (i > 0) {
                        System.out.println("Up: " + arr[i - 1][j]);
                    }

                    if (j > 0) {
                        System.out.println("Left: " + arr[i][j - 1]);
                    }

                    if ((j + 1) < arr[i].length) {
                        System.out.println("Right: " + arr[i][j + 1]);
                    }

                    if ((i + 1) < arr.length) {
                        System.out.println("Down: " + arr[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}