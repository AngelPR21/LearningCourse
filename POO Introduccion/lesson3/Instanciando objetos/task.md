## Instanciación e inicialización de objetos 

Se puede distinguir entre variables automáticas y dinámicas. En el primer caso, en tiempo de ejecución, cuando se entra en un bloque que contiene las declaraciones de una variable u objeto, se le asigna espacio de memoria automáticamente. Paralelamente, cuando el bloque termina su ejecución, el espacio es liberado automáticamente. Las variables dinámicas en cambio, han de ser explícitamente asignadas mediante una función, que tanto en Java como en C++ es con el operador new .  

 

| JAVA                         |                                            |
| ---------------------------- | ------------------------------------------ |
| Board myBoard = new Board(); | myBoard es una instancia de la clase Board |

 

Cuando se asigna memoria dinámicamente es preciso recuperarla cuando los datos dejan de ser necesarios. En el caso de C++ se obliga a que el programador libere explícitamente el espacio reservado con new(), mediante el operador delete (normalmente desde los destructores de cada clase). En cambio, en Java o C#, se detecta automáticamente cuando los valores dejan de ser accesibles (cuando ya no están referenciados) y no pueden usarse en ningún cálculo futuro. La recolección de basura suele hacerse mediante un proceso en segundo plano, en caso de java, el Garbage Collection. La principal desventaja de este proceso es que es costoso en cuanto a recursos de cómputo.  

A la vez que se asigna memoria es posible dar valores iniciales a los campos de los objetos. Esta inicialización puede llevarse a cabo por defecto o mediante la llamada explícita a un método constructor de la clase. Tanto Java como C++ crean un constructor por defecto, sin embargo, es posible definir constructores alternativos.  

Cuando se crea un objeto se llama automáticamente al constructor del objeto, que no es otra cosa que un método con el mismo nombre que la clase en el que se puede reservar memoria, dar valores iniciales a las propiedades, etc. Por ejemplo: 

 

```java
public class Board { 

    private int size; 

    public Board(int size) { 

        this.size = size; 

    } 

    // ...

} 
```

 

En el ejemplo anterior, se puede ver como la clase Board tiene un constructor que recibe como parámetro un tamaño. Dentro del constructor, se establece la propiedad size del objeto con el valor size pasado por parámetro. Obsérvese como para poder diferenciar entre el atributo del objeto, y el parámetro del constructor se utiliza la palabra reservada this. Esta palabra reservada apunta al propio objeto, por lo que this.size se puede leer como la propiedad size del propio objeto. 

![](../../../images/task.png)

Completa la clase Main para crear un objeto de tipo tablero de tamaño 5.