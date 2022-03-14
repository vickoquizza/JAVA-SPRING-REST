# ¿Como se diseñan las REST APIS?

## Primer paso - Identificar los Recursos.

Segun el esquema de arquitectura REST, todo lo que puede ser una funcionalidad o datos puede ser manipulado como un recurso, sin embargo, para condensar todo en pocas
definiciones se dice que todo recurso es:
- Dispositivos.
- Configuraciones -> Un subrecurso de un dispositivo.

Donde cada recurso al final tiene que tener un numero de identificación unico.

## Segundo en paso - Conociendo los recursos, es hora de modelarlos.

Ahora que se conocen los recursos, hay que modelarlos para que su dirección descirba la manera de acceder a ellos dependiendo de los atributos que tenga presentes. En este caso
como solo se tienen el atributo minimo para cada recurso, el mapeo de las URIs de los recursos queda asi:

<pre><code>
/resources
/resources/{id}

/configurations
/configurations/{id]

/resources/{id}/configurations
/resources/{id}/configurations/{id}
</pre></code>

Para la creación de las URIs, siempre hay que tener en cuenta de que no se deben introducir verbos, si no solo los nombres y atrbutos de los recursos deben estar presente en las URIs.

## Tercer paso - Elegir la forma en la que los recursos seran representados en la REST API

Es importante ,ya que se tienen las direcciones URI de la REST API, buscar la manera de representar los recursos que se estaran enviado y recibiendo de esta misma, esto puede hacerse mediante XML o JSON

### Colección de recursos (/resources)

Es la forma de tener todos los recursos de la forma más rapida, sin necesidad de tener redireccionamiento o información de las configraciones.

### Retorno de un solo recurso (/resources/{id})

Un solo recurso debe ser capaz de devolver la información sobre ese recurso y tambien información sobre las posibles confifguraciones u otros metodos y atributos que puede efectuar, para esto se necesita tambien de conocer y utilizar operaciones HATETOAS.

### Retorno de configuraciones (/configurations)

Funcionaria de igual manera que el retorno de multiples recursos, solo que en este caso se devuelven son los posibles recursos.

### Retorno de una sola configuración (/configurations{id})

Funcionaria de igual manera que cuando se devuelve un solo recurso 

### Retorno de multiples configfuraciones pertenecientes a un recurso en especifico

