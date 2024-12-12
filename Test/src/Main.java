import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Define como as casas decimais são separadas ("," || ".")
        Scanner sc = new Scanner(System.in);

        String text = "Random";
        int x = 12;
        int z = sc.nextInt();
        double y = (z >= 0) ? 122.6453 : 6453.122; //Expressão de condição ternária

        if (z > 0) {
            System.out.print("Hello "); //Print sem quebra de linha
            System.out.println("World!"); //Print com quebra de linha
        } else if (z == 0) {
            System.out.println("Hello && World!");
        } else {
            System.out.println("World! && Hello");
        }

        switch (z) {
            case 10:
                System.out.printf("Int: %d\n", x); //Print com formatação ("\n" add quebra de linha)
                break;
            case 5:
                System.out.printf("Double: %.2f number%n", y); //"%n" (também) add quebra de linha
                break;
            default:
                //If sem chaves a seguir
                if (z <= 0) System.out.printf("%s Number is %d and %.4f", text, x, y); //Texto formatado com variaveis incluidas
                break;
        }

        sc.close();
    }

}