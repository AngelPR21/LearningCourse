# Enum

Java al igual que la mayoría de lenguajes de programación, establece un nuevo tipo de dato que son los enum. Los enum, no es mas ni menos que un conjunto de valores definidos de forma explicita, donde estos solo pueden tomar los valores especificados.

```java
public class Main {

   //...
       
   public enum Day {

      // Unicos objetos permitidos
      LUNES(false),
      MARTES(false),
      MIERCOLES(false),
      JUEVES(false),
      VIERNES(false),
      SABADO(true),
      DOMINGO(true);

      // Declaracion de atributos
      private boolean festivo;

      // Constructor privado
      Day(boolean festivo){
         this.festivo = festivo;
      }

      // Metodos
      public boolean esFestivo(){
         return festivo;
      }

      public Day nextDay(){
         return values()[(ordinal()+1)% values().length];
      }
   }
}
```

Si observamos la definición de enum dentro de la clase Main, estos se definen utilizando la palabra reservada enum, y puedan estar definidos dentro de una clase (como este caso) o en un fichero independiente. Como curiosidad, al no poder existir mas instancias, las instancias creadas se consideran constantes, y ese el motivo por el cual normalmente veremos definidos los enum utilizando mayúsculas.

En java, la funcionamiento de los enum, no es ni más ni menos que una clase donde solo se permiten un numero determinado de instancias. En este caso solamente tenemos siete instancias, y no podremos tener mas.

Esto es debido a que en los enum, el constructor es privado (su visibilidad se omite por ser redundante), y solamente es llamado cuando se crean cada una de las instancias del enum. En el caso anterior, el cada enum tiene un atributo booleano que almacena si ese día es festivo o no, y que es inicializado por el constructor, pero podemos tener tantos atributos como deseemos.

Observa que al tratarse de una clase, también podemos dotar a los enum de métodos como:

- Getters y Setters
- Métodos funcionales.

Una particularidad de los enum, es que en otros lenguajes, existe una relación de antecesor y predecesor, que no se encuentra en Java, pero que se puede implementar fácilmente. Observa como se combinan los métodos values() y ordinal() para obtener el siguiente enum en el ejemplo Day.  

Como se acaba de comentar, los enum disponen de una serie de métodos propios por el mero hecho de ser enum, como:

- values(): Es un método estático que devuelve un vector con cada uno de los elementos del enum, ordenados segun han sido declarados. Esto nos permite iterar fácilmente entre ellos:

  ```java
  for(Day day : Day.values())
     System.out.println(day);
  ```

- ordinal(): Es un método instancia que nos devuelve la posición que ocupa un determinado enum en la declaración, siendo el primero la posición 0.

  ```
  System.out.println(Day.MIERCOLES.ordinal()); // Muestra 2
  ```

- valueOf(String name): Método estático que devuelve un enum a partir de su nombre.

  ```
  Day d = Day.valueOf("LUNES"); // Se obtiene el LUNES como enum
  ```

  

Como curiosidad, si no deseamos que un enum disponga de atributos ni métodos podemos crearlos sin constructor (ya que se dispone del constructor por defecto) como se muestra a continuación:

```java
public enum Lado {
   CARA, CRUZ
}
```
