package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pessoas a serem adicionadas: ");
        Person[] vect = new Person[sc.nextInt()];

        System.out.println("OBS: Deixe vazio o campo de Gênero da pessoa, caso não queira/possa informa-lo...");
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Nome da pessoa: ");
            String name = sc.nextLine();
            System.out.print("Gênero da pessoa (opcional): ");
            String gender = sc.nextLine();
            System.out.print("Idade da pessoa: ");
            int age = sc.nextInt();
            System.out.print("Altura da pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Peso da pessoa: ");
            double weight = sc.nextDouble();

            if (!gender.isBlank()) {
                vect[i] = new Person(name, gender, age, height, weight);
            } else {
                vect[i] = new Person(name, age, height, weight);
            }

            System.out.println("------------------------------");
        }

        System.out.println("Dados das pessoas:");
        for (Person obj: vect) {
            System.out.println(obj);
        }

        System.out.println("Informações gerais:");
        double[] info = new double[3];
        for (Person obj: vect) {
            info[0] += obj.getAge();
            info[1] += obj.getHeight();
            info[2] += obj.getWeight();
        }

        System.out.println("Média de Idade: " + info[0]);
        System.out.println("Média de Altura: " + info[1]);
        System.out.println("Média de Peso: " + info[2]);

        final double per = 100.0 / vect.length;
        int qtd = 0;
        String[] underage = new String[vect.length];

        for (Person obj: vect) {
            if (obj.getAge() < 18) {
                underage[qtd] = obj.getName();
                qtd++;
            }
        }

        System.out.println("Menores de idade:");
        for (String obj: underage) {
            if (obj != null) {
                System.out.println("    - " + obj);
            }
        }
        System.out.println("Percentual: " + String.format("%.2f", per * qtd) + "%");

        sc.close();
    }
}