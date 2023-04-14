package org.example;

public class TrianguloIsosceles extends Triangulo implements CalculoBidimencional {
  private double ladoIgual;
  private double base;

  public TrianguloIsosceles(String nombre, double ladoIgual, double base){
    super.nombre = nombre;
    this.ladoIgual = ladoIgual;
    this.base = base;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * this.ladoIgual + base;
  }

  @Override
  public double calcularArea() {
    double altura = Math.sqrt(ladoIgual * ladoIgual - (base * base) / 4);
    return (base * altura) / 2;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }
}
