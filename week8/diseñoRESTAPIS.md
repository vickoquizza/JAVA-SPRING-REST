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
