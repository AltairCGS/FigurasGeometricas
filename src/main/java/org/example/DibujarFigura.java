package org.example;

public class DibujarFigura {
  public static void dibujarFiguraBidimencional(Calcular calcular){
    System.out.println("Entrando a dibujar");
    if (calcular != null){
      System.out.println("\nDibujando figura");
      System.out.println("Nombre de la figura: " + calcular.getNombreBidimencional());
      System.out.println("Area: " + calcular.calcularAreaBidimencional() + " cm");
      System.out.println("Perimetro: " + calcular.calcularPerimetroBidimencional() + " cm");
    }
  }

  //--------------No se me ocurrio una mejor forma jeje
  public static void dibujarFiguraTridimencional(Calcular calcular){
    System.out.println("Entrando a dibujar");
    if (calcular != null){
      System.out.println("\nDibujando figura");
      System.out.println("Nombre de la figura: " + calcular.getNombreTridimencional());
      System.out.println("Area: " + calcular.calcularAreaTridimencional() + " cm^2");
      System.out.println("Perimetro: " + calcular.calcularPerimetroTridimencional() + " cm");
      System.out.println("Volumen: " + calcular.calcularVolumenTridimencional() + " cm^3");
    }
  }
}
