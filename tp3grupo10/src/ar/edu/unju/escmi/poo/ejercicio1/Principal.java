package ar.edu.unju.escmi.poo.ejercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do{

            System.out.println("\n1- Crear objeto con Constructor por defecto\n2- Crear objeto con Constructor parametrizado\n3- Crear objeto con Constructor (anio de fabricacion y marca)\n4- Salir");
            System.out.println("Ingrese su opcion: ");
            option = scanner.nextInt();

            if(option == 1){
                
                Auto fConstructor = new Auto();
                System.out.println("\nConstructor por defecto creado correctamente");
                System.out.println("\n" + fConstructor.toString());

            }else if(option == 2){
                
                String patent, brand, color, model;
                int yearOfProduction;

                scanner.nextLine();

                System.out.println("\nIngrese la patente del auto"); patent = scanner.nextLine(); 
                System.out.println("\nIngrese la marca del auto"); brand = scanner.nextLine(); 
                System.out.println("\nIngrese el color del auto"); color = scanner.nextLine(); 
                System.out.println("\nIngrese el modelo del auto"); model = scanner.nextLine();
                System.out.println("\nIngrese el anio de fabricacion del auto"); yearOfProduction = scanner.nextInt();

                Auto sConstructor = new Auto(patent, brand, color, model, yearOfProduction);
                System.out.println("\n" + sConstructor.toString());

            }else if(option == 3){

                String model = "";
                int yearOfProduction = 0;

                Auto tConstructor = new Auto(model, yearOfProduction);
                System.out.println("\n" + tConstructor.toString());
                
            }else if(option == 4){

                System.out.println("\nHa salido correctamente del programa");
                break;

            }else System.out.println("\nOpcion invalida");

        }while(1 == 1);

        scanner.close();
    }
}