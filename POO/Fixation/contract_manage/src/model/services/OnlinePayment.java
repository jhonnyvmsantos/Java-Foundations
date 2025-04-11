package model.services;

import model.entities.Installment;

public interface OnlinePayment {
    double preview(double total, int quantity, int index);
    void payment(Installment installment, double amount);
}
