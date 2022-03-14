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

### Retorno de multiples configfuraciones pertenecientes a un recurso en especifico (/resources/{id}/configurations)

En este caso se devolverian multiples confifguraciones que pertenecen a un recurso en especifico, y no todas la configuraciones presentes en el sistema.

### Retorno de una configuración especifica perteneciente a un recurso en especifico (/resources/{id}/configurations/{id})

Este daria acceso a una sola configuración de un recurso especifico, pero lo mejor de esto, es que entonces se tienen multiples opciones para acceder a un mismo recuros en general, lo que nos ayuda a tener opciones secundarias para los accesos a estos mismos.

## Cuarto paso - Ahora asignar un metodo HTTP para cada uno de las URIs y modos de acceso asignados.

En este caso debemos de saber que una URI puede tener multiples metodos HTTP metodos asignados a ellos, por ejemplo si queremos acceder a los diferentes recursos y configuraciones vamos a utilizar GET, si queremos crear un nuevo recurso o nueva configuración se usaria un POST, y asi con los otros metodos HTTP.

### Metodos de acceso para los recursos

<pre><code>

GET /resources
GET /configurations

GET /resources/{id}
GET /configurations/{id}

GET /resources/{id]/configurations
GET /resources/{id]/configurations/{id}
</pre></code>

### Metodos para crear los recursos y sub-recursos

<pre><code>
POST /resources
POST /configurtations
</pre></code>

En un caso de que se quiera crear un sub-recurso para una reecurso en especifico, lo mejor es utilizar un metodo PUT, ya que este presenta la idempotencia que el POST no, y puede generar errores en nuestra arquitectura

<pre><code>
PUT /resources/{id}/configurations
</pre></code>

### Metodos para actualizar las recursos y sub-recursos

<pre><code>
PUT /resources/{id}
PUT /configurations/{id}
</pre></code>

### Metods para eliminar recursos y sub-recursos

<pre><code>
DELETE /resources/{id}
DELETE /configurations/{id}
DELETE /resources(id}/configurations/{id}
</pre></code>

## Pasos posteriores

Ahora ya se tiene el acceso y el diseño de la arquitectura para nuestra REST API, lo que faltaria entocnes es ya entrar a buscar la solución para diferentes problemas que se presentarian de seguridad, logging, redireccionamiento, etc.
