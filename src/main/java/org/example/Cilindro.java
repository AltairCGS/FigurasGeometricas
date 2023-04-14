package org.example;

public class Cilindro extends FiguraTridimencional implements CalculoTridimencional{
  private double radio;
  private double altura;
  public Cilindro(String nombre, double radio, double altura){
    super.nombre = nombre;
    this.radio = radio;
    this.altura = altura;
  }

  @Override
  public double calcularVolumen() {
    super.volumen = Math.PI * Math.pow(radio, 2) * altura;
    return super.volumen;
  }

  @Override
  public double calcularPerimetro() {
    super.perimetro = 2 * Math.PI * radio;
    return super.perimetro;
  }

  @Override
  public double calcularArea() {
    super.area = 2 * Math.PI * radio * (radio + altura);
    return super.area;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }
}
