Enum

Como hemos visto anteriormente, podemos realizar una aproximacion a la definicion de pieza de la siguiente manera:

```java
public class Piece { 
    private char shape; 
    private String color; 
} 
```

Como podemos observar de esta forma podemos definir cómo sería una pieza, pero está claro que esta definición no se ajusta correctamente a lo que queremos por varios motivos: 

- En la forma, podemos incluir los caracteres del ajedrez como ♜ o ♘, pero también cualquier otro carácter Unicode 
- En color, podemos poner cualquier nombre de color como blanco o negro, pero también cualquier otro String, que nada tiene que ver con nuestro fin. 

Por estos motivos, deberemos restringir los diferentes valores que pueden tener nuestras piezas. Para ello tenemos los enumerados (enum) 



En Java, los enum no son más que clases un poco especiales, donde se limita la creación de objetos a los especificados explícitamente en la clase. Como curiosidad, si un enum tiene un constructor, este debe ser privado, para no poder crear objetos de tipos distintos a los declarados en el enum. Veamos un ejemplo, que aunque mas adelante modificaremos ya que no tiene mucho sentido, nos puede servir a modo de ejemplo: 

 

```java
    public enum Color {
        
        WHITE("Blanco"), BLACK("Negro");
        
        private String color;
        
        Color(String text){
            this.color=text;
        }
        public String getColor(){
            return color;
        }
    }
```

 

De este modo, el tipo Color, solo puede tomar dos valores: WHITE o BLACK, donde ademas, cada enum contien un String, que para WHITE es "Blanco", y para BLACK es "Negro". Observa tambien, como el constructor no tiene la palabra private (seria redundante) ya que solo se pueden crear los dos objetos antes mencionados. Por otro lado, tambien se dispone del getter para poder obtener su String asociado.

Con este cambio nuestra clase quedaría de la siguiente manera: 

```java
public class Piece {
    //...
    private char shape; 
    private Color color; 
    //...
} 
```

 

Ahora ya hemos limitado que cualquier pieza solo pueda ser blanca o negra, pero todavía tenemos un problema, y es la forma. Además, si nos fijamos bien, en el caso que en la forma tengamos un carácter de ajedrez (♜), este puede que no corresponda con el color (WHITE). Para solucionar esto debemos de crear un enum donde se establezca la forma y el color de tal manera que no se pueda dar esa anomalía. 

Por ejemplo, nuestra clase Piece podria disponer, ademas del enum Color, de un enum Type donde dispongamos de las diferentes piezas con su forma y color definidos: 



![](../../../images/task.png)

Completa el enum Type definido en la propia clase Piece para que disponga:

- Definicion para: WHITE_KING, WHITE_QUEEN, WHITE_ROOK, WHITE_BISHOP, WHITE_KNIGHT, WHITE_PAWN, BLACK_KING, BLACK_QUEEN, BLACK_ROOK, BLACK_BISHOP, BLACK_KNIGHT, BLACK_PAWN.
- El enum Type tendra dos atributos llamados shape y color, donde el primero sera un String y el segundo sera del tipo Color.
- El enum Type tambien dispondra de los getters para poder acceder a esos valores.