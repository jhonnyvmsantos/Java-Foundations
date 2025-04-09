package model.services;

import model.entities.Parcel;

public interface OnlinePayment {
    void payment(Parcel parcel, double amount);
}
