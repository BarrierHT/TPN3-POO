package ar.edu.unju.escmi.poo.ejercicio3;

public class Rectangulo extends Figura {

    private double data2;

    public Rectangulo(double data1, String color, double data2) {
        super(data1, color);
        this.data2 = data2;
    }

    @Override
    public double getArea() {
        return this.data1 * this.data2;
    };

    @Override
    public double getPerimeter() {
        return 2 * (this.data1 + this.data2);
    };

    @Override
    public String getColor() { // ! Conseguir el color en el programa principal (lo pide en consigna)
        return this.color;
    }

}
