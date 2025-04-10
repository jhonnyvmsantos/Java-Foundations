package model.services;

import model.entities.Parcel;
import model.entities.Status;
import model.exceptions.DomainException;

public class PayPalPayment implements OnlinePayment{
    private final double monthlyInterest = 0.01;
    private final double taxPerPayment = 0.02;

    @Override
    public double preview(double total, int quantity, int index) {
        double value = (total / quantity) * (this.monthlyInterest + index);

        return value + (total * this.taxPerPayment);
    }

    @Override
    public void payment(Parcel parcel, double amount) {
        final double total = parcel.getValue();

        if (amount < parcel.getValue()) {
            throw new DomainException("The amount transferred was not enough for the full settlement of the outstanding installment.");
        } else if (amount < total) {
            throw new DomainException("The amount transferred was not included the fee for payment of 2% of the value of the installment.");
        }

        if (amount > total * 1.01) {
            throw new DomainException("The amount transferred exceeded the total amount of the installment.");
        }

        parcel.setStatus(Status.PAY);
    }
}
