package org.example;

public class Calcular {
  //inyeccion de dependencias
  private CalculoBidimencional calculoBidimencional;
  public Calcular(CalculoBidimencional calculoBidimencional){
    this.calculoBidimencional = calculoBidimencional;
  }

  public double calcularAreaBidimencional(){
    return calculoBidimencional.calcularArea();
  }
  public double calcularPerimetroBidimencional(){
    return calculoBidimencional.calcularPerimetro();
  }
  public String getNombreBidimencional(){
    return calculoBidimencional.getNombre();
  }

  //------------------------------------ No se me ocurrio una mejor implementacion para recibir las 2 interfaces :C
  private CalculoTridimencional calculoTridimencional;
  public Calcular(CalculoTridimencional calculoTridimencional){
    this.calculoTridimencional = calculoTridimencional;
  }

  public double calcularAreaTridimencional(){
    return calculoTridimencional.calcularArea();
  }
  public double calcularPerimetroTridimencional(){
    return calculoTridimencional.calcularPerimetro();
  }
  public double calcularVolumenTridimencional(){
    return calculoTridimencional.calcularVolumen();
  }
  public String getNombreTridimencional(){
    return calculoTridimencional.getNombre();
  }
}
