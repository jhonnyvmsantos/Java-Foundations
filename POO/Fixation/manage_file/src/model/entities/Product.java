package model.entities;

import java.io.*;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
        //Vazio...
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void writer(String path, Boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, append))) {
            bw.write(toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public double total() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return name + "," + String.format("%.2f", this.total());
    }
}
