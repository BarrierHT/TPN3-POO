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
    
    public double getData1() {
        return this.data1;
    };

    public void setColor(String color) {
        this.color = color;
    };
    
    public void setData1(double data1) {
        this.data1 = data1;
    };
    
}
