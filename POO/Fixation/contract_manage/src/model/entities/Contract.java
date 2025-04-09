package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double total;
    private List<Parcel> parcels;

    public Contract() {
        //Vazio...
    }

    public Contract(Integer number, LocalDateTime date, Double total) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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
