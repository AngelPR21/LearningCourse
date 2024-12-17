# Un ejemplo practico. Streams

Para poder poner en practica lo visto con Streams, vamos a intentar añadir una funcionalidad extra al tablero y al rey, donde vamos a tener que trabajar con colecciones y Streams para dar respuesta a la funcionalidad de jaque.

Si pensamos un poco, cuando se da la condición de jaque, veremos que la posición del rey de un color dado, esta incluida en el conjunto de todos los movimientos posibles de las piezas del otro color.

![](../../../images/task.png)

Añade la funcionalidad jaque de la siguiente manera:

- Añade el metodo Set<Coordinate> getNextMovements(Piece.Color pieceColor), que devuelva el conjunto de todos los movimientos posibles para las piezas de un color dado. Para hacer esto, deberemos realizar lo siguiente:

  - A partir del Map<Coordinate,Cell> obtener todas las celdas, y a partir de esta obtener un Stream.

  - Filtrar el todas las celdas que contengan pieza

  - Realizar un Map para quedarnos con las piezas

  - Filtrar aquellas que cuyo color sea el del color solicitado.

  - Realizar un [flatMap](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#flatMap-java.util.function.Function-) para obtener un flujo a partir del Set<Coordiante> que nos devuelve cada pieza. De esta manera pasamos, a partir de este punto, de trabajar con un Stream de Piece, a trabajar con Stream de Coordinate.

    <div class="hint">
        .flatMap(piece -> piece.getNextMovements().stream())
    </div>

  - Recoger mediante collect todas las coordenadas para devolverlas.

- Añade el método check() en la clase King para determinar si esta en jaque o no. Para ello tendrá que comprobar si su posición está incluida en el conjunto de posiciones devueltas por el tablero para las piezas del otro color.

- Añade un método llamado getKing(Piece.Color pieceColor) que devuelva el rey de un determinado color. Para ello deberas:

  - A partir del Map<Coordinate,cells> obtener todas las celdas, y a partir de esta obtener un Stream.

  - Filtrar el todas las celdas que contengan pieza

  - Realizar un Map para quedarnos con las piezas

  - Filtra y quédate con aquellas que sea una instancia de King
  
  - Para evitar tener que hacer posteriormente castings, realiza un map para devolver la pieza como un rey.
    
    <div class="hint">
      .map(piece -> (King)piece)
    </div>
    
  - Filtrar aquellas cuyo color sea el del color solicitado.

  - Obtén la primera coincidencia y devuélvela.

    <div class="hint">
        Si utilizas una funcion terminal como findFirst(), esta devuelve un objeto Optional<King>. Este tipo de objeto indica que dentro de este, puede haber, o no, un objeto King. Para obtenerlo deberás comprobar primero si contiene una pieza invocando a su metodo isPresent(). Si este da como resultado true, ya podremos obtener la pieza con el metodo get();
    </div>

    



