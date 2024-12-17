# IDeletedPieceManager

Ahora que ya hemos visto lo que es una interfaz, en nuestro juego vamos a intentar implementar la "caja de las piezas" donde iremos dejando cada una de las piezas que vayamos matando en el juego. Imagina, que esta parte no la vamos a desarrollar nosotros, o que queremos dejar la puerta abierta a que terceros pudiesen implementar dicha clase de una manera mas eficiente. Para que nuestro código no este acoplado y sea facilmente el intercambio de las clases que puedan implementar dicha "caja", vamos a establecer una interfaz. De este modo, cualquier clase que quiera implementar esta utilidad, únicamente se deberá de preocupar en implementar nuestra interfaz para que el juego funcione correctamente.



![](../../../images/task.png)

Completa la interfaz IDeletedPieceManager y añade los siguientes métodos:

- addPiece: Recibirá una pieza y la añadirá a nuestro gestor. El método no debe devolver nada. Este metodo seria el equivalente a añadir una pieza a la caja.
- removeLast: El metodo devolvera la ultima pieza añadida. El metodo no necesita parametros. Este metodo seria el equivalente a retirar de la caja la ultima pieza añadida.
- count: Este método recibira por parametro un tipo de pieza, y nos devolvera la cantidad de piezas de ese tipo que hay en la caja. Es decir, deberemos contar las piezas que contiene la caja de un determinado tipo.

Una vez creada la interfaz, haz que la clase DeletedPieceManagerImp implemente dicha interfaz. Para ello, como podrás suponer, deberás utilizar una estructura dinámica como la vista en la lección anterior.

<div class="hint">
    No es necesario implementar mas metodos en la clase MyList, pero si lo consideras, puedes implementar aquellas funcionalidades que creas convenientes.
</div>



