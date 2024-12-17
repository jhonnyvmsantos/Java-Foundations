package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

//        int x = 511;

//        a = Math.abs(x); //Valor absoluto de um número (Sem negativo, caso exista)
//        b = Math.sqrt(x); //Raiz quadrada de um número
//        c = Math.pow(x, 2); //Potencialização de um número

//        System.out.printf("Os valores de a, b e c são, respectivamente: %.2f | %.2f | %.2f\n", a, b, c);

        //Bhaskara formula
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("Resultado: x1: %.2f | x2: %.2f\n", x1, x2);
    }
}