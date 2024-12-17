# Creando nuestra estructura dinámica

Viendo como hemos creado una estructura dinámica que puede crecer y decrecer en tiempo de ejecución, realiza las siguientes tareas para completar nuestra lista.

![](../../../images/task.png)

Añade las siguientes funcionalidades a nuestra clase MyList:

- void addAll(MyList lista): Añade todos los elementos de la lista.

- void clear(): Vacía la lista.

- boolean contains(Object o): Devuelve true si el objeto o esta en nuestra lista.

  <div class="hint">
      Para comprobar si funciona correctamente esta funcion con objetos de cualquier tipo, recuerda que deberas sobrescribir el metodo equals(Object o) de la clase Object en la clase de objetos que almacenes.
  </div>
  
  
- T get(int index): Obtiene el elemento que esta en la posición index sin eliminarlo. 

  <div class="hint">
      Deberias lanzar una excepcion del tipo IndexOutOfBoundsException si se da la siguiente condicion: index < 0 || index >= size 
  </div>

- int indexOf(Object o): Devuelve el índice donde se encuentra el objeto o. Si el objeto no se encuentra, devuelve -1.

  <div class="hint">
      Para comprobar si funciona correctamente esta funcion con objetos de cualquier tipo, recuerda que deberas sobrescribir el metodo equals(Object o) de la clase Object en la clase de objetos que almacenes.
  </div>

- boolean isEmpty(): Devuelve true solo si la lista esta vacía.

- int size(): Devuelve el tamaño de la lista:

- Object[] toArray(): Devuelve todos los elementos de la lista en un array.

- MyList subList(int  fromIndex, int toIndex): Devuelve una lista con los elementos que hay desde fromIndex (incluido) hasta toIndex (excluido).

  <div class="hint">
      Deberias lanzar una excepcion del tipo IndexOutOfBoundsException si se da la siguiente condicion: fromIndex < 0 || toIndex > size || fromIndex > toIndex
  </div>
