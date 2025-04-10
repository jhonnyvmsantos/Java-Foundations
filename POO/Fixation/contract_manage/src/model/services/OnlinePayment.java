package model.services;

import model.entities.Parcel;

public interface OnlinePayment {
    double preview(double total, int quantity, int index);
    void payment(Parcel parcel, double amount);
}
