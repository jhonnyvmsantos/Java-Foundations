package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Define como as casas decimais são separadas ("," || ".")
        Scanner sc = new Scanner(System.in);

        String text = "Random";
        int x = 0b1100;
        int z = sc.nextInt();
        double y = (z != 5) ? 122.6453 : 6453.122; //Expressão de condição ternária

        if (z > 0 && z != 12) {
            System.out.print("Hello "); //Print sem quebra de linha
            System.out.println("World!"); //Print com quebra de linha
        } else if (z == 0 || z == 12) {
            //BitWiser funciona ao transformar os elementos em bit(s) e comparalos de acordo com a operação
            System.out.println(y & x); //BitWise com operador "&"
        } else {
            System.out.println((z == -1) ? z | x : x ^ z); //BitWise com operador "|" ou "^" (Ou-Exclusivo)
            //Ou-Exclusivo só dá "Verdadeiro" (1) quando APENAS 1 dos bits comparados for verdadeiro, não os dois
        }

        switch (z) {
            case 10:
                while (x > 0) {
                    System.out.printf("Int: %d\n", x); //Print com formatação ("\n" add quebra de linha)
                    x -= 2;
                }
                break;
            case 5:
                for (double i = 0; i <= y; i += y / 4) {
                    System.out.printf("Double: %.2f number%n\n", i); //"%n" (também) add quebra de linha
                }
                break;
            default:
                do {
                    y -= 1 + (y / 2);
                    //If sem chaves a seguir
                    if (z <= 0) System.out.printf("%s Number is %d and %.4f\n", text, x, y); //Texto formatado com variaveis incluidas
                } while (y > 0);
                break;
        }

        sc.close();
    }

}