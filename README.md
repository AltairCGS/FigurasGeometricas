# Reto Figuras Geometricas
- Decidí abordar el modelado de mi solución de esta manera porque siento que es con la que más cumplo con los principios de la programación orientada a objetos y los principios SOLID, el código pasó por varias modificaciones hasta tener el modelado actual, antes de crear alguna clase modele un poco en mi mente que clase seria la superclase que le heredara al resto sus atributos y qué interfaz tenia que crear para que las clases que la implementaran aplicaran su comportamiento en cuanto a los métodos, teniendo esto en cuenta fui construyendo el código sin nunca dejarme de preguntar si cumplia o no los principios POO y SOLID.
El código cumple con los siguientes principios de la Programación Orientada a Objetos (POO)
* IMPORTANTE: cuando cree una figura volverá a salir las opciones para crear otra figura, el dibujo de la figura se imprime más arriba, para que verifique

* Pasaré a exponer qué principios POO y SOLID cumplen mi código según mi criterio
***

## Abstracción
-  se están definiendo clases abstractas e interfaces para modelar las figuras y los cálculos que se pueden realizar con ellas, lo cual es un buen ejemplo de abstracción.

## Herencia
- Se están utilizando las jerarquías de clases para representar las relaciones de herencia entre las figuras y para extender las funcionalidades de la clase base (Figura) a las clases derivadas (Cuadrado, Rectangulo, TrianguloEquilatero y Cubo).

## Polimorfismo
- Se están definiendo métodos con la misma firma en las interfaces CalculoBidimencional, CalculoTridimencional y en las clases que las implementan. Esto permite que se puedan utilizar objetos de diferentes clases de manera intercambiable en cualquier método que reciba una instancia de las interfaces mencionadas.

## Encapsulamiento
- Se están utilizando modificadores de acceso (protected) para limitar el acceso a los campos de las clases Figura y FiguraTridimencional desde las subclases. También se está utilizando el modificador private para los atributos de las clases que heredan.

## Coherencia en los nombres de los métodos
- Los métodos de las interfaces y de las clases están nombrados de forma coherente con su función.

## Excepciones
- Se están lanzando excepciones cuando se intenta crear un objeto con parámetros inválidos. Esto ayuda a garantizar que los objetos creados sean coherentes y tengan valores válidos.

***
* Principios SOLID que se cumplen:

## Principio de responsabilidad única (SRP):
- cada clase tiene una sola responsabilidad. Por ejemplo, la clase Figura únicamente contiene propiedades compartidas entre las figuras, sin métodos adicionales. Las interfaces CalculoBidimensional y CalculoTridimensional se encargan de definir los métodos para el cálculo de áreas y perímetros. La clase Calculo se encarga de realizar los cálculos.

## Principio de abierto/cerrado (OCP):
- el código es extensible sin modificar el código fuente original. Las figuras existentes no necesitan ser cambiadas si se agregan nuevas figuras, por ejemplo, una esfera. En lugar de eso, simplemente se deben implementar las interfaces correspondientes y agregar el metodo para crear el objeto.

## Principio de sustitución de Liskov (LSP):
- las subclases pueden ser usadas en lugar de la clase padre sin cambiar el comportamiento del programa. Por ejemplo, cualquier clase que implemente la interfaz CalculoBidimensional se puede pasar al método dibujarFiguraBidimencional() en DibujarFigura sin causar problemas.

## Principio de segregación de interfaz (ISP):
- las interfaces están diseñadas para ser cohesivas y no contienen métodos innecesarios. Los métodos de cálculo en las interfaces CalculoBidimensional y CalculoTridimensional son necesarios y relevantes para las figuras bidimensionales y tridimensionales, respectivamente.

## Principio de inversión de dependencia (DIP):
- las clases de nivel superior no dependen de las clases de nivel inferior, sino de las abstracciones. Por ejemplo, la clase Calculo depende de la interfaz CalculoBidimensional y CalculoTridimensional, en lugar de depender directamente de las clases Cuadrado o Cubo.