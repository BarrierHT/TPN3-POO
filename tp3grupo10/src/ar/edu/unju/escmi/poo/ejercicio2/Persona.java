package ar.edu.unju.escmi.poo.ejercicio2;

public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected long dni;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, long dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	//Comportamiento general
	public abstract String hablar();
	public abstract String mirar();
	public abstract String escribir();
	
}
