# Un caso práctico. Set

Para poner en practica la funcionalidad de la interfaz Set, vamos a reescribir el metodo getNextMovements() para que en lugar de devolver un array, devuelva un conjunto (Set) de Coordenadas, así podremos olvidarnos de esa clase Tool que nos ayudaba a simular que el array se incrementaba de tamaño al añadir una nueva coordenada. 

En realidad, si se obtuviesen correctamente las siguientes movimientos, no deberían haber repeticiones de coordenadas, pero así nos aseguramos de que una coordenada solamente este presente una vez en nuestro conjunto.

Recuerda que para que no se admitan duplicados de coordenadas, deberemos definir que son para nosotros dos coordenadas iguales. Para ello deberemos sobrescribir el método equals(Object o) en la clase Coordinate. En nuestro caso, definiremos que dos coordenadas son iguales si tienen la misma letra y el mismo número.

![](../../../images/task.png)

Realiza las siguientes acciones:

- Sobrescribe el método equals(Object o) para que funcione correctamente cualquier clase que implemente la interfaz Set.
- Modifica el método abstracto getNextMovements() en Piece para que ahora nos devuelva un Set<Coordinate> en lugar de un Coordinate[]
- Modifica todas los métodos getNextMovements() para que implementen correctamente el método abstracto.
- Elige correctamente la clase que de las tres vistas (HashSet, LinkedHashSet y TreeSet) que implementan Set para realizar esta función. Dependiendo que clase utilices, implicará realizar alguna modificacion adicional en la clase Coordinate.