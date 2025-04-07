package model.services;

//"Interface" ajuda a desaclopar o programa, servindo como intermediario em interações entre diferentes classes
public interface TaxService { //Interface define um contrato a ser seguido pelas classes, de forma abstrada

    //Não há necessidade de transformar tal metodo em public, pois é redundante
    double tax(double amount);
}
