package model.services;

import model.entities.Installment;

public interface OnlinePayment {
    double interest(Double amount, Integer months);
    double fee(Double amount);
    void payment(Installment installment, Double amount);
//    double preview(Double total, int quantity, int index);
}
