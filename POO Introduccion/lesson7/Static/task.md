# Static vs Instance

Hasta la aparición de la programación orientada a objetos, utilizamos métodos estáticos mediante la palabra reservada static. Pero ahora, vemos que los métodos no incorporan esta palabra reservada, siendo métodos instancia sin entender muy bien cuales son las diferencias.

Podemos establecer la diferencia entre ambos, en la pertenencia de estos métodos (también se puede dar en variables):

- Static: Hace referencia a que la propiedad de ese método o variable es la clase. Es decir, que para poder invocarlos, se deberá realizar a través de la clase y con el operador punto.
- Instance: No contiene el modificador static, por lo que la pertenencia de los métodos y/o atributos, son propios de cada objeto.

Observa como ejemplo la clase Cuenta:

```java
public class Cuenta {

    public static int siguiente = 1;

    private int numero;

    public Cuenta(){
        numero = siguiente++;
    }

    public int getNumero() {
        return numero;
    }

    public static int obtenerSiguiente(){
        return siguiente;
    }

    @Override
    public String toString() {
        return "Cuenta: " + numero;
    }
}
```

Observa como se han declarado como estáticos la variable siguiente y el método obtenerSiguiente(). 

El valor de variable siguiente, al estar declarada como estática, esta pertenece a la clase y obviamente al estar declarada en la propia clase, accesible a todos los objetos de tipo Cuenta. En algunos lenguajes de programación, este tipo de variables se les conoce como variables globales. Por otro lado, para poder acceder a su valor desde fuera de la clase, se debe acceder a través de la clase Cuenta. Puedes ver un ejemplo en la clase Main.

Del mismo modo el método obtenerSiguiente, al ser estático, deberemos invocarlo a través de la clase como se aprecia en el ejemplo en la clase Main. 

Por otro lado, los métodos y variables instancia (estos últimos llamados atributos), pertenecen a sus respectivos objetos, así que cada objeto del tipo Cuenta, tendrá su atributo número, cada uno con un valor diferente como podemos observar en el ejemplo Main.

Un error muy común que se comete cuando se esta aprendiendo a programar, es intentar acceder desde un método estático a un valor o método instancia. Por ejemplo, imagina que quisiéramos tener definido un método de esta manera:

```java
public static int obtenerNumero(){
    return numero;
}
```

Esto nos daría un error de compilación, ya que no se puede acceder desde un método estático a una variable (o método) instancia. Imagina si ejecutaramos la orden Cuenta.obtenerNumero(), ¿Que valor numero se obtendría de entre todos los objetos cuenta?

En cambio al revés si que se puede acceder, es decir, desde un método instancia, si que podemos acceder a una variable o método estático.

