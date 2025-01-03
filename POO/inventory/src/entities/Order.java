package entities;

import java.util.Date;

public class Order {

    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV"; //Acessando uma var sem prefixo (public, private...)
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return this.product;
    }

}
