# Topic 2 - Challenge

La solucion que se utilizo para este challenge fue: primero usando el principio de inversión de dependencias se desacoplaron los diferentes tipos de impresora de la seleccion
que el usuario quiere utilizar; esto permite que con una interfaz se represente el comportamiento basico que van a tener todas las distintas iteraciónes, permitiendo asi que si
en un futuro se quieran implementar o dar más opciones de impresoras, el desarollador simplemente cree la nueva clase(tipo de impresora) implementando la interfaz base; sobre el
hecho de que algunas impresoras se dejarian de utilizar en un futuro, entonces, con la inversión de control que permite Spring, le podemos informar al framework cual de las 
distintas implementaciones queremos aplicar sobre el esquema factory adicional que utilizamos para permitir al usuario elegir en que impresora quiere imprimir.

Todo esto se hizo en el proyecto Topic2WithPlainSpring, ya que el otro proyecto es un approach diferente hacia esta misma problematica utilizando los perfiles para la inyección
de dependencias que nos permite Spring.
