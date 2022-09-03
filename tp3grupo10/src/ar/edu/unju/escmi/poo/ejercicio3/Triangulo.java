package ar.edu.unju.escmi.poo.ejercicio3;

public class Triangulo extends Figura {

    private double data2; // data2 is the base

    public Triangulo(double data1, String color, double data2) {
        super(data1, color);
        this.data2 = data2;
    }

    @Override
    public double getArea() {
        return (this.data1 * this.data2) / 2;
    };

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(this.data1, 2) + Math.pow(this.data2, 2));
        return side * 2 + this.data2;
    };

    @Override
    public String getColor() { // ! Conseguir el color en el programa principal (lo pide en consigna)
        return this.color;
    }

}
