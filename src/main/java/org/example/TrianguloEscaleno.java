package org.example;

public class TrianguloEscaleno extends Triangulo implements FiguraBidimencional{
  private double primerLado;
  private double segundoLado;
  private double tercerLado;

  public TrianguloEscaleno(String nombre, double primerLado, double segundoLado, double tercerLado){
    super.nombre = nombre;
    this.primerLado = primerLado;
    this.segundoLado = segundoLado;
    this.tercerLado = tercerLado;
  }

  @Override
  public double calcularPerimetro() {
    return primerLado + segundoLado + tercerLado;
  }

  @Override
  public double calcularArea() {
    double semiperimetro = calcularPerimetro() / 2;
    double area = Math.sqrt(semiperimetro * (semiperimetro - primerLado) * (semiperimetro - segundoLado) * (semiperimetro - tercerLado));
    return area;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }
}
