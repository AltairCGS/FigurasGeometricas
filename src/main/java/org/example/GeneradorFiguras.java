package org.example;

public class GeneradorFiguras {
  public static void crearCuadrado(String nombre, double longitudDeUnLado) throws Exception {
    if (longitudDeUnLado > 10 || longitudDeUnLado <= 0) {
      throw new Exception("La longitud del lado del cuadrado no puede ser mayor a 10 cm ni menor o igual a 0");
    }
    Cuadrado cuadrado = new Cuadrado(nombre, longitudDeUnLado);
    Calculo calculo = new Calculo(cuadrado);
    Dibujo.dibujarFiguraBidimencional(calculo);
  }

  public static void crearRectangulo(String nombre, double largo, double ancho) throws Exception {
    if ((largo > 10 || largo < 1) && (ancho > 10 || ancho < 1) || (ancho > largo)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0, el ancho no debe ser mayor al largo");
    }
    Rectangulo rectangulo = new Rectangulo(nombre, largo, ancho);
    Calculo calculo = new Calculo(rectangulo);
    Dibujo.dibujarFiguraBidimencional(calculo);
  }

  public static void crearTrianguloEquilatero(String nombre, double longitud) throws Exception {
    if ((longitud > 10 || longitud < 1)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0");
    }
    TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(nombre, longitud);
    Calculo calculo = new Calculo(trianguloEquilatero);
    Dibujo.dibujarFiguraBidimencional(calculo);
  }

  public static void crearTrianguloIsosceles(String nombre, double ladoIgual, double base) throws Exception {
    if ((ladoIgual > 10 || ladoIgual < 1 || base > 10 || base < 1 || ladoIgual == base)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0 y la base no puede medir lo mismo que sus lados iguales o seria un triangulo equilatero");
    }
    TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles(nombre, ladoIgual, base);
    Calculo calculo = new Calculo(trianguloIsosceles);
    Dibujo.dibujarFiguraBidimencional(calculo);
  }

  public static void crearTrianguloEscaleno(String nombre, double lado1, double lado2, double lado3) throws Exception {
    if (!(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) || (lado1 > 10 || lado1 < 1 || lado2 > 10 || lado2 < 1 || lado3 > 10 || lado3 < 1)) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0 y la suma de la longitud de dos lados debe ser mayor al lado restante o no seria un triangulo valido");
    }
    TrianguloEscaleno trianguloEscaleno = new TrianguloEscaleno(nombre, lado1, lado2, lado3);
    Calculo calculo = new Calculo(trianguloEscaleno);
    Dibujo.dibujarFiguraBidimencional(calculo);
  }
  public static void crearCubo(String nombre, double lado) throws Exception {
    if (lado > 10 || lado < 1) {
      throw new Exception("La longitud de los lados no puede ser mayor a 10 cm ni menor o igual a 0.");
    }
    Cubo cubo = new Cubo(nombre, lado);
    Calculo calculo = new Calculo(cubo);
    Dibujo.dibujarFiguraTridimencional(calculo);
  }
  public static void crearCilindro(String nombre, double radio, double altura) throws Exception {
    if (radio > 10 || radio < 1 || altura > 10 || altura < 1) {
      throw new Exception("El radio y la altura no puedes medir mas de 10 y menos de 1");
    }
    Cilindro cilindro = new Cilindro(nombre, radio, altura);
    Calculo calculo = new Calculo(cilindro);
    Dibujo.dibujarFiguraTridimencional(calculo);
  }
}
