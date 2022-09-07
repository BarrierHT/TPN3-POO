package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Persona[] persona = new Persona[4];
	    String nombre, apellido;
	    long dni;
		Scanner variable = new Scanner(System.in);
		int opcion, x = 0;
		Alumno alumno = null;
		Profesor profesor = null;

		do {
			System.out.println("*****************************");
			System.out.println("1) Alta de alumno");
			System.out.println("2) Alta de profesor");
			System.out.println("3) Mostrar alumnos");
			System.out.println("4) Mostrar profesores");
			System.out.println("5) Salir");

			System.out.println("\nEscribe una de las opciones: ");
			opcion = variable.nextInt();

			switch (opcion) {
			case 1:
				if(x < persona.length) {
					alumno = new Alumno();
					long libretaUniversitaria;
					int[] nota = new int[5];
					
					System.out.println("\n********************************************");
					System.out.println("Ingrese nombre del Aulmno");
					nombre = variable.next();
					System.out.println("Ingrese apelldio del Alumno");
					apellido = variable.next();
					System.out.println("Ingrese DNI del Aulmno");
					dni = variable.nextLong();
					System.out.println("Ingrese libreta universitaria del Aulmno");
					libretaUniversitaria = variable.nextLong();
					for(int i=0;i < 5;i++) {
						System.out.println("Ingrese nota(" + (i+1) + ") del Aulmno");
						nota[i] = variable.nextInt();
					}
					
					alumno.setNombre(nombre);
					alumno.setApellido(apellido);
					alumno.setDni(dni);
					alumno.setLibretaUniversitaria(libretaUniversitaria);
					alumno.setNota(nota);
					persona[x] = alumno;
					x++;
				}else {
					System.out.println("\n********************************************\nNo se puede seguir guardando");
				}
				
				break;
			case 2:
				if(x < persona.length) {
					long legajo;
					int antiguedad;
					
					System.out.println("\n********************************************");
					System.out.println("Ingrese nombre del Profesor");
					nombre = variable.next();
					System.out.println("Ingrese apelldio del Profesor");
					apellido = variable.next();
					System.out.println("Ingrese DNI del Profesor");
					dni = variable.nextLong();
					System.out.println("Ingrese legajo del Profesor");
					legajo = variable.nextLong();
					System.out.println("Ingrese antiguedad del Profesor");
					antiguedad = variable.nextInt();
					
					profesor = new Profesor(nombre, apellido, dni, legajo, antiguedad);
					persona[x] = profesor;
					x++;
				}else {
					System.out.println("\n********************************************\nNo se puede seguir guandando");
				}
				
				break;
			case 3:
				System.out.println("\n********************************************");
				for(Persona per : persona) {
					if(per instanceof Alumno) {
						System.out.println(per.toString() + "\n");
					}
				}
				break;
			case 4:
				System.out.println("\n********************************************");
				for(Persona per : persona) {
					if(per instanceof Profesor) {
						System.out.println(per.toString() + "\n");
					}
				}
				break;
			case 5:
				System.out.println("\n********************************************\nSaliendo...");
				break;
			default:
				System.out.println("\n********************************************\nSolo números entre 1 y 5");
			}

		} while(opcion != 5);

		variable.close();
		
	}

}
