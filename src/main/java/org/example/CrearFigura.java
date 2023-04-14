package org.example;

public class CrearFigura {
  public static void crearCuadrado(String nombre, double longitudDeUnLado) throws Exception {
    if (longitudDeUnLado > 10 || longitudDeUnLado <= 0) {
      throw new Exception("La longitud del lado del cuadrado no puede ser mayor a 10 cm ni menor o igual a 0");
    }
    Cuadrado cuadrado = new Cuadrado(nombre, longitudDeUnLado);
    Calcular calcular = new Calcular(cuadrado);
    DibujarFigura.dibujarFiguraBidimencional(calcular);
  }

  public static void crearRectangulo(String nombre, double largo, double ancho) throws Exception {
    if ((largo > 10 || largo < 1) && (ancho > 10 || ancho < 1) || (ancho > largo)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0, el ancho no debe ser mayor al largo");
    }
    Rectangulo rectangulo = new Rectangulo(nombre, largo, ancho);
    Calcular calcular = new Calcular(rectangulo);
    DibujarFigura.dibujarFiguraBidimencional(calcular);
  }

  public static void crearTrianguloEquilatero(String nombre, double longitud) throws Exception {
    if ((longitud > 10 || longitud < 1)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0");
    }
    TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(nombre, longitud);
    Calcular calcular = new Calcular(trianguloEquilatero);
    DibujarFigura.dibujarFiguraBidimencional(calcular);
  }

  public static void crearTrianguloIsosceles(String nombre, double ladoIgual, double base) throws Exception {
    if ((ladoIgual > 10 || ladoIgual < 1 || base > 10 || base < 1 || ladoIgual == base)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0 y la base no puede medir lo mismo que sus lados iguales o seria un triangulo equilatero");
    }
    TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles(nombre, ladoIgual, base);
    Calcular calcular = new Calcular(trianguloIsosceles);
    DibujarFigura.dibujarFiguraBidimencional(calcular);
  }

  public static void crearTrianguloEscaleno(String nombre, double lado1, double lado2, double lado3) throws Exception {
    if (!(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) || (lado1 > 10 || lado1 < 1 || lado2 > 10 || lado2 < 1 || lado3 > 10 || lado3 < 1)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0 y la suma de la longitud de dos lados debe ser mayor al lado restante o no seria un triangulo valido");
    }
    TrianguloEscaleno trianguloEscaleno = new TrianguloEscaleno(nombre, lado1, lado2, lado3);
    Calcular calcular = new Calcular(trianguloEscaleno);
    DibujarFigura.dibujarFiguraBidimencional(calcular);
  }
  public static void crearCubo(String nombre, double lado) throws Exception {
    if (lado > 10 || lado < 1) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0.");
    }
    Cubo cubo = new Cubo(nombre, lado);
    Calcular calcular = new Calcular(cubo);
    DibujarFigura.dibujarFiguraTridimencional(calcular);
  }
}
