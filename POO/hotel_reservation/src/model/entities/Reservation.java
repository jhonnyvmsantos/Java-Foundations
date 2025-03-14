package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
        //Vazio...
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date nust be after check-in date.");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        //"getTime()" converte a data para um valor em milisegundos
        long diff = checkOut.getTime() - checkIn.getTime(); //Calculando a diferença entre as datas

        //Convertendo a diferença das datas em milisegundos para dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    //Adicionando "throws DomainException", é possivel lançar uma exceção para tratar em tal classe
    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();

        //Blocos de verificação de erros
        if (checkIn.before(now) || checkOut.before(now)) {
            //"Lançando" (forçando?) uma exceção (Exceção: argumentos invalidos passados para o método)
//            throw new IllegalArgumentException("Reservation dates for update must be future dates.");

            //Lançando uma exceção para um tratamento personalido
            throw new DomainException("Reservation dates for update must be future dates.");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date nust be after check-in date.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber +
                ", check-in: " + sdf.format(checkIn) +
                ", check-out: " + sdf.format(checkOut) +
                ", " + duration() + " nights.";
    }
}
