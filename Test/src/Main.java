import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Define como as casas decimais são separadas ("," || ".")
        Scanner sc = new Scanner(System.in);

        String text = "Random";
        int x = 12;
        double y = 122.6453;
        int z = sc.nextInt();

        if (z >= 0) {
            System.out.print("Hello "); //Print sem quebra de linha
            System.out.println("World!"); //Print com quebra de linha
        } else {
            System.out.println("Hello && World!");
        }

        if (z == 10) {
            System.out.printf("Int: %d\n", x); //Print com formatação ("\n" add quebra de linha)
        } else if (!(z == 5)) {
            System.out.printf("Double: %.2f number%n", y); //"%n" (também) add quebra de linha
        } else {
            //"%s" (String), "%d" (int), "%f" (flutuante)
            System.out.printf("%s Number is %d and %.2f", text, x, y); //Texto formatado com variaveis incluidas
        }

        sc.close();
    }

}