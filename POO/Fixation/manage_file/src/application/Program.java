package application;

import model.exceptions.DomainException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        tempFolder();

        sc.close();
    }

    public static void tempFolder() {

        String strPath = "C:\\temp\\products";
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