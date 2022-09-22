package ar.edu.unju.escmi.poo.ejercicio3;

public class Cuadrado extends Figura {

    public Cuadrado(double data1, String color) {
        super(data1, color);
    }

    @Override
    public double getArea() {
        return Math.pow(this.data1, 2);
    };

    @Override
    public double getPerimeter() {
        return this.data1 * 4;
    };

    @Override
    public String toString() {
        return "Cuadrado --- Lado 1: " + this.data1 + ", Color: " + this.color + ", Área: "
                + this.getArea() + ", Perímetro: " + this.getPerimeter() + "\n";
    }

}
