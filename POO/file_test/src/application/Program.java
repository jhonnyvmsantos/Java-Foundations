package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        final String path = "C:\\temp\\in.txt"; //Caminho para um determinado arquivo ".txt"

        writer();

        //UTILIZANDO DO FILEREADER E BUFFERREADER PARA LER "ARQUIVOS EXTERIORES" COM FECHAMENTO MANUAL ----------------

//        FileReader fr = null; //"Stream" (Sequencia) de leitura de caracteres a partir de arquivos
//        BufferedReader br = null; //"FileReader" mais rapido

        //"try-with-recourses" - Permite a declaração de recursos pelo "bloco try" e garante seu encerramento no final
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Iniciando o "bloco try" com recursos declarados

//            fr = new FileReader(path); //Instanciando uma stream de leitura de um determinado arquivo
//            br = new BufferedReader(fr); //Aprimorando a velocidade de leitura da stream com buffers

            String line = br.readLine(); //Lendo uma linha do arquivo (stream)

            while (line != null) { //Verificando se não há mais linhas para ler, pois irá retornar null, caso não haja
                System.out.println(line);
                line = br.readLine(); //Realizando o processo novamente
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } //finally { //"finally" utilizado para "fechamento manual" dos "readers"
//            try {
//                if (br != null) {
//                    br.close();
//                }
//
//                if (fr != null) {
//                    fr.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        //UTILIZANDO DO SCANNER PARA LER UM "ARQUIVO EXTERIOR" -------------------------------------------------------

//        //Classe utilizada para gerenciamento de arquivos
//        File file = new File(path); //Instanciando uma variavel apontando para um arquivo do sistema
//        //Basicamente, usa-se 2 barras invertidas juntas para add 1 barra invertida no texto
//
//        Scanner sc = null;
//
//        try {
//            sc = new Scanner(file); //Scaneando o conteudo do arquivo
//
//            while (sc.hasNextLine()) { //Verificando se há linhas a ser lida
//                System.out.println(sc.nextLine());
//            }
//        } catch (IOException e) { //Classe utilizada para lidar com erros ao utilizar "arquivos exteriores"
//            System.out.println("Error: " + e.getMessage()); //Mostrando uma mensagem de erro padrão do java
//        } finally { //Modo de executar uma linha de codigo existindo ou não uma exceção
//            if (sc != null) {
//                sc.close();
//            }
//        }
    }

    public static void writer() {

        String[] lines = new String[] {
                "Good Morning", "Good afternoon", "Good Night"
        };

        String path = "C:\\temp\\out.txt";

        //"FileWriter" - Stream de escrita de caracteres em arquivos | "BufferedWriter" - "FileWriter" mais rapido
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { //Ambos criam/recriam o arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            //Add "true" evita a recriação do arquivo, enquanto cria o arquivo caso não exista

            for (String line : lines) { //Percorrendo o vetor de string
                bw.write(line); //Escrevendo na ultima linha do arquivo
                bw.newLine(); //Pulando uma linha
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}