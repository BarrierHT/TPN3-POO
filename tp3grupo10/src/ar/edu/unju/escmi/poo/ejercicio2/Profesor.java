package ar.edu.unju.escmi.poo.ejercicio2;

public class Profesor extends Persona{
	
	private long legajo;
	private	int antiguedad;
	private int sueldoBasico;

	public Profesor(String nombre, String apellido, long dni, long legajo, int antiguedad) {
		super(nombre, apellido, dni);
		this.legajo = legajo;
		this.antiguedad = antiguedad;
		this.sueldoBasico = 85000;
	}
	
	//Comportamiento general
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Estoy haciendo una pregunta";
	}

	@Override
	public String mirar() {
		// TODO Auto-generated method stub
		return "Estoy mirando a la clase";
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return "Estoy escribiendo en el pizarron";
	}
	
	//Comportamiento propio
	public String explicarTema() {
		return "Estoy explicando un tema";
	}

	public String tomarEvaluacion() {
		return "Estoy evaluando a la clase";
	}
	
	public String corregirTarea() {
		return "Estoy corrigiendo la tarea";
	}
	
	//En la subclase Profesor cree un método que calcule el sueldo del profesor.
	public float sueldoProfesor(int sueldo, int antiguedad){
		
		if(antiguedad>=5) {
			sueldo += (sueldo*0.25);
		}else {
			sueldo += (sueldo*0.10);
		}
		
		return sueldo;		
	}

	//Para mostrar los datos del profesor proceder de la misma forma que en alumno.
	@Override
	public String toString() {
		return "Profesor: " + apellido + ", " + nombre + " DNI: " + dni
				+ "\n[N° de legajo: " + legajo + ", Años de antiguedad: " + antiguedad + ", Sueldo basico: " + sueldoBasico
				+ ", Sueldo del profesor: " + sueldoProfesor(sueldoBasico, antiguedad) + "]";
	}
	
}
