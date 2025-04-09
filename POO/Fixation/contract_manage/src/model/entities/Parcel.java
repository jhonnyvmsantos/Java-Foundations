package model.entities;

import java.time.Instant;
import java.time.LocalDateTime;

public class Parcel {
    private LocalDateTime expiration;
    private Double value;

    private Status status = Status.WAITING;

    public Parcel(LocalDateTime expiration, Double value) {
        this.expiration = expiration;
        this.value = value;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDateTime expiration) {
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
}
