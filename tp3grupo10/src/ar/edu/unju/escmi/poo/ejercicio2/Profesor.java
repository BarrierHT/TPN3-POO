package ar.edu.unju.escmi.poo.ejercicio2;

public class Profesor extends Persona{
	
	public static final int SB = 85000;
	
	private long legajo;
	private	int antiguedad;

	public Profesor(String nombre, String apellido, long dni, long legajo, int antiguedad) {
		super(nombre, apellido, dni);
		this.legajo = legajo;
		this.antiguedad = antiguedad;
	}
		
	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
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
	public double calcularSueldoProfesor(){
		double sueldo = 0;
		
		if(this.antiguedad>=5) {
			sueldo = SB + (SB*0.25);
		}else {
			sueldo = SB + (SB*0.10);
		}
		
		return sueldo;		
	}

	//Para mostrar los datos del profesor proceder de la misma forma que en alumno.
	@Override
	public String toString() {
		return "Profesor: " + apellido + ", " + nombre + " DNI: " + dni
				+ "\n[N° de legajo: " + legajo + ", Años de antiguedad: " + antiguedad + ", Sueldo basico: " + SB
				+ ", Sueldo del profesor: " + calcularSueldoProfesor() + "]";
	}
	
}
