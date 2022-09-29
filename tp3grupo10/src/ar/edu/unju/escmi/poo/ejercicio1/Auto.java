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

    public Auto(String patent, String color, String model){
        
        this.patent = patent;
        this.brand = "Peugeot";
        this.color = color;
        this.model = model;
        this.yearOfProduction = 2010;
    }

    public String getPatent() {
		return patent;
	}

	public void setPatent(String patent) {
		this.patent = patent;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
    
    //Methods

	public String moveTheCar(){
        return "Estoy avanzando";
    }

    public String accelerate(){
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
        return "Patente: " + patent + ", Marca: " + brand + ", Color: " + color + ", Modelo: " + model + ", Anio de fabricacion: " + yearOfProduction;
    }
}
