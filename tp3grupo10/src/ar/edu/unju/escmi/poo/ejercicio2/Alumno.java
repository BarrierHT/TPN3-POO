package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Arrays;

public class Alumno extends Persona{
	
	private long libretaUniversitaria;
	private	int[] nota = new int[5];
    
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public long getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(long libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	
	public int[] getNota() {
		return nota;
	}

	public void setNota(int[] nota) {
		this.nota = nota;
	}

	//Comportamiento general
	@Override
	public String hablar() {
		// TODO Auto-generated method stub
		return "Estoy respondiendo una pregunta";
	}

	@Override
	public String mirar() {
		// TODO Auto-generated method stub
		return "Estoy mirando el pizzaron";
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return "Estoy escribiendo en mi cuaderno";
	}

	//Comportamiento propio
	public String hacerTarea() {
		return "Estoy haciendo mi tarea";
	}
	
	public String realizarEvaluacion() {
		return "Estoy siendo Evaluado";
	}
	
	public String pensarProyecto() {
		return "Estoy pensando en un proyecto";
	}
	
	//En la subclase Alumno cree un método que calcule el promedio de notas del alumno.
	public double promediarNota(int[] nota){
		double promedio = 0, sumaNota = 0;
		 
		for(int i = 0;i < 5;i++) {
			sumaNota += nota[i];
		}
		promedio = sumaNota / 5;
		
		return promedio;
	}

	//Para mostrar los datos del alumno sobreescribir el método toString() mostrando los atributos y el resultado de calcular el promedio de notas.
	@Override
	public String toString() {
		return "Alumno: " + apellido + ", " + nombre + " DNI: " + dni
				+ "\n[N° de libreta universitaria: " + libretaUniversitaria + ", Notas: " + Arrays.toString(nota)
				+ ", Promedio: " + promediarNota(nota) + "]";
	}
	
}
