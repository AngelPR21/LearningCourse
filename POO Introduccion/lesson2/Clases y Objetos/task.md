## Introduccion a las clases y objetos

Los objetos son el punto clave para entender el paradigma de la programación orientada a objetos. A la hora de resolver cualquier problema del mundo real mediante un programa informático, debemos comenzar del mismo modo como lo hacíamos mediante la programación estructurada. Es decir, deberemos en un primer paso, identificar aquello del mundo real que tenga relevancia en nuestro problema. Por ejemplo, si quisiéramos simular el juego del ajedrez, deberíamos identificar aquello que es esencial para el juego: las fichas y el tablero.

En un primer análisis, hemos encontrado estos dos objetos del mundo real que deberemos representar (utilizaremos en un futuro). Como se puede observar, el tablero, posiblemente sea muy sencillo representarlo con un vector bidimensional, pero con las fichas la cosa se complica.

Las fichas del ajedrez, tienen diferentes formas y pueden ser blancas o negras. Observa como estas propiedades (tipo y color) son importantes a la hora de resolver el juego, ya que por ejemplo el color, entre otras cosas, indica a quien pertenece la ficha. Hay otras características del mundo real que por ejemplo puede no ser necesario representar, por ejemplo, la altura, anchura y peso de las piezas.

Cuando resolvíamos los problemas mediante programación estructurada, intentábamos representar el mundo real mediante tipos de datos básicos. Esto representa una limitación y complica enormemente la resolución de ejercicios de una determinada complejidad.

Para la resolución de un problema mediante el paradigma de la programación orientada a objetos, debemos tener claro, que todos los objetos tienen un *estado* y un *comportamiento*. Para nosotros será clave identificar dicho estado y comportamiento de estos para poder representar los diferentes objetos en nuestros programas.



Los objetos en la P.O.O., son conceptualmente similares a los objetos que podemos encontrar en el mundo real. Los objetos de software, almacenarán su estado en un conjunto de atributos de tipos básicos, o de otros objetos. Por otro lado, su comportamiento vendrá determinado por otro conjunto de métodos o funciones que será el modo de poder interactuar con dichos objetos. El mecanismo que permite ocultar el estado y dar visibilidad a dichas funciones, es lo que se conoce como encapsulación de datos.

## Clases

En términos prácticos, una clase es una especie de tipo definido por el usuario. Las clases son los bloques de construcción fundamentales de los programas orientados a objetos. Booch define una clase como “un conjunto de objetos que comparten una estructura y un comportamiento comunes”.

Una clase contiene un conjunto de atributos, variables o variables instancia que describen un objeto. Contiene también un conjunto de funciones que describen las acciones que un objeto puede realizar. Estas acciones se conocen como servicios o métodos.

Así pues, podemos decir en términos orientados a objetos, que una clase es como un molde que permite crear objetos, y que un objeto en cuestión es una instancia de la clase de ese objeto.

### Definición de clases

En java la definición de una clase suele hacerse con la palabra reservada class seguida del nombre de clase y entre llaves la definición de las propiedades y comportamiento según la siguiente estructura:



```java
[public | private] [ static ] class MyClass [ extends MySuperClass ] [ implements Interface1[,Interface2,..]] { 

// declaraciones de campos, constructor/es, y métodos 

} 
```



Se pueden añadir modificadores como public o private a la definición de clase, lo cual determinará si otras clases pueden acceder a esta clase. De todas formas, el modificador private, sólo estará permitido para la definición de clases anidadas, que veremos más adelante.

Por convención, las clases deben utilizar una nomenclatura PascalCase, es decir, deben comenzar con mayúscula, y cada nueva palabra que forme el nombre de la clase también.

### Declaración de variables miembro

Podemos encontrarnos con diferentes tipos de variables en una clase:

- Variables miembros en una clase, llamados campos o atributos

- Variables en un método o bloque de código, llamado variables locales.
- Variables en la declaración de un método, llamadas parámetros.

La declaración de los campos está compuesta generalmente por tres partes y normalmente en el siguiente orden:

- Cero o más modificadores, como public o private
- El tipo del campo
- El nombre del campo

### Modificadores de acceso

El primero de los modificadores usados, establece que otras clases tienen acceso a los diferentes campos. En el caso de Java podemos encontrar los siguientes modificadores:



