package org.example;

public class TrianguloEquilatero extends Triangulo implements FiguraBidimencional{
  private double longitudDeUnLado;
  public TrianguloEquilatero(String nombre, double longitudDeUnLado){
    super.nombre = nombre;
    this.longitudDeUnLado = longitudDeUnLado;
  }
  @Override
  public double calcularPerimetro() {
    return longitudDeUnLado * 3;
  }

  @Override
  public double calcularArea() {
    double altura = Math.sqrt(Math.pow(longitudDeUnLado,2) - Math.pow((longitudDeUnLado/2),2));
    return (longitudDeUnLado * altura ) / 2;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }
}
