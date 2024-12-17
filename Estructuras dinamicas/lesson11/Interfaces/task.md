# Interfaces 

Hay muchas situaciones en la ingeniería del software, donde los desarrolladores que desean diferentes componentes, necesitan de una especie de acuerdo o contrato que permita la interacción entre los componentes. Esto permite poder desarrollar componentes sin necesidad de conocer como se ha implementado otro componente con el que se ha de interactuar. 

Para este fin, JAVA al igual que la gran mayoría de lenguaje de programación, dispone de las interfaces (interface). En JAVA, una interfaz es similar a una clase, que solo puede contener: 

- Constantes 
- Firmas de métodos 
- Métodos predeterminados 
- Métodos estáticos 
- Tipos anidados 

Los cuerpos de los métodos, solo pueden estar presente para los métodos predeterminados o por defecto y los métodos estáticos. 

A diferencia de las clases, no podemos crear instancias directamente de una interfaz, sino que solo podemos implementar esa interfaz en una clase, o bien ampliarla mediante otras interfaces. 

Para crear una interfaz, simplemente definiremos una interfaz mediante la palabra reservada interface. Aquí podemos ver un ejemplo de una interfaz muy sencilla, para un supuesto sistema de guiado por GPS para automoviles:

```java
public interface IConduccionAutonoma {
    void acelerar(float aceleracion);
    void frenar(float aceleracion);
    void establecerVelocidad(int velocidad);
    void girar(int angulo);
}
```

Una vez definida nuestra interfaz, cualquier clase podrá implementar dicha interfaz de la siguiente manera:

```java
public class ConduccionAutonomaImp implements IConduccionAutonoma{
    
    @Override
    public void acelerar(float aceleracion) {

    }

    @Override
    public void frenar(float aceleracion) {

    }

    @Override
    public void establecerVelocidad(int velocidad) {

    }

    @Override
    public void girar(int angulo) {

    }
}
```

Según nuestra interfaz, cualquier marca de coches que quisiera utilizar nuestro sistema de guiado, solamente tendría que implementar nuestra interfaz, dando respuesta a cada una de las funciones. Por nuestra parte, nos despreocuparíamos de el como han sido implementadas, pudiendo utilizarlas sin problemas, ya que el uso de las interfaces es vista como un contrato que deben cumplir ambas partes del código.

![](../../../images/bumb.png)

Observa la definición, implementación y utilización de la interfaz del ejemplo.