| Modificador     | Descripción                                                  |
| --------------- | ------------------------------------------------------------ |
| private         | Se puede acceder solo desde la propia clase                  |
| public          | Se puede acceder desde cualquier clase                       |
| protected       | Se puede acceder desde la propia clase, sus subclases, así como desde cualquier clase definida en el mismo paquete. |
| sin modificador | Se puede acceder desde la propia clase, así como desde cualquier clase definida en el mismo paquete. |



Normalmente los atributos de una clase, estarán ocultos al exterior mediante el modificador private. Esto es así, porque como desarrolladores debemos tener el control del estado de los objetos, permitiendo su modificación solo por los métodos que nosotros consideremos. A la hora de desarrollar las clases, nosotros sabemos qué valores deben tener los atributos para un correcto funcionamiento de los objetos. Por este motivo debemos controlar, que estos, tomen valores de forma correcta. Esto solo lo podemos asegurar permitiendo su modificación únicamente por los medios que nosotros consideremos probados.

### Definición de métodos

La definición de los métodos de las clases varía entre los diferentes lenguajes de programación, pero la gran mayoría de ellos incluye como mínimo un nombre, una pareja de paréntesis donde se suelen incluir las declaraciones de parámetros, la declaración de un tipo devuelto en caso necesario, así como unos delimitadores del cuerpo del método, que generalmente suelen ser llaves.

Para el caso específico de Java, podemos encontrar en el siguiente orden:

- Modificadores. Los mismos que los modificadores de acceso (public, private, protected, sin modificador), seguido o no por los modificadores static o abstract.
- El tipo devuelto. El tipo de dato devuelto por el método o void en caso de que no devuelva nada.
- Nombre. Nombre del método. Generalmente contendrá un verbo, aunque obviamente no es necesario.
- Lista de parámetros. Una lista de parámetros de entrada encerrada entre paréntesis y separados por comas, precedidos de su tipo. En el caso de que no se necesiten parámetros, se debe utilizar los paréntesis vacíos.
- Lista de excepciones. Se pueden definir una lista de excepciones para manejar los posibles errores que pueda producir dicho método.

- Cuerpo del método. El cuerpo del método encerrado entre llaves. Tanto el código del método, así como la declaración de variables, irá aquí dentro.

### Nombre de los métodos

Aunque el nombre de un método puede ser cualquier identificador legal, las convenciones de código restringen los nombres de los métodos. Por convención, los nombres de los métodos deben comenzar con un verbo en minúscula o un nombre de varias palabras que comiencen con un verbo en minúsculas, seguido de adjetivos, sustantivos, etc. En aquellos nombres que se formen con varias palabras se debe utilizar la terminología camel, la primera letra de cada una de las palabras (excepto la primera) deben estar en mayúsculas. Por ejemplo:

```java
public Set<Coordinate> getNextMovements(){ 

… 

} 
```

### Numero arbitrario de parámetros

Hay ocasiones que no sabemos cuántos parámetros de un mismo tipo puede recibir un método. Para ello se puede utilizar el paso de parámetros variables, que consiste en añadir tres puntos entre el tipo de parámetro y el nombre de este en su declaración en la cabecera del método:



```java
public float getPerimeterFrom(Point... corners) throws Exception { 

    if(corners.length<3) 
        throw new Exception("A polygon must have at least 3 sides."); 

    float perimeter = 0; 
    Point from,to; 

    for(int i=0;i<corners.length-1;i++) { 
        from = corners[i]; 
        to = corners[i+1]; 
        perimeter+= (Math.*sqrt*(Math.*pow*(to.getX()-from.getX(), 2)+ Math.*pow*(to.getY()-from.getY(), 2))); 
    } 
    from = corners[corners.length-1]; 
    to = corners[0]; 
    perimeter+= (Math.*sqrt*(Math.*pow*(to.getX()-from.getX(), 2)+ Math.*pow*(to.getY()-from.getY(), 2))); 
    return perimeter; 
} 
```



Observa como el método anterior, nos devuelve el perímetro de un polígono definido por sus puntos. Nosotros no sabemos por cuantos puntos estará formado el polígono, por lo que se ha optado por un paso de parámetros variable. Es cierto, que se podría haber pasado un vector con cada uno de los vértices del polígono, y de hecho en la resolución del método, los parámetros variables se manejan como si fueran un array.

### Sobrecarga de los métodos

