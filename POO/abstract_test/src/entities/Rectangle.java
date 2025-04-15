package entities;

import entities.enums.Color;

//Ao ter um metodo abstrado na superclass abstrada, é obrigatório a implementação de tal metodo
public class Rectangle extends AbstractShape {
    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return this.width * this.height;
    }
}
