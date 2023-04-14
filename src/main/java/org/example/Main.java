package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Binvenido, puedes crear cualquiera de las figuras elegibles y explorar entre las opciones");
    //------------------------------------------------
    mostrarMenu();
  }
  public static void mostrarMenu() {
    Scanner scanner = new Scanner(System.in);

    // Mostrar el menú principal
    int opcion;
    do {
      System.out.println("¿Qué figura deseas crear?");
      System.out.println("1. Cuadrado");
      System.out.println("2. Rectángulo");
      System.out.println("3. Triángulo");
      System.out.println("4. Cubo");
      System.out.println("5. Cilindro");
      System.out.println("6. Salir");

      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> {
          System.out.print("Ingresa un nombre para el cuadrado: ");
          String nombreC = scanner.nextLine();
          System.out.print("Ingrese la longitud del lado del cuadrado: ");
          double longitud = Double.parseDouble(scanner.nextLine());
          // Crear un cuadrado
          try {
            GeneradorFiguras.crearCuadrado(nombreC, longitud);
          } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\n Intente nuevamente.");
          }
        }
        case 2 -> {
          System.out.print("Ingresa un nombre para el rectangulo: ");
          String nombreR = scanner.nextLine();
          System.out.print("Ingresa el largo del rectangulo: ");
          double largo = Double.parseDouble(scanner.nextLine());
          System.out.print("Ingresa el ancho del rectangulo: ");
          double ancho = Double.parseDouble(scanner.nextLine());
          // Crear un rectángulo
          try {
            GeneradorFiguras.crearRectangulo(nombreR, largo, ancho);
          } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
          }
        }
        case 3 -> {
          System.out.println("1. Equilatero");
          System.out.println("2. Isosceles");
          System.out.println("3. Escaleno");
          int opcionT = scanner.nextInt();
          scanner.nextLine();
          switch (opcionT) {
            case 1 -> {
              System.out.print("Ingresa un nombre para el triangulo: ");
              String nombreE = scanner.nextLine();
              System.out.print("Ingrese la longitud de un lado del triangulo: ");
              double longitudE = Double.parseDouble(scanner.nextLine());
              //crear triangulo equilatero
              try {
                GeneradorFiguras.crearTrianguloEquilatero(nombreE, longitudE);
              } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
              }
            }
            case 2 -> {
              System.out.print("Ingresa un nombre para el triangulo: ");
              String nombreI = scanner.nextLine();
              System.out.print("Ingrese la longitud de los lados iguales: ");
              double longitudI = Double.parseDouble(scanner.nextLine());
              System.out.print("Ingrese la longitud de la base: ");
              double longitudBI = Double.parseDouble(scanner.nextLine());
              //crear triangulo isosceles
              try {
                GeneradorFiguras.crearTrianguloIsosceles(nombreI, longitudI, longitudBI);
              } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
              }
            }
            case 3 -> {
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
                GeneradorFiguras.crearTrianguloEscaleno(nombreEs, lado1, lado2, lado3);
              } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
              }
            }
          }
        }
        case 4 -> {
          System.out.print("Ingresa un nombre para el cubo: ");
          String nombreCu = scanner.nextLine();
          System.out.print("Ingresa la longitud de un lado: ");
          double longitudCu = Double.parseDouble(scanner.nextLine());
          // Crear un cubo
          try {
            GeneradorFiguras.crearCubo(nombreCu, longitudCu);
          } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
          }
        }
        case 5 -> {
          System.out.print("Ingresa un nombre para el cilindro: ");
          String nombreCi = scanner.nextLine();
          System.out.print("Ingresa el radio del cilindro: ");
          double radioCi = Double.parseDouble(scanner.nextLine());
          System.out.print("Ingresa la altura del cilindro: ");
          double alturaCi = Double.parseDouble(scanner.nextLine());
          // Crear un cilindro
          try {
            GeneradorFiguras.crearCilindro(nombreCi, radioCi, alturaCi);
          } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + "\nIntente nuevamente");
          }
        }
        case 6 -> {
          // Salir del programa
          System.out.println("Saliendo del programa...");
          System.exit(0);
        }
        default -> System.out.println("Opción no válida");
      }
    } while (opcion != 6);
    scanner.close();
  }
}