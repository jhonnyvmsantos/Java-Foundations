package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Set the size of the array (Ex: 0): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int nCount = 0;

        //Método com "for padrão" para percorrer uma matriz
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter three (3) integers: ");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] < 0) {
                    nCount++;
                }
            }
        }

        System.out.printf("Quantity of negative numbers: %d\n", nCount);

        System.out.println("Main diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }

        sc.close();
    }

}