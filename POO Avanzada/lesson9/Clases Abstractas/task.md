# Clases Abstractas

Como hemos visto anteriormente, la herencia es una herramienta muy poderosa que nos permite transmitir propiedades y comportamientos desde las clases padre a las clases hija. Esto nos permite que simplemente extendiendo de una clase, dispongamos de una cantidad de atributos y métodos sin prácticamente hacer nada.

Otra herramienta que nos suministra la programación orientada objetos, fuertemente ligada a la herencia, son las clases abstractas. Podemos definir una clase abstracta, como una clase que no puede ser instanciada. Es decir, no podremos crear objetos de esta clase.

A priori, nos puede parecer absurdo crear una clase de la cual no podemos crear objetos, pero esto nos va a permitir agrupar en una clase una serie de propiedades y comportamientos que luego podrán extender sus clases hijas.

Para poder declarar una clase abstracta, simplemente deberemos añadir a su declaración la palabra reservada abstract como se muestra a continuación:

```java
public abstract class Figura {

    private int lados;

    public Figura(int lados) {
        this.lados = lados;
    }

    // Getters & Setters
}
```

Como puedes observar, a pesar de que la clase tiene un constructor, al declararla como abstract, ya no podremos crear objetos de tipo Figura. Es decir no podremos realizar lo siguiente:

```java
Figura figura = new Figura(4,2);
```

Se debe tener claro, que la finalidad de las clases abstractas no es la de crear objetos de este tipo, sino poder ser aprovechadas por otras clases que hereden de estas. De este modo, serán las clases hijas las que podrán ser instanciadas (o no, si también son abstractas) y estas deberán invocar al constructor de la clase padre. Por ejemplo:

```java
public class Circulo extends Figura{

    private float radio;
    
    public Circulo(float radio) {
        super(1);
        this.radio=radio;
    }

    // Otros metodos
}
```



Otra propiedad de las clases abstractas, es que estas pueden tener o no, métodos abstractos. Los métodos abstractos, son métodos que no tienen implementación. Es decir, solo esta declarada su firma. Esto obligara a que sean las clases hijas las que deberán darle cuerpo a dichos métodos. Veamos un ejemplo:

```java
public abstract class Figura {
    
    private int lados;

    public Figura(int lados) {
        this.lados = lados;
    }

    public abstract float area();

    // Getters & Setters
}
```

Observa como el método area(), es un método abstracto. Esto va a obligar que las clases hijas implementen dicho método y den respuesta a area():

```java
public class Circulo extends Figura{

    private float radio;
    
    public Circulo(float radio) {
        super(1);
        this.radio=radio;
    }

    @Override
    public float area() {
        return (float)(Math.PI*Math.pow(radio,2));
    }

    // Otros metodos
}
```

![](../../../images/bumb.png)

Completa la clase Cuadrado :

- Establece los atributos de Cuadrado que consideres necesarios.
- Haz que herede la clase Cuadrado de la clase Figura
- Comprueba como al heredar de la clase Figura, debes de:
  - Crear un constructor que invoque al constructor de Figura.
  - Implementar el método area()
- En la clase Main, prueba a crear un objeto de tipo Cuadrado, y comprueba que métodos tienes disponibles a partir de ese objeto.