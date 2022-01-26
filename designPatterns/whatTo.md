## ¿ Para que usar algunos de los Design Patterns?

### Singleton

- Cuando solo se necesite usar una sola instancia de una clase y sea peligroso hacerlo otra vez, como una clase que acceda a una base de datos o a un determinado archivo que necesita de una sesion especifica.
- Cuando se necesite un control estricto sobre las variables globales de un proyecto o una clase.

### Factory Method

- Se usa cuando, no se sabe las dependencias ni los tipos que pueden llegar a manejar cada uno de los objetos del proyecto.
- Se puede usar cuando en una libreria o framework propios uno quiere ofrecer extención a los usuarios de los objetos internos, ejemplo,  lo que hace java utils, con Excpecion.
- Cuando se quieren guardar recursos del sistema reusando objetos ya existentes(las interfaces), en vez de construirlos una y otra vez.

### Abstract factory

- Abstract factory se puede utilizar cuando el codigo necesita usar de diferentes familias de objetos relacionados, pero no se quiere depender de clases concretas para evitar que las clases se liguen a una herencia.
- Abstract factory permite crear productos de cada una de las clases de una familia, todo esto sin preocuparse de posibles equivocaciones, debido a que todo esta envuelto en una composicion razonable.

### Builder

- El builder es muy util para evitar tener objetos que tengan sobreescritura excesiva de su constructor, haciendo que se tediosa cada instanciación diferente del objeto.
- Cuando se tienen procesos similares para la creación de diferentes representaciones de un mismo producto, por ejemplo un carro,  todos los carros comparten estados y comportamientos similares, pero dependiendo del tipo de carro estos cambian en algunos detalles.
- Sirve tambien para crear objetos complejos o Composite trees.

### Decorator

- Usar decorador puede ser excelente para cuando se quiere añadir elementos extra a un objeto sin necesidad de extenderlo.
- Es bueno usarlo cuando es raro o no es posible usar la herencia.

### Bridge 

- Se puede usar cuando uno quiere dividir una clase especifica con muchas variaciones y no quiere exteneder la herencia a multiples subclases para evitar los multiples problemas que puede traer la abstraccion.
- Se puede usar cuando uno quiere extender una clase en diferentes dimensiones o variaciones independientes.
- Se puede usar si se quieren cambiar implementaciones sobre una abstraccion durante el tiempo de ejecución de un programa.



