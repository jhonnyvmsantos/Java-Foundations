package model.entities;

public class Invoice {
    private Double basicaPayment;
    private Double tax;

    public Invoice() {
        //Vazio...
    }

    public Invoice(Double basicaPayment, Double tax) {
        this.basicaPayment = basicaPayment;
        this.tax = tax;
    }

    public Double getBasicaPayment() {
        return basicaPayment;
    }

    public void setBasicaPayment(Double basicaPayment) {
        this.basicaPayment = basicaPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public double getTotalPayment() {
        return this.getBasicaPayment() + this.getTax();
    }
}
