package org.example;

public class Cubo extends FiguraTridimencional implements CalculoTridimencional{
  private double lado;
  public Cubo(String nombre, double lado){
    super.nombre = nombre;
    this.lado = lado;
  }
  @Override
  public double calcularVolumen() {
    super.volumen = Math.pow(lado, 3);
    return super.volumen;
  }

  @Override
  public double calcularPerimetro() {
    super.perimetro = lado * 12;
    return super.perimetro;
  }

  @Override
  public double calcularArea() {
    super.area = Math.pow(lado, 2) * 6;
    return super.area;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }
}
