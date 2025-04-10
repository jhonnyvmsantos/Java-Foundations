package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double total;
    private final List<Parcel> parcels = new ArrayList<>();

    public Contract() {
        //Vazio...
    }

    public Contract(Integer number, LocalDate date, Double total) {
        this.number = number;
        this.date = date;
        this.total = total;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void addParcel(Parcel parcel) {
        this.parcels.add(parcel);
    }

    public void removeParcel(Parcel parcel) {
        this.parcels.remove(parcel);
    }
}
