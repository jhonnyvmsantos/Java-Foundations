package application;

import entities.EnumStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 102;

//        Object obj = x; //"Boxing" (Conversão de um obj tipo primitivo valor para tipo referencial)
        Integer obj = x; //"Wrapper Class" Tipo Primitivo -> Tipo refencial. (Ex: Boolean, Char, Number...)
        //Wrapper Class são classes, sendo, normalmente, usadas no lugar de tipos primitivos

        //"Unboxing" (Conversão do tipo referêncial pro tipo valor):
//        int y = (int) obj - 3; //Casting pro tipo INT (Utilizando Boxing)
        int y = obj - 3; //(Utilizando Wrapper Class ou Boxing)

        System.out.println(x + " | " + y);

        //Maneira de selecionar uma constante do tipo enum
        System.out.println(EnumStatus.THE_ONE_STATUS);

        //Forma de conerter o tipo enum para o string;
        String second_test = String.valueOf(EnumStatus.SECOND_STATUS);
        System.out.println(second_test);

        //Instanciando um tipo enum já especificado através de uma string...
        EnumStatus third_test = EnumStatus.valueOf("THIRD_STATUS");
        System.out.println(third_test);

        //Instanciando um tipo enum já especificado
        EnumStatus final_test = EnumStatus.FINAL_STATUS;
        System.out.println(final_test);

        System.out.print("Executar outra função do projeto (y/n)? ");
        char verification = sc.next().charAt(0);
        if (verification == 'y') {
            alter_main();
        }

        sc.close();
    }

    public static void alter_main() {

        //"List" é um tipo "Interface", necessitando de uma classe que a implementa
        //Interface é um tipo que define a especificação das operações (Não pode ser instanciada)
        List<Integer> list = new ArrayList<>(); //Invés de tipos primitivos, utiliza-se Warpper Classes para definir o tipo dos elementos
        //List tem um acesso sequencial aos elementos alvos, podendo ser otimizado.

        list.add(154); //Inserção de elementos, sendo, normalmente, inserido na ultima posição do list
        list.addFirst(0); //Inserção de elemento na primeira posição do array
        list.add(15);
        list.addLast(88); //Inserção de elemento na ultima posição do array
        list.add(44);
        list.add(50);
        list.add(2, 100); //Inserção de elemento em um index especifico
        list.add(152);
        list.add(55);

        list.remove(3); //Remoção de elementos através do index
        list.removeIf(e -> e > 100); // //Remoção de elementos através de um predicato, Utilizando uma "função lambda"

        System.out.println("Tamanho da lista: " + list.size()); //Método equivalente ao "length"
        for (Integer e : list) {
            System.out.printf("Number: %d\n", e);
        }

        System.out.println("Index (N. 0): " + list.indexOf(0)); //Buscando o index de um elemento
        System.out.println("Index (N. 15): " + list.indexOf(15)); //Elemento não existente == index -1

        System.out.println("-------------------------------------------------------");

        //"stream()" converte o tipo especial que aceita operações com expressões lambda
        List<Integer> filtered = list.stream().filter(e -> e <= 50).toList(); //Filtrando os numeros abaixo de 50 para criar uma nova lista
        //"toList" Converte para o tipo list

        for (Integer e : filtered) {
            System.out.printf("Number: %d\n", e);
        }

        System.out.println("-------------------------------------------------------");

        List<String> test = new ArrayList<>();

        test.add("Junior");
        test.add("Geo");
        test.add("Alex");
        test.add("Linmux");
        test.add("Anderson");
        test.add(3,"Maicon");

        for (String e : test) {
            System.out.printf("Name: %s\n", e);
        }

        //Aplicando o filtro através de uma expressão lambda e pegando o primeiro elemento atraves do "findFirst"
        String name = test.stream().filter(e -> e.charAt(0) == 'A').findFirst().orElse(null);
        //Caso não exista, "orElse" retorna um valor predeterminado
        System.out.println("My name: " + name);
    }
}