package entities;

import entities.enums.Color;

//OBS: É possivel que uma classe abstract implementa uma interface, sendo um modo de combinar herança com contrato
//OBS: A classe não é obrigada a cumprir o contrato, por ser uma classe abstrada
public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Para criar um metodo abstrado, é necessario que sua classe seja abstract
    public abstract Double area();
}
