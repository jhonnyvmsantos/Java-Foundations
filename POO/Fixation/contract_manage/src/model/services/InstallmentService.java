package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class InstallmentService {
    private Integer quantity;

    private Contract contract;
    private OnlinePayment onlinePayment;

    public InstallmentService(Integer quantity, Contract contract, OnlinePayment onlinePayment) {
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

    public void installmentProcess() {
        LocalDate date = contract.getDate();
        double total = contract.getTotal();

        for (int i = 1; i <= this.quantity; i++) {
            date = date.plusMonths(1);
            contract.addParcel(new Installment(date, onlinePayment.preview(total, this.quantity, i)));
        }
    }
}
