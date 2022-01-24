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





