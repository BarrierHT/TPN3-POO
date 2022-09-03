package ar.edu.unju.escmi.poo.ejercicio3;

public class Circulo extends Figura {

    public static final double PI = 3.1415;

    public Circulo(double data1, String color) {
        super(data1, color);
    }

    @Override
    public double getArea() {
        return PI * Math.pow(this.data1, 2);
    };

    @Override
    public double getPerimeter() {
        return 2 * PI * data1;
    };

    @Override
    public String getColor() { // ! Conseguir el color en el programa principal (lo pide en consigna)
        return this.color;
    }

}