En los lenguajes de programación se suele admitir métodos de sobrecarga, por ejemplo, Java puede distinguir entre métodos con diferentes firmas de métodos. Esto significa que los métodos dentro de una clase pueden tener el mismo nombre si tienen diferentes listas de parámetros. Los métodos sobrecargados se diferencian por el número y el tipo de los argumentos pasados al método.  

Por lo tanto, no se puede declarar más de un método con el mismo nombre y el mismo número y tipo de argumentos, porque el compilador no puede diferenciarlos, aunque dichos métodos devuelvan tipos distintos.

### Getters y Setters

Como hemos visto, cuando definimos los atributos de una clase, estos normalmente se deberán definir como privados. Esto permitirá tener el control del estado de los objetos e impedir que puedan ser modificados desde el exterior sin control.

De todos modos, habrá veces, que deseemos dar acceso a estos atributos, bien para poder consultar sus valores o modificarlos. Para poder realizar esto, debemos mediante funciones, añadir esta funcionalidad. Para ello disponemos de los llamados getters y setters, también conocimos como accesores y mutadores.

Los getters no son ni más ni menos, que unas funciones que permiten acceder a los atributos, mientras que los setters nos van a permitir modificar su valor:



```java
public class Point { 


    private float x; 
    private float y; 

    public float getX() { 
        return x; 
    } 

    public void setX(float x) { 
        this.x = x; 
    } 

    public float getY() { 
        return y; 
    } 

    public void setY(float y) { 
        this.y = y; 
    } 
} 
```





Resulta obvio que, si queremos poder consultar o modificar los atributos desde otras clases, estos métodos no sean private, dejando el resto de posibilidades válidas dependiendo de nuestra intención.

### Constructor

Una clase contiene constructores que se invocan para crear objetos de esa clase, utilizando normalmente la palabra reservada new. Las declaraciones de constructores se parecen a las declaraciones de métodos, excepto que como nombre se debe usar el nombre de la clase y no tienen ningún tipo de retorno, ni siquiera void. También pueden permitir, al igual que los métodos, la sobrecarga. Por ejemplo:



```java
public class Board { 

    private int size; 

    public Board() { 

        this.size = 8; 

    } 

    public Board(int size) { 

        this.size = size; 

    } 

} 
```

Para crear un objeto Board llamado myBoard, utilizaremos la palabra reservada new que llamará al constructor:

```java
Board myBoard = new Board(); 
```

Donde “Board myBoard” es la declaración de la variable y “new Board();” reserva espacio en la memoria para almacenar el objeto y se inicializan sus campos según el constructor invocado.

###  Paso de mensajes

Para comunicarse con los objetos, debemos utilizar sus métodos. Para poder llamarlos, debemos de utilizar el identificador del objeto seguido de un punto y el nombre del método. Dependiendo del método, puede ser o no obligatorio adjuntar una serie de parámetros encerrados entre paréntesis, y en el orden en que han sido especificados.

Tanto las variables usadas en la definición de un método como los valores utilizados en la llamada se denominan parámetros (los primeros formales y los segundos reales). Hay de tres tipos:

- De entrada: Son aquellos que se utilizan para aportar datos al método. Si dentro del método se actualiza el valor del parámetro formal, el parámetro real no se verá afectado.
- De salida: Son aquellos que se utilizan para exportar datos desde el método. No aportan un valor inicial, el procedimiento les asignará valores.
- De Entrada/Salida: Aportan datos al método, y si son modificados dentro de éste, se modificarán los parámetros reales, por lo que también pueden exportar datos.

Estos parámetros, dependiendo del lenguaje de programación, pueden ser pasados de dos formas:

- por valor, en la que, si los parámetros formales se modifican dentro de la función, no se actualiza el valor de los reales
- por referencia en la que, si los parámetros formales se modifican, sí se actualiza el valor de los reales.

Como curiosidad Java solo permite el paso de parámetros por valor mientras que en otros lenguajes como C++ podemos elegir si pasar los parámetros por valor o por referencia.

Como hemos comentado, en JAVA, siempre se pasan los parámetros por valor. Lo que hay que tener claro, es que cuando se pasan tipos de datos básicos, se pasa una copia del valor de dicho tipo de dato básico, mientras que si lo que se pasa es un vector u objeto, lo que se pasa por parámetro es una copia de la referencia a dicho objeto. Es por este motivo, por el que, dentro de un método podemos modificar vectores y objetos, y que estos cambios sean visibles fuera del método, y no así con datos de tipos básicos. 