# Las piezas 

Vamos a comenzar con las fichas de ajedrez. Para comenzar deberemos ver qué características tienen dichas piezas. Entre ellas a simple vista podemos ver que cada una de ellas tiene una forma, un color, un tamaño, un peso, etc... 

De todas esas características, solo debemos tener en cuenta las necesarias para la representación de nuestro modelo. Para ello podemos ver que su forma, y color van a ser necesarios, mientras que su peso y tamaño, aun siendo características de las diferentes piezas, no aportan ninguna información relevante para nuestro juego. 

 

Visto esto podemos definir a groso modo nuestra clase Piece con dos atributos:

- Un atributo llamado shape de tipo char para almacenar la forma, por lo que podemos incluir los caracteres del ajedrez como ♜ o ♘.
- Para el color podemos utilizar un atributo llamado color de tipo String, donde poder asignarles "blanco" o "negro".

 

![](../../../images/task.png)

Completa la clase Piece con los atributos antes mencionados y crea un constructor parametrizado.