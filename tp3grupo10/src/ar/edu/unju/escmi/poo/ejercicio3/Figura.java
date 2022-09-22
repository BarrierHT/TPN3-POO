package ar.edu.unju.escmi.poo.ejercicio3;

public abstract class Figura {

    protected double data1;
    protected String color;

    public Figura(double data1, String color) {
        this.data1 = data1;
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return this.color;
    };

}
