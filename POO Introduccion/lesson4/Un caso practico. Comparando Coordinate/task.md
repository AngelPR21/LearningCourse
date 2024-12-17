# Comparando coordenadas

Vamos a ver un caso practico para nuestro ajedrez. En nuestro juego, deberemos comprobar coordenadas entre si, por lo que deberemos determinar si dos coordenadas son iguales.

Como puedes observar, con la definición que tenemos hecha hasta ahora, no podemos comprobar dos coordenadas de forma correcta, ya que si por ejemplo realizamos lo siguiente, se mostrar false:

```
Coordinate c1 = new Coordinate('A',1);
Coordinate c2 = new Coordinate('A',1);

System.out.println(c1.equals(c2));
```

![](../../../images/task.png)

Realiza los cambios necesarios para que se puedan comprobar coordenadas de una manera correcta.

