package org.example;

public class Dibujo {
  public static void dibujarFiguraBidimencional(Calculo calculo){
    System.out.println("Entrando a dibujar");
    if (calculo != null){
      System.out.println("\nDibujando figura");
      System.out.println("Nombre de la figura: " + calculo.getNombreBidimencional());
      System.out.println("Area: " + calculo.calcularAreaBidimencional() + " cm");
      System.out.println("Perimetro: " + calculo.calcularPerimetroBidimencional() + " cm");
    }
  }

  //--------------No se me ocurrio una mejor forma jeje
  public static void dibujarFiguraTridimencional(Calculo calculo){
    System.out.println("Entrando a dibujar");
    if (calculo != null){
      System.out.println("\nDibujando figura");
      System.out.println("Nombre de la figura: " + calculo.getNombreTridimencional());
      System.out.println("Area: " + calculo.calcularAreaTridimencional() + " cm^2");
      System.out.println("Perimetro: " + calculo.calcularPerimetroTridimencional() + " cm");
      System.out.println("Volumen: " + calculo.calcularVolumenTridimencional() + " cm^3");
    }
  }
}
