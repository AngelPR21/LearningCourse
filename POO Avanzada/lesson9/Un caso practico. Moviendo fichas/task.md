# Un caso práctico. Moviendo piezas

Ahora que hemos visto la herencia y las clases abstractas, vamos a ver como podemos implementar la funcionalidad de mover piezas por el tablero.

Si analizamos la acción de mover una pieza, podemos en un primer momento pensar que todas las piezas se mueven igual, es decir, cualquier pieza que se quiera mover realizara lo siguiente:

- La pieza que se quiere mover, deja su posición. Esto implica que el atributo piece de la celda donde se encontraba la pieza, deberá ponerse como null.
- Si en la celda de destino hay una pieza, esta deberá ser eliminada.
- La pieza pasa a ocupar su nueva posición. Esto implica que el atributo piece de la nueva celda de destino deberá contener la pieza, así como el atributo cell de la pieza deberá contener la celda de destino.

Observa, como en ningún momento, hemos hablado hasta ahora de si la coordenada de la celda de destino esta dentro del conjunto de los siguientes movimientos (getNextMovements()). Esto realmente lo controlara el juego. Nosotros físicamente, en el mundo real, podemos mover un caballo que se encuentre en (A,1) dejarlo en (H,8), otra cosa es que las reglas del juego lo permitan. Para poder controlar esto, podemos crearnos un método, que nos indique si una pieza puede moverse o no a una coordenada.

Visto esto, podemos pensar que si todas las piezas se mueven igual, este comportamiento debería estar en la clase padre Piece, en lugar de en todas las clases hijas. Pero, existe un problema: el peón tiene un comportamiento distinto, ya que si se mueve a la última posición se transforma en una reina.

Bueno, el problema no es tal, ya que podemos colocar las acciones de movimiento dentro de la clase Piece, y en el caso exclusivo de Pawn, sobrescribir este método para ajustarlo a su naturaleza.

![](../../../images/task.png)

Modifica la clase Piece añadiendo los siguientes métodos:

- canMoveTo(Coordinate coordinate) : Este método comprobará si la pieza puede moverse a esa coordenada. Para ello deberá comprobar si la coordenada esta incluida en el Set<Coordiante> que devuelve getNextMovements();
- remove(): Este método, establecerá a null tanto el atributo piece de la celda que ocupa (asegúrate que ocupa alguna celda para evitar un NullPointerException) y el atributo cell de la propia pieza:
- moveTo(Coordinate coordinate): Este método llamará en primer lugar al método canMoveTo(Coordinate) para comprobar si nos podemos desplazar a esa coordenada:
  - En caso negativo se devuelve false sin realizar ninguna tarea mas.
  - En caso afirmativo:
    - comprobamos si hay alguna pieza en la celda de destino, llamando al método remove() de esta si la hubiese.
    - Se establecerá el atributo cell a la nueva celda de destino y llamaremos al método place() devolviendo true.

Una vez realizadas las tareas anteriores, realiza lo siguiente sobre la clase Pawn.

- Sobrescribe el método moveTo(Coordinate coordínate) y realiza lo siguiente:

  - La primera instrucción del método sera llamar al método moveTo de la clase padre y comprobar si se ha realizado el movimiento. Piensa que en la mayoría de los casos es eso lo que se debe realizar. El peón solo cambiará a reina cuando alcance el fondo del tablero.

    <div class="hint">
        Recuerda que para hacer esto deberas utilizar la palabra reservada super.
    </div>

  - Si no se ha producido movimiento, podemos devolver false sin realizar ningún cambio mas.

  - Si se ha producido el movimiento del peón, comprueba si el peón ha llegado al fondo del tablero. En caso afirmativo deberás realizar lo siguiente:
  
    - Guarda la referencia de la celda que ocupa el peón.
    - Elimina el peón del tablero
    - Crea una reina del mismo color que el del peón y en la celda que ocupaba el peón.
    - Devuelve true al haberse realizado el movimiento.
