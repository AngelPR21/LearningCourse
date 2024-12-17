# Un caso real. Ajedrez 

Para poder comprobar lo visto, vamos a nuestro juego de ajedrez. Lo primero que tenemos que hacer es identificar aquellos objetos de nuestro juego que son esenciales para la creación del juego. Es evidente que para poder resolver nuestro juego necesitaremos, entre otros los siguientes objetos: 

- Las fichas de ajedrez 
- El tablero 

Estos objetos, son fácilmente identificables, ya que son objetos tangibles (los podemos tocar), pero en la programación orientada a objetos, podemos representar objetos abstractos. Por ejemplo, para poder representar los movimientos, así como para poder seleccionar una ficha, o establecer donde queremos moverla, nos puede resultar útil crear una clase para representar las diferentes coordenadas del tablero. Empezaremos por estas últimas 

## Coordenadas 

Para poder representar una posición en el tablero, vamos a necesitar un objeto que representara una fila y una columna del tablero. Para las columnas utilizaremos una letra que ira desde la A hasta la H, mientras que para las filas un número, que ira desde el 1 hasta el 8. 

 

![](../../../images/task.png)

Ahora ya podemos definir en un primer momento la clase Coordenada de la siguiente manera:

Completa la clase Coordenada con:
- Getters para poder acceder a los valores letter y number
- Metodo toString para poder visualizar una coordenada de la manera (A,3)