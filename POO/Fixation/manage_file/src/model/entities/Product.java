package model.entities;

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

    @Override
    public String toString() {
        return name + "," + String.format("%.2f", price * quantity);
    }
}
