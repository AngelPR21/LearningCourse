### Map 

La interfaz Map permite almacenar pares de clave y valor ( Map<K,V> ) , donde la clave debe ser única. Mediante la clave podemos acceder al valor asociado a esta. Sería similar a lo que en algunos otros lenguajes llaman diccionario. 

La interfaz Map proporciona metodos para trabajar tanto con los pares clave (K) y valor (V) como con el conjuto de todas las claves ( [**keySet**](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#keySet--)()) o el conjunto de todos los valores ([**values**](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html" /l "values--)()). 

#### HashMap 

HashMap es una clase que implementa entre otras interfaces la interfaz Map. Esta clase, al igual que la clase HashSet, se apoya en una tabla hash para almacenar las diferentes claves de la colección. Esto tiene como consecuencia que no se pueda garantizar un orden a la hora de recorrer la colección. Por otro lado, para poder obtener un correcto funcionamiento, se deberá asegurar que el método hashCode debe devolver el mismo valor para dos objetos iguales, y el método equals se deberá también sobrescribir de tal modo que, para dos objetos que nosotros consideremos iguales devuelva true. 

Veamos un ejemplo, donde vamos a crear un Map, donde la clave será un numero entero y el valor un String: 

 

 

```java
Map<Integer,String> myMap = new HashMap<>(); 
myMap.put(2,"dos"); 
myMap.put(1,"uno"); 
myMap.put(3,"tres"); 
myMap.put(33,"treinta y tres"); 
System.out.println(myMap); 
System.out.println(myMap.get(2)); 
System.out.println(myMap.keySet()); 
System.out.println(myMap.values()); 

Map<Integer,String> myMap = new HashMap<>();  

myMap.put(1,"uno"); 
myMap.put(2,"dos");  
myMap.put(3,"tres");  
myMap.put(33,"treinta y tres");  

System.out.println(myMap); 

System.out.println(myMap.get(2));  

System.out.println(myMap.keySet());  

System.out.println(myMap.values()); 
```

 

Este pequeño fragmento de código mostrará: 



```
{1=uno, 33=treinta y tres, 2=dos, 3=tres} 
dos 
[1, 33, 2, 3] 
[uno, treinta y tres, dos, tres] 
```

 

#### LinkedHashMap 

Del mismo modo que ocurría con HashSet y LinkedHashSet, la interfaz LinkedHashMap se basa en la clase HashMap para almacenar los objetos, y añade una lista enlazada para poder registrar el orden en el que fueron añadidos. De esta forma, ahora sí que podemos garantizar el orden en el que fueron añadidos los elementos a la colección. 

Veamos un ejemplo: 

 

```java
Map<Integer,String> myMap = new LinkedHashMap<>(); 

myMap.put(2,"dos");  
myMap.put(1,"uno");  
myMap.put(3,"tres");  
myMap.put(33,"treinta y tres");  

System.out.println(myMap);  
System.out.println(myMap.get(2));  
System.out.println(myMap.keySet()); 
System.out.println(myMap.values());  
```

Como podemos observar, ahora los objetos son mostrados en el mismo orden en el que fueron añadidos:  

```
[0, 2, 3, 5] 
{2=dos, 1=uno, 3=tres, 33=treinta y tres} 
dos 
[2, 1, 3, 33] 
[dos, uno, tres, treinta y tres]  
```

#### TreeMap 

Como ya se comentó en TreeSet, TreeMap utiliza un arbol binario de busqueda equilibrado para almacenar las claves (K) de la colección. De este modo, se aumenta el rendimiento a la hora de búsquedas en dicha colección. Del mismo modo que en TreeSet, las claves son ordenadas por defecto según su orden natural, aunque se puede crear un objeto TreeMap que ordene las claves según otro criterio utilizando la interfaz Comparator. 

Veamos un ejemplo: 

```java
Map<Integer,String> myMap = new TreeMap<>(); 
myMap.put(2,"dos"); 
myMap.put(1,"uno"); 
myMap.put(3,"tres"); 
myMap.put(33,"treinta y tres"); 
System.out.println(myMap); 
System.out.println(myMap.get(2)); 
System.out.println(myMap.keySet()); 
System.out.println(myMap.values()); 
```

Este código mostraría el siguiente resultado: 

```
{1=uno, 2=dos, 3=tres, 33=treinta y tres} 
dos 
[1, 2, 3, 33] 
[uno, dos, tres, treinta y tres]  
```

Ahora se puede observar como el orden en el que se muestran los diferentes valores ya no es el orden en el que fueron añadidos, sino su orden natural según las claves. 