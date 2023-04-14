package org.example;

public class Rectangulo extends Figura implements CalculoBidimencional {

  private double largo;
  private double ancho;
  public Rectangulo(String nombre, double largo, double ancho){
    super.nombre = nombre;
    this.largo = largo;
    this.ancho = ancho;

  }
  @Override
  public double calcularPerimetro() {
    return 2 * (largo + ancho);
  }

  @Override
  public double calcularArea() {
    return this.largo * this.ancho;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }
}
