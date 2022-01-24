## ¿ Para que usar algunos de los Design Patterns?

### Singleton

- Cuando solo se necesite usar una sola instancia de una clase y sea peligroso hacerlo otra vez, como una clase que acceda a una base de datos o a un determinado archivo que necesita de una sesion especifica.
- Cuando se necesite un control estricto sobre las variables globales de un proyecto o una clase.

### Factory Method

- Se usa cuando, no se sabe las dependencias ni los tipos que pueden llegar a manejar cada uno de los objetos del proyecto.
- Se puede usar cuando en una libreria o framework propios uno quiere ofrecer extención a los usuarios de los objetos internos, ejemplo,  lo que hace java utils, con Excpecion.
- Cuando se quieren guardar recursos del sistema reusando objetos ya existentes(las interfaces), en vez de construirlos una y otra vez.




