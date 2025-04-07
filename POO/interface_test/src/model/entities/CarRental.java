package model.entities;

import model.exceptions.DomainException;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {
        //Vazio...
    }

    //Não informar o "Invoice" no construtor, pois não haverá uma "conta" ainda...
    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {

        if (start.equals(finish)) {
            throw new DomainException("Dates cannot be identical.");
        }

        if (finish.isBefore(start)) {
            throw new DomainException("Withdrawal cannot be prior to introduction.");
        }

        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Basic Payment: ").append(String.format("%.2f", getInvoice().getBasicPayment()));
        sb.append("\nTax: ").append(String.format("%.2f", getInvoice().getTax()));
        sb.append("\nTotal payment: ").append(String.format("%.2f", getInvoice().getTotalPayment()));

        return sb.toString();
    }
}
