package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Retire os comentários no código para começar os calculos.");

        //Soma dos números (Dois valores na entrada)
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        sumNumbers(x, y);


        //Área de um circulo (Um valor na entrada)
//        double r = sc.nextDouble();
//        circleArea(r);


        //Diferença entre dois pares de números (Quatro valores na entrada)
//        int a, b, c, d;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        d = sc.nextInt();
//        pairsDifference(a, b, c, d);


        //Calculo do salario de um funcionário (Três valores na entrada)
//        int number = sc.nextInt();
//        double hours = sc.nextDouble();
//        double valor = sc.nextDouble();
//        salaryCalc(number, hours, valor);


        //Calculo do valor total de duas "peças" (Seis valores na entrada - Três valores p/cada peça)
//        int code1, qtd1, code2, qtd2;
//        double val1, val2;
//        code1 = sc.nextInt();
//        qtd1 = sc.nextInt();
//        val1 = sc.nextDouble();
//        code2 = sc.nextInt();
//        qtd2 = sc.nextInt();
//        val2 = sc.nextDouble();
//        piecesValues(code1, code2, qtd1, qtd2, val1, val2);


        //Calculo de áreas (Três valores na entrada)
//        double e, f, g;
//        e = sc.nextDouble();
//        f = sc.nextDouble();
//        g = sc.nextDouble();
//        areasCalc(e, f, g);

        sc.close();
    }

    public static void sumNumbers (int x, int y) {
        int result = x + y;
        System.out.printf("Soma dos Valores: %d\n", result);
    }

    public static void circleArea (double radius) {
        double area = 3.14159 * Math.pow(radius, 2);
        System.out.printf("Área do circulo: %.4f\n", area);
    }

    public static void pairsDifference (int a, int b, int c, int d) {
        //Criação de um array do tipo int com valores definidos
        int[] pairs = { //Definição simples de valores, sem limitações na quantia de posições
                a * b,
                c * d
        };

        System.out.printf("Diferença entre os pares: %d", Math.abs(pairs[0] - pairs[1]));
    }

    public static void salaryCalc (int number, double hours, double valor) {
        double salary = valor * hours;
        System.out.printf("O funcionário N°%d recebe o valor de %.2f p/hora trabalhada, totalizando um salário de %.2f após %.2f horas.\n", number, valor, salary, hours);
    }

    public static void piecesValues (int code1, int code2, int qtd1, int qtd2, double val1, double val2) {
        double total = qtd1 * val1 + qtd2 * val2;
        System.out.printf("Valor total a pagar pelas peças N°%d e N°%d: %.2f\n", code1, code2, total);
    }

    public static void areasCalc (double e, double f, double g) {
        System.out.printf("Triangulo: %.3f\n", e * g / 2);
        System.out.printf("Circulo: %.3f\n", 3.14159 * Math.pow(g, 2));
        System.out.printf("Trapezio: %.3f\n", ((e + f) / 2) * g);
        System.out.printf("Quadrado: %.3f\n", Math.pow(f, 2));
        System.out.printf("Retangulo: %.3f\n", e * f);
    }
}