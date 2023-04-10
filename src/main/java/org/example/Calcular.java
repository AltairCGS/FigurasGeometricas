package org.example;

public class Calcular {
  //inyeccion de dependencias
  private FiguraBidimencional figuraBidimencional;

  public Calcular(FiguraBidimencional figuraBidimencional){
    this.figuraBidimencional = figuraBidimencional;
  }
  public double calcularArea(){
    return figuraBidimencional.calcularArea();
  }
  public double calcularPerimetro(){
    return figuraBidimencional.calcularPerimetro();
  }
  public String getNombre(){
    return figuraBidimencional.getNombre();
  }
}
