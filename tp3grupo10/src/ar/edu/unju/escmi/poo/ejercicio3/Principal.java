package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        Figura[] shapes = new Figura[8];
        int indexShapes = 0;

        do {

            System.out.println("1- Crear un círculo");
            System.out.println("2- Crear un cuadrado");
            System.out.println("3- Crear un rectángulo");
            System.out.println("4- Crear un Triangulo");
            System.out.println("5- Mostrar todas las figuras geométricas");
            System.out.println("6- Ingrese un color y muestre todas las figuras con ese color");
            System.out.println("7- Mostrar solo círculos");
            System.out.println("8- Mostrar solo cuadrados");
            System.out.println("9- Mostrar solo rectángulos");
            System.out.println("10- Mostrar solo triángulos");
            System.out.println("11- Salir");

            System.out.println("Ingrese su opcion: ");
            option = scanner.nextInt();

            System.out.println("\n\n");

            if (option >= 1 && option <= 4) {
                if (indexShapes == shapes.length) {
                    System.out.println("No se pueden crear mas figuras");
                    continue;
                }
                if (option == 1) {
                    System.out.println("Ingresa el radio del circulo: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Ingresa el color del circulo: ");
                    String color = scanner.next();
                    Circulo circle = new Circulo(radius, color);
                    shapes[indexShapes] = circle;
                    indexShapes++;
                } else if (option == 2) {
                    System.out.println("Ingresa el lado del cuadrado: ");
                    double side = scanner.nextDouble();
                    System.out.println("Ingresa el color del cuadrado: ");
                    String color = scanner.next();
                    Cuadrado square = new Cuadrado(side, color);
                    shapes[indexShapes] = square;
                    indexShapes++;
                } else if (option == 3) {
                    System.out.println("Ingresa el valor de la altura del rectangulo: ");
                    double side = scanner.nextDouble();
                    System.out.println("Ingresa el valor de la base del rectangulo: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa el color del rectangulo: ");
                    String color = scanner.next();
                    Rectangulo rectangle = new Rectangulo(side, color, base);
                    shapes[indexShapes] = rectangle;
                    indexShapes++;
                } else if (option == 4) {
                    System.out.println("Ingresa el valor de la altura del triangulo: ");
                    double height = scanner.nextDouble();
                    System.out.println("Ingresa el valor de la base del triangulo: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa el color del triangulo: ");
                    String color = scanner.next();
                    Triangulo triangle = new Triangulo(height, color, base);
                    shapes[indexShapes] = triangle;
                    indexShapes++;
                }
            } else {
                if (option == 5) {
                    for (Figura shape : shapes) {
                        if (shape instanceof Figura) {
                            System.out.println(shape);

                            // if (shape instanceof Circulo)
                            // System.out.println("La figura es un circulo, su color es: " +
                            // shape.getColor());

                            // if (shape instanceof Cuadrado)
                            // System.out.println("La figura es un cuadrado, su color es: " +
                            // shape.getColor());

                            // if (shape instanceof Rectangulo)
                            // System.out.println("La figura es un rectangulo, su color es: " +
                            // shape.getColor());

                            // if (shape instanceof Triangulo)
                            // System.out.println("La figura es un triangulo, su color es: " +
                            // shape.getColor());

                            // System.out.println("Area: " + shape.getArea());
                            // System.out.println("Perimetro: " + shape.getPerimeter());
                        }

                    }
                } else if (option == 6) {
                    System.out.println("Digite el color a buscar: ");
                    String color = scanner.next();
                    for (Figura shape : shapes) {
                        if (shape instanceof Figura) {
                            if (shape.getColor().equals(color)) {
                                System.out.println(shape);

                                // if (shape instanceof Circulo)
                                // System.out.println("La figura es un circulo");

                                // if (shape instanceof Cuadrado)
                                // System.out.println("La figura es un cuadrado");

                                // if (shape instanceof Rectangulo)
                                // System.out.println("La figura es un rectangulo");

                                // if (shape instanceof Triangulo)
                                // System.out.println("La figura es un triangulo ");

                                // System.out.println("Area: " + shape.getArea());
                                // System.out.println("Perimetro: " + shape.getPerimeter());
                            }
                        }
                    }
                } else if (option == 7) {
                    for (Figura shape : shapes) {
                        if (shape instanceof Figura) {
                            if (shape instanceof Circulo) {
                                // System.out.println("Color: " + shape.getColor());
                                // System.out.println("Area: " + shape.getArea());
                                // System.out.println("Perimetro: " + shape.getPerimeter());
                                System.out.println(shape);

                            }
                        }
                    }
                } else if (option == 8) {
                    for (Figura shape : shapes) {
                        if (shape instanceof Figura) {
                            if (shape instanceof Cuadrado) {
                                // System.out.println("Color: " + shape.getColor());
                                // System.out.println("Area: " + shape.getArea());
                                // System.out.println("Perimetro: " + shape.getPerimeter());
                                System.out.println(shape);

                            }
                        }
                    }
                } else if (option == 9) {
                    for (Figura shape : shapes) {
                        if (shape instanceof Figura) {
                            if (shape instanceof Rectangulo) {
                                // System.out.println("Color: " + shape.getColor());
                                // System.out.println("Area: " + shape.getArea());
                                // System.out.println("Perimetro: " + shape.getPerimeter());
                                System.out.println(shape);

                            }
                        }
                    }
                } else if (option == 10) {
                    for (Figura shape : shapes) {
                        if (shape instanceof Figura) {
                            if (shape instanceof Triangulo) {
                                // System.out.println("Color: " + shape.getColor());
                                // System.out.println("Area: " + shape.getArea());
                                // System.out.println("Perimetro: " + shape.getPerimeter());
                                System.out.println(shape);

                            }
                        }
                    }
                } else if (option == 11)
                    break;
                else
                    System.out.println("Opcion incorrecta");
            }

            System.out.println("\n\n");
        } while (1 == 1);

        scanner.close();

    }
}
