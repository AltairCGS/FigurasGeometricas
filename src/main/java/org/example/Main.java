package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {

    System.out.println("Binvenido, puedes crear cualquiera de las figuras elegibles y explorar entre las opciones");
    //------------------------------------------------
    mostrarMenu();
  }
  public static void mostrarMenu() {
    Scanner scanner = new Scanner(System.in);

    // Mostrar el menú principal
    System.out.println("¿Qué figura deseas crear?");
    System.out.println("1. Cuadrado");
    System.out.println("2. Rectángulo");
    System.out.println("3. Triángulo");
    System.out.println("4. Salir");

    int opcion = scanner.nextInt();
    scanner.nextLine();

    switch (opcion) {
      case 1:
        System.out.print("Ingresa un nombre para el cuadrado: ");
        String nombreC = scanner.nextLine();
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double longitud = Double.parseDouble(scanner.nextLine());
        // Crear un cuadrado
        try {
          CrearFigura.crearCuadrado(nombreC,longitud);
        } catch (Exception e) {
          System.out.println("Error: " + e.getMessage() + "\n Intente nuevamente.");
        }
        break;
      case 2:
        System.out.print("Ingresa un nombre para el rectangulo: ");
        String nombreR = scanner.nextLine();
        System.out.print("Ingresa el largo del rectangulo: ");
        double largo = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingresa el ancho del rectangulo: ");
        double ancho = Double.parseDouble(scanner.nextLine());
        // Crear un rectángulo
        try {
          CrearFigura.crearRectangulo(nombreR, largo, ancho);
        } catch (Exception e) {
          System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
        }
        break;
      case 3:
        System.out.println("1. Equilatero");
        System.out.println("2. Isosceles");
        System.out.println("3. Escaleno");

        int opcionT = scanner.nextInt();
        scanner.nextLine();

        switch (opcionT) {
          case 1:
            System.out.print("Ingresa un nombre para el triangulo: ");
            String nombreE = scanner.nextLine();
            System.out.print("Ingrese la longitud de un lado del triangulo: ");
            double longitudE = Double.parseDouble(scanner.nextLine());
            //crear triangulo equilatero
            try {
              CrearFigura.crearTrianguloEquilatero(nombreE, longitudE);
            } catch (Exception e) {
              System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
            }
            break;
          case 2:
            System.out.print("Ingresa un nombre para el triangulo: ");
            String nombreI = scanner.nextLine();
            System.out.print("Ingrese la longitud de los lados iguales: ");
            double longitudI = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese la longitud de la base: ");
            double longitudBI = Double.parseDouble(scanner.nextLine());
            //crear triangulo isosceles
            try {
              CrearFigura.crearTrianguloIsosceles(nombreI, longitudI, longitudBI);
            } catch (Exception e) {
              System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
            }
            break;
          case 3:
            System.out.print("Ingresa un nombre para el triangulo: ");
            String nombreEs = scanner.nextLine();
            System.out.print("Ingrese la longitud del primer lado: ");
            double lado1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese la longitud del segundo lado: ");
            double lado2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese la longitud del tercer lado: ");
            double lado3 = Double.parseDouble(scanner.nextLine());
            //crear triangulo escaleno
            try {
              CrearFigura.crearTrianguloEscaleno(nombreEs, lado1, lado2, lado3);
            } catch (Exception e) {
              System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
            }
            break;
        }
        break;
      case 4:
        // Salir del programa
        System.out.println("Saliendo del programa...");
        System.exit(0);
        break;
      default:
        System.out.println("Opción no válida");
        break;
    }
  }
}