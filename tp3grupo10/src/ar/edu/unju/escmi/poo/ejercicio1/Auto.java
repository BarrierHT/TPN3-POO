package ar.edu.unju.escmi.poo.ejercicio1;

public class Auto {

    private String patent;
    private String brand;
    private String color;
    private String model;
    private int yearOfProduction;


    //Constructors

    public Auto(){

    }

    public Auto(String patent, String brand, String color, String model, int yearOfProduction){

        this.patent = patent;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Auto(String model, int yearOfProduction){

        this.model = "Peugeot";
        this.yearOfProduction = 2010;
    }


    //Methods

    public String moveTheCar(){
        return "Estoy avanzando";
    }

    public String acelaccelerate(){
        return "Estoy acelerando";
    }

    public String brakeTheCar(){
        return "Estoy frenando";
    }

    public String turnTheCar(){
        return "Estoy girando";
    }

    public String cleanWindows(){
        return "Estoy limpiando los cristales";
    }

    @Override
    public String toString() {
        return "Patente: " + patent + " Marca: " + brand + " Color: " + color + " Modelo: " + model + " Anio de fabricacion: " + yearOfProduction;
    }
}
