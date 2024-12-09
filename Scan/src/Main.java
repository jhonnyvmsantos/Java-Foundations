import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Método de ler os dados inseridos no console

        String s1, s2, s3; //Criação de multiplas variaveis sem valor definido

        s2 = sc.nextLine(); //nextLine() torna possivel ler um dado string de toda uma linha
        s3 = sc.nextLine();

        System.out.printf("Frase digitada (P/Linha): %s | %s\n", s2, s3);

        int a;
        double b;
        char c;

        //Utilizando metodos diferentes de nextLine(), pode-se ler dados (diferentes tipos incluso) numa mesma linha, separadas por espaço
        //A forma mais normal é ler esses dados linha por linha ao apertar Enter após a digitação do dado
        s1 = sc.next(); //Começar a leitura de dados do tipo string
        c = sc.next().charAt(2); //Começar a leitura de dados do tipo char uma determinada posição de uma cadeia de caracteres
        a = sc.nextInt(); //Começar a leitura de dados do tipo int
        b = sc.nextDouble(); //Começar a leitura de dados do tipo double

        System.out.printf("Foi digitado: %s | %s | %d | %.2f\n", s1, c, a, b);

        sc.close(); //Encerrar a leitura de dados
    }
}