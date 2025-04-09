package model.services;

import model.entities.Contract;
import model.entities.Parcel;

import java.time.LocalDateTime;

public class ParcelService {
    private Integer quantity;

    private Contract contract;

    public ParcelService(Integer quantity, Double valuePerParcel, Contract contract) {
        this.quantity = quantity;
        this.contract = contract;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public void parcelProcess() {
        double valuePerParcel = contract.getTotal() / quantity;
        LocalDateTime date = contract.getDate();

        for (int i = 1; i <= this.quantity; i++) {
            date = date.plusMonths(i);
            contract.addParcel(new Parcel(date, valuePerParcel));
        }
    }
}
