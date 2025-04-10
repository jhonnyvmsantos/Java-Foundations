package model.services;

import model.entities.Contract;
import model.entities.Parcel;

import java.time.LocalDate;

public class ParcelService {
    private Integer quantity;

    private Contract contract;
    private OnlinePayment onlinePayment;

    public ParcelService(Integer quantity, Contract contract, OnlinePayment onlinePayment) {
        this.quantity = quantity;
        this.contract = contract;
        this.onlinePayment = onlinePayment;
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

    public OnlinePayment getOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void parcelProcess() {
        LocalDate date = contract.getDate();
        double total = contract.getTotal();

        for (int i = 1; i <= this.quantity; i++) {
            date = date.plusMonths(i);
            contract.addParcel(new Parcel(date, onlinePayment.preview(total, this.quantity, i)));
        }
    }
}
