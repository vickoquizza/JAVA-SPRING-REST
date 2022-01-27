## ¿Que es un patron de diseño?
Un patron de diseño es una forma comun de solucionar problemas relacionados con el diseño de una parte de software,  son como planos para construir una casa que uno pude modificar dependiendo del problema que se le presente personalemente. Al contrario que los algoritmos estos no siempre son implementados de la misma forma, sin embargo la idea de los patrones es legible y se puede conocer a partir de leer software en donde este implementado uno.

En Software. los patrones han existido casi siempre sin embargo, gracias al libro Design Patterns: Elements of Reusable Object-Oriented Software por Erich Gamma, John Vlissides, Ralph Johnson, and Richard Helm, se clasificaron en distintos tipos de patrones y se les dio un nombre para una identificación comun, este libro y sus patrones son conocidos como GoF patterns o GoF book.

## ¿Porque usar patrones de diseño?

Los patrones de diseño son un conjunto de soluciones a problemas comunes a la hora de de diseñar software, sobre todo conocerlos ayuda mucho a solucionar problemas de herencia, composicion, abstración, polimorfismo entre otros conceptos que se pueden presentar a la hora de implementar la programación orientada a objetos.

Tambien los patrones de diseño se pueden usar como un lenguaje comun entre desarolladores a la hora de debatir, recomendar o comunicar situaciones relacionadas al diseño de software.

## Tipos de patrones de dieño

#### Creacional Patterns
Son mecanismos que sirven para tener flexibilidad y reusabilidad a la hora de crear nuevos objetos en el proyecto.

#### Structural Patterns
Explican como ensamblar las clases y los objetos en estructuras mas flexibles y eficientes.

#### Behavioral Patterns
Se encargan de hacer efectiva la comunicación e interacción entre los diferentes objetos y clases de un proyecto.

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

### Strategy

- Se puede usar cuando se quieran usar diferentes varianes de un algoritmo sobre un objeto en especifico sobre el tiempo de ejecución.
- Se puede usar cuando se tiene un moton de clases que ejecutan su comportamiento de forma similar.
- Permite separar la logica del cliente de los algoritmos que para el cliente no son importantes o escenciales en su funcionamiento.
- Cuando se tiene un switch obsesivo con multiples variantes de un mismo algoritmo a aplicar.

### Adapter

- Nos sirve para cuando se quiere usar una clase existente, pero los datos, variables o interface que usa no es compatible con el resto del codigo.
- Cuando se quieren usar varias subclases pero la funcionalidad de estas difiere de algunos atributos de la clase pariente.

### Observer

- Se usa cuando los cambios de un objeto depende de los cambios de otro, y el primero necesita saber acerca del cambio de primera mano.
- Sobre todo cuando se necesitan notificar cambias pero durante un tiempo limitado, por eso se permite la inscripción y subscripción de objetos.
