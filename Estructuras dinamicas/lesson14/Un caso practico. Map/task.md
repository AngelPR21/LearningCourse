# Un caso práctico. Map

Para poder poner en practica lo visto con la interfaz Map, vamos a realizar algunos cambios en nuestro ajedrez. Como puedes observar, en nuestro tablero, tenemos un conjunto de celdas, y estas, estan asociadas a una coordenada. Es decir, que para poder acceder a una celda en concreto, deberemos hacerlo a través de una coordenada. Esta estructura encaja perfectamente con la definición de Map, donde a través de una Key (Coordenada) accedemos a un Value (Cell), lo que nos permitirá acceder de una manera sencilla a cada una de las celdas.

Ahora deberemos elegir que estructura de las tres vistas es la que mas se ajusta a nuestro propósito, por lo que vamos a analizar cada una de las tres vistas:

- HashSet: Es la mas eficiente, pero recuerda que no podremos obtener las celdas en el orden en el que fueron creadas. Otro "problema" que tendremos en elegir esta clase, es que al utilizar una tabla Hash para el almacenamiento de las Key, deberemos asegurarnos que dos coordenadas iguales devuelvan el mismo hash code, por lo que deberemos sobrescribir el método hashCode() en la clase que hará de key (Coordinate)
- LinkedHashSet: No es tan eficiente como la clase HashSet, y tendremos los mismos inconvenientes exceptuando el que si que podremos obtener las celdas en el mismo orden en el que fueron creadas. Habría que analizar si esta funcionalidad es necesaria o no.
- TreeSet: Esta es la clase menos eficiente de todas a la hora de crearse, ya que debe mantener el conjunto de key ordenadas para un rápido acceso a cada una de las key. Al no utilizar una tabla Hash para almacenar las key, no sera necesario sobrescribir el método hashCode(), pero por contra, si que sera necesario implementar la interfaz Comparable en Coordinate para poder establecer el orden entre las diferentes coordenadas.

Ademas de lo descrito anteriormente, la clase Coordinate deberá sobrescribir el método equals(Object o), ya que para no permitir duplicados en la key, se debe tener claro que entendemos por dos coordenadas iguales.

![](../../../images/task.png)

Realiza las siguientes modificaciones:

- Cambia el atributo de cells en Board, para que ahora sea un Map<Coordinate,Cell>
- Modifica el constructor de Board para que utilice una de las 3 clases vistas para almacenar todas las celdas.
- Modifica los métodos contains(Coordinate c), getCellAt(Coordinate c), toString() para que funcione correctamente con los cambios realizados.
- Observa que hay implementado el metodo highLight() en Cell para resaltar en color una celda. Crea el método highLight(Collection<Coordinate> coordinates) en Board para que el tablero resalte cada una de las celdas de las coordenadas pasadas por parámetro.
- Del mismo modo, observa que se ha creado el metodo removeHighLight en Cell para devolver una celda a su color original. Crea otro método llamado removeHighLight() en Board para eliminar cualquier resaltado de celda que hubiese.