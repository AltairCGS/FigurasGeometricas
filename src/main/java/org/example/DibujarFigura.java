package org.example;

public class DibujarFigura {
  public static void dibujarFigura(Calcular calcular){
    System.out.println("Entrando a dibujar");
    if (calcular != null){
      System.out.println("\nDibujando figura");
      System.out.println("Nombre del la figura: " + calcular.getNombre());
      System.out.println("Area: " + calcular.calcularArea() + " cm");
      System.out.println("Perimetro: " + calcular.calcularPerimetro() + " cm");
    }
  }
}
