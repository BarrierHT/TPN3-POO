package ar.edu.unju.escmi.poo.ejercicio3;

public class Rectangulo extends Figura {

    private double data2;

    public Rectangulo(double data1, String color, double data2) {
        super(data1, color);
        this.data2 = data2;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    };

    @Override
    public double getArea() {
        return this.data1 * this.data2;
    };

    @Override
    public double getPerimeter() {
        return 2 * (this.data1 + this.data2);
    }

    @Override
    public String toString() {
        return "Rectangulo --- : Lado 1: " + this.data1 + ", Color: " + this.color + ", Lado 2: " + this.data2
                + ", Área: "
                + this.getArea() + ", Perímetro: " + this.getPerimeter() + "\n";
    }

}
