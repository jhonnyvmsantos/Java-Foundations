package model.entities;

import java.time.LocalDate;

import static model.services.DateFormat.dtFormat;

public class Installment {
    private LocalDate expiration;
    private Double value;

    private Status status = Status.WAITING;

    public Installment(LocalDate expiration, Double value) {
        this.expiration = expiration;
        this.value = value;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return expiration.format(dtFormat) + " - $" + String.format("%.2f", value);
    }
}
