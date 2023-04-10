package org.example;

public class Cuadrado extends Figura implements FiguraBidimencional{
  private double longitudDeUnLado;
  public Cuadrado(String nombre, double longitudDeUnLado){
    super.nombre = nombre;
    this.longitudDeUnLado = longitudDeUnLado;
  }

  @Override
  public double calcularPerimetro() {
    return longitudDeUnLado * 4;
  }

  @Override
  public double calcularArea() {
    return longitudDeUnLado * longitudDeUnLado;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }

}
