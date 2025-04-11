package model.services;

import model.entities.Installment;
import model.entities.Status;
import model.exceptions.DomainException;

public class PayPalPayment implements OnlinePayment{
    private final double monthlyInterest = 0.01;
    private final double taxPerPayment = 0.02;

//    @Override
//    public double preview(Double total, int quantity, int index) {
//        double value = total / quantity;
//
//        return value + (value * (this.monthlyInterest * index)) + (value * this.taxPerPayment);
//    }

    @Override
    public double interest(Double amount, Integer months) {
        return amount * (this.monthlyInterest * months);
    }

    @Override
    public double fee(Double amount) {
        return amount * this.taxPerPayment;
    }

    @Override
    public void payment(Installment installment, Double amount) {
        final double total = installment.getValue();

        if (amount < installment.getValue()) {
            throw new DomainException("The amount transferred was not enough for the full settlement of the outstanding installment.");
        } else if (amount < total) {
            throw new DomainException("The amount transferred was not included the fee for payment of 2% of the value of the installment.");
        }

        if (amount > total * 1.01) {
            throw new DomainException("The amount transferred exceeded the total amount of the installment.");
        }

        installment.setStatus(Status.PAY);
    }
}
