# Un ejemplo práctico. El juego

Llegados hasta aquí, ya podemos realizar una pequeña aproximación de nuestro juego de ajedrez. Obviamente, quedan todavía funcionalidades pendientes como el enroque o el jaque mate, asi como eliminar de los siguientes movimientos aquellos que puedan poner en jaque al propio rey, entre otros. Pero esto se deja para que el alumno investigue e intente aportar soluciones con lo visto hasta ahora.

Con lo que tenemos, podemos completar una aproximación de lo que sera nuestro ajedrez, y que podremos ir mejorando en un futuro. Para ello podemos en un proyecto de IntelliJ copiar las clases que tenemos y desarrollar nuestro juego. Se recomienda por ejemplo realizar lo siguiente:

- Crea una clase Screen que se encargue de visualizar los distintos elementos del juego. Por ejemplo puede tener las siguientes funcionalidades:

  - Que muestre el tablero en dos perspectivas. Por ejemplo con las fichas blancas o negras abajo dependiendo del jugador que vaya a mover.

  - Que muestre un panel con las fichas eliminadas (IDeletedPieceManager) como se muestra a continuación:

    ![](../../../images/img_9.png)

- Crea una clase Game que pregunte el nombre de los jugadores antes de empezar a jugar. Para ello deberás:

  - Crear un tablero y colocar las piezas. Esto ultimo podría ser una nueva funcionalidad de tablero. P.e:  board.placePieces()
  - El juego empezara moviendo las blancas, y solo cambiará cuando el jugador haya movido pieza. Para ello se debera:
    - Solicitar al jugador que pieza debe mover
    - Comprobar que el jugador ha seleccionado una ficha de su color y que esta se pueda mover.
    - Una vez seleccionada una pieza correcta. Se deberá resaltar en el tablero ( board.highLight(Collection<Coordinate> coordinates) ) las diferentes posiciones donde puede dejar la pieza, y solicitar al usuario donde desea mover la pieza.
    - Si se ha podido realizar el movimiento, habrá que eliminar el resalto de celdas y comprobar si hay jaque. Se debería de mostrar de alguna manera que el rey esta en jaque.
    - Volver al primer punto.
  - Como no se ha implementado la funcionalidad de jaque mate, una forma de acabar la partida es la de matar al rey contrario.

- Crear una clase Input para la gestión de entradas por parte del usuario.



## Funcionalidades adicionales de investigación

Como ya se ha visto hay muchas funcionalidades que se pueden implementar. Algunas de ellas tienen una implementación mucho mas sencilla que otras. A continuación se hace un listado de las posibles mejoras que se pueden realizar fruto de los diferentes años en los que se ha impartido el ciclo formativo, pero por razones obvias de tiempo no se pueden ver:

- Jaque mate.
- Enroque largo y corto.
- Cargar y guardar partidas en disco.
- Deshacer y avanzar movimientos realizados.
- Implementar un reloj para el control de tiempo.
- Cambio de colores del juego.
- Juego en red mediante sockets TCP
- Creación de un servidor multihilo para partidas en red.