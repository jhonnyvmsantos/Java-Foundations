package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Classe utilizada para gerenciamento de arquivos
        File file = new File("C:\\temp\\in.txt"); //Instanciando uma variavel apontando para um arquivo do sistema
        //Basicamente, usa-se 2 barras invertidas juntas para add 1 barra invertida no texto

        Scanner sc = null;

        try {
            sc = new Scanner(file); //Scaneando o conteudo do arquivo

            while (sc.hasNextLine()) { //Verificando se há linhas a ser lida
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) { //Classe utilizada para lidar com erros ao utilizar "arquivos exteriores"
            System.out.println("Error: " + e.getMessage()); //Mostrando uma mensagem de erro padrão do java
        } finally { //Modo de executar uma linha de codigo existindo ou não uma exceção
            if (sc != null) {
                sc.close();
            }
        }
    }

//    public static void main(String[] args) {
//
//        File file = new File("C:\\temp\\in.txt");
//        Scanner sc = null;
//
//        try {
//            sc = new Scanner(file);
//
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//
//        } catch (FileNotFoundException e) { //Tal erro se refere a inexistencia do arquivo especificado
//            System.out.println("Error opening file: " + e.getMessage());
//        } finally {
//            if (sc != null) {
//                sc.close();
//            }
//
//            System.out.println("Finally block executed.");
//        }
//
//    }
}