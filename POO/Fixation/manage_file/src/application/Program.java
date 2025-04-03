package application;

import model.entities.Product;
import model.exceptions.DomainException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //OBS: A string considera as barras dudplas como uma unica barra em texto
        String strPath = "C:\\temp\\products\\itemList.csv";

        System.out.print("Want to start a pre-defined list of items (y/n)? ");
        char initial = sc.next().charAt(0);

        //Retirando a parte que aponta ao arquivo, fazendo com que aponte para o diretorio em si
        if (initial == 'y') initialization(strPath.substring(0, 16));

        //Verificando se tal arquivo/diretorio existe
        if (Files.exists(Paths.get(strPath))) {
            try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

                List<Product> items = new ArrayList<>();
                String line = br.readLine();

                while (line != null) {
                    String[] split = line.split(",");
                    items.add(new Product(split[0], Double.parseDouble(split[1]), Integer.parseInt(split[2])));

                    line = br.readLine();
                }

                String path = "C:\\temp\\products\\out\\summary.csv";
                //Vericando a existencia do arquivo, se não existir, então um novo é criado
                boolean success = Files.exists(Paths.get(path)) || new File(path.substring(0, 20)).mkdirs();

                if (success) {
                    boolean init = false;
                    for (Product item : items) {
                        item.writer(path, init);

                        if (!init) {
                            init = true;
                        };
                    }
                } else {
                    throw new DomainException("Error registering products.");
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Please start a list of items to proceed.");
        }

        sc.close();
    }

    public static void initialization(String strPath) {

        final Path path = Paths.get(strPath);

        final String[] items = {
          "TV LED,1290.99,1", "Video Game Chair,350.50,3", "Iphone X,900.00,2", "Samsung Galaxy 9,850.00,2"
        };

        boolean success = Files.exists(path) || new File(strPath).mkdirs();

        if (success) {
            System.out.println("Directory created successfully.");
            strPath += "\\itemList.csv";
        } else {
            throw new DomainException("Failed to create directory.");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))) {
            for (String item : items) {
                bw.write(item);
                bw.newLine();
            }

            System.out.println("Item list archive created and filled successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}