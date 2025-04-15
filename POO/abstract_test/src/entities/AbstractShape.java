package entities;

import entities.enums.Color;

//Por ser uma classe abstrada, não necessita de cumprir o contrato da interface
public abstract class AbstractShape implements Shape{
    private Color color;

    public AbstractShape() {
        //Vazio...
    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}