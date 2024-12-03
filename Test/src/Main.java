import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String text = "Random";
        int x = 12;
        double y = 122.6453;

        System.out.print("Hello "); //Print sem quebra de linha
        System.out.println("World!"); //Print com quebra de linha
        System.out.printf("Int: %d\n", x); //Print com formatação ("\n" add quebra de linha)
        System.out.printf("Double: %.2f number%n", y); //"%n" (também) add quebra de linha

        //"%s" (String), "%d" (int), "%f" (flutuante)
        System.out.printf("%s Number is %d and %.2f", text, x, y); //Texto formatado com variaveis incluidas
    }

}