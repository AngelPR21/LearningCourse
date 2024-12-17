# Un caso práctico. Añadiendo métodos

Ahora que ya hemos visto que es herencia, vamos a ver un repaso a las visibilidades de atributos y métodos para poder ponerlos en practica. Hasta ahora, básicamente solo hemos utilizado las visibilidades private y public, que permitían el acceso a los atributos o métodos unicamente desde la propia clase o desde cualquier otro sitio respectivamente, aunque existen mas modificadores de visibilidad que determinan desde donde se puede acceder, como podemos ver en la siguiente tabla:

| Modificador       | Class | Package | Subclass | World |
| ----------------- | ----- | ------- | -------- | ----- |
| public            | Si    | Si      | Si       | Si    |
| protected         | Si    | Si      | Si       | No    |
| *sin modificador* | Si    | Si      | No       | No    |
| private           | Si    | No      | No       | No    |

Observa como ahora tenemos dos visibilidades mas que son la protected y aquella en la que no especificamos la visibilidad (se omite la visibilidad). 

En el primer caso, aquellos atributos y métodos que tengan la visibilidad protected, podrán ser accedidos tanto desde la propia clase y desde las clases que estén en el mismo paquete, pero ademas podrán ser accedidos desde cualquier clase en cualquier paquete, siempre que herede de esta. Esto permite a las clases hijas, poder acceder a los atributos y métodos de las clases padre definidos como protected.

Por otro lado, el no especificar ninguna visibilidad, unicamente da permiso de acceso desde la propia clase y aquellas clases que estén incluidas en el mismo paquete, evitando el acceso a cualquier clase fuera.

En la siguiente tarea, vamos a crear un método, que nos va a ayudar a la hora de ver cuales son las coordenadas a las que se puede mover una pieza. Si exceptuamos el peón, cuando tengamos que comprobar una coordenada a la cual queremos ver si nos podemos mover, esta coordenada deberá cumplir unas condiciones para poder ir a esa posición:

- Parece obvio, pero tenemos que comprobar que esa posición debe estar en el tablero.
- Si la celda esta vacía, significa que podemos movernos a esa coordenada.
- Si la celda contiene una pieza, deberemos comprobar el color de la pieza:
  - Si la pieza es de nuestro color, no podremos movernos a esa posición.
  - Si la pieza es no es de nuestro color, podremos movernos a esa posición matando la pieza que ocupa esa celda.

Observa que estas condiciones, no son validas para todas las piezas, pero si para la gran mayoría. Esto nos lleva a tomar una decisión, sobre donde codificar este código y como. Básicamente tenemos 2 opciones:

1. Codificamos el método en todas y cada una de las clases de piezas que la vayan a utilizar.
2. Codificamos el método en la clase padre y que la utilicen las clases hijas.

La primera opción, nos va a llevar a tener código redundante, que es mas difícil de mantener y mas propenso a cometer errores.

La segunda opción corrige los problemas de la primera, pero dota al peón de un método que no hace lo que debería. A primera vista, la mejor opción parece la segunda, si no fuera por el problema que se comenta, pero vamos a ver si tenemos podemos evitar el problema.

Una forma de evitar el problema, seria sobrescribiendo el método en Pawn de tal forma que esto ocultaría el método de la clase padre, de la misma manera que sobrescribimos el método toString() para darle un comportamiento diferente al que heredamos por defecto.

![](../../../images/task.png)

Realiza las siguientes modificaciones en Piece:

- Añade el método canAddToNextMovements(Coordinate coordinate)
- El método debe tener la visibilidad correcta para que solamente pueda ser accesible desde las clases hijas y no desde el exterior, ya que sera un método auxiliar que utilizaremos mas adelante para obtener los siguientes movimientos de una pieza
- El método debe realizar lo siguiente:
  - Comprobar que esa coordenada esta en el tablero. En caso contrario devuelve fase.
  - Si la celda correspondiente a esa coordenada esta vacía, devolvemos true.
  - Si la celda correspondiente a esa coordenada contiene una pieza, deberemos comprobar el color de la pieza:
    - Si la pieza es de nuestro color, devolvemos false.
    - Si la pieza es no es de nuestro color, devolvemos true.