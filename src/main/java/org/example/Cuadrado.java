package org.example;

public class Cuadrado extends Figura implements CalculoBidimencional {
  private double longitudDeUnLado;
  public Cuadrado(String nombre, double longitudDeUnLado){
    super.nombre = nombre;
    this.longitudDeUnLado = longitudDeUnLado;
  }

  @Override
  public double calcularPerimetro() {
    super.perimetro = longitudDeUnLado * 4;
    return super.perimetro;
  }

  @Override
  public double calcularArea() {
    super.area = longitudDeUnLado * longitudDeUnLado;
    return super.area;
  }

  @Override
  public String getNombre() {
    return super.nombre;
  }

}
