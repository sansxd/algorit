# Algoritmo de ordenamiento
# Bubble Sort 

### Funcionamiento Del algoritmo Bubble Sort
Revisa cada elemento de la lista que va a ser ordenada con el siguiente, intercambiándolos de posición si están en el orden equivocado
es un sencillo algoritmo de ordenamiento. Funciona revisando cada elemento de la lista que va a ser ordenada con el siguiente, intercambiándolos de posición si están en el orden equivocado. Es necesario revisar varias veces toda la lista hasta que no se necesiten más intercambios

**Este algoritmo obtiene su nombre de la forma con la que suben por la lista los elementos durante los intercambios, como si fueran pequeñas "burbujas". También es conocido como el método del intercambio directo
Dada su simplicidad, el ordenamiento de burbuja es utilizado para introducir el concepto de algoritmo de ordenamiento para estudiantes de ciencias de la computación. A pesar de esto, algunos investigadores como Owen Astrachan han criticado su popularidad en la enseñanza de ciencias de la computación, llegando a recomendar su eliminación de los planes de estudio. Sumado a esto, Jargon File, un libro ampliamente citado en la cultura hacker, lo denomina "el mal algoritmo genérico"**

### Análisis Asintótico 	
El ordenamiento de burbuja tiene una complejidad Ω(n²). Cuando una lista ya está ordenada, el método de ordenación por burbuja está forzado a pasar por toda la lista y hacer comparaciones, lo que hace que su complejidad sea cuadrática en el mejor de los casos, esto lo cataloga como el algoritmo más ineficiente que existe, aunque funciona bien cuando son pocos elementos.

**En mi caso utilice este algoritmo en lenguaje C#, en el cual se realizaron 4 Test unitarios con N elementos definidos, para saber el tiempo de demora con respecto a N elementos.**

#### Ventajas:

* Fácil implementación.
* No requiere memoria adicional.

#### Desventajas:

* Muy lento.
* Realiza numerosas comparaciones.
* Realiza numerosos intercambios.

### Ejemplo en imagen

![imagenBubbleSrt](https://github.com/sansxd/algorit/blob/master/imagenes/imgbubblesort.png)


Los elementos ingresados fueron gracias a esta pagina [Random.org](https://www.random.org/integer-sets/).
tambien dejo esta pagina [Time Comparison of Quick Sort, Insertion Sort and Bubble Sort](https://vinayakgarg.wordpress.com/2011/10/25/time-comparison-of-quick-sort-insertion-sort-and-bubble-sort/)
