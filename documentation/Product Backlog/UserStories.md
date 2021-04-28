## Párrafo 1:
La cooperativa se ha contactado con nosotros porque necesita implementar una página web que permita a los ciudadanos, que tienen en sus hogares elementos reciclables, dar aviso para ser retirados por los cartoneros. Según nos explica Cecilia, una de las responsables de la cooperativa, los cartoneros se movilizan con vehículos que tienen diferentes capacidades/volumen de transporte. Por esta razón, los ciudadanos, además de indicar sus datos personales (nombre, apellido, dirección y teléfono) y franja horaria de preferencia en la que el cartonero pase a retirar los materiales (9 a 12hs o 13 a 17hs), deberá indicar mediante una categoría el volumen de los materiales a retirar: a) entra en una caja b) entra en el baúl de un auto, c) entra en la caja de una camioneta, d) es necesario un camión. Además, de forma opcional, el ciudadano deberá poder cargar una foto de los materiales. En el caso que la distancia del lugar de retiro sea mayor a 6 km del centro de acopio, el sistema deberá denegar la solicitud de recolección e informarle al ciudadano que lo acerque personalmente al centro de acopio.

- Como ciudadano quiero dar aviso para que los cartoneros retiren elementos reciclables.
	- Criterios de aceptación:
		- Indicar(o registrar) datos personales (nombre, apellido, dirección y teléfono).
		- Indicar franja horaria en la que el cartonero debe pasar a retirar los materiales (9 a 12 o 13 a 17).
		- Indicar categoría de volumen de los materiales (caja, baúl de auto, caja de camioneta, camión).
	-	 Si la distancia del centro de acoplo al lugar de retiro es mayor a 6 km, se deniega la solicitud y se le informa que lo acerque el mismo al centro de acoplo.
**¿Es necesario escribir las opciones en los criterios de aceptaciones?**

- Como ciudadano quiero registrar que el cartonero visitó el lugar de retiro para <objetivo>.
**¿Esta user story es válida? Porque en el párrafo 4 dice que el cartonero tiene que marcar los domicilios visitados. ¿Va una o van las dos?**

## Párrafo 2:
Todos los días, de lunes a viernes, a las 8am el sistema generará un listado automático de recorridos para cada uno de los cartoneros indicando a qué direcciones deben dirigirse y en qué franjas horarias. Este listado será enviado al email de la secretaria de la cooperativa. Para realizar el listado automático, el sistema deberá tener en cuenta las siguientes características:
Se deberá ser equitativo con todos los cartoneros registrados
- No se deberá asignar de forma diaria a un cartonero más de lo que puede transportar en su vehículo
- En caso de asignarse varias viviendas a un cartonero, el total del recorrido (incluido el viaje hasta el depósito) no debe superar los 6 km.
- En aquellos casos donde el volumen a retirar corresponde a la categoría “a”, solo se le deberá asignar a un cartonero en caso de que el lugar de recolección quede en su camino a otras viviendas con categorías de volumen mayores (es decir, “b”, “c” y “d”).

**Como secretaria quiero quiero obtener un listado para asignárselos a los cartoneros.**
**Como cartonero quiero recibir el recorrido de los domicilios para poder organizarme de manera óptima**

**Duda: ¿está bien separarlas así?**

## Párrafo 3:
Para poder mantener actualizado el listado de cartoneros activos y los vehículos que
utilizan, la página web deberá contar con una sección que permita dar de alta, modificar y eliminar datos de los cartoneros. Cada vez que un nuevo cartonero se sume a la cooperativa o que un cartonero existente cambie de vehículo (o alguno de sus datos de contacto), se deberá registrar el cambio en el sistema. Para ello, el cartonero deberá informar los datos pertinentes (nombre, apellido, DNI, dirección y fecha de nacimiento) a la secretaria que será la encargada de cargar los datos en el sistema. En general, por su rutina diaria, la secretaria realiza esta tarea los días viernes. Esta sección no deberá ser accesible por los ciudadanos, por lo que deberá preverse un registro para la secretaria mediante usuario y contraseña.
Esta sección no debe estar abierta para los ciudadanos.
- Como secretaria de la cooperativa quiero poder dar de alta un cartonero para <objetivo>.
	- Criterios de aceptación:
		- La secretaria debe estar autenticada. **¿Tenemos que hacer un user story para que se registre? Porque estoy incluiría toda la parte de contraseñas, etc.**
		- Agregar nombre, apellido, DNI, dirección y fecha de nacimiento.
- Como secretaria de la cooperativa quiero poder modificar datos de un cartonero <objetivo>.
	- Criterios de aceptación:
	- La secretaria debe estar autenticada.
	- Los datos que se pueden modificar son: datos de contacto o un cambio de vehículo.
- Como secretaria de la cooperativa quiero poder eliminar datos de un cartonero <objetivo>.
	- Criterios de aceptación:
		- La secretaria debe estar autenticada.
		- Los datos que se pueden modificar son: datos de contacto o un cambio de vehículo.
**¿Modificar y eliminar sería lo mismo? Modificar sería cambiar el valor de un dato, eliminar sería borrar el valor del dato y quedaría vacío. ¿Cómo querés que implementemos esto?**
**¿El objetivo puede repetirse para las tres?**

## Párrafo 4:
Cuando un cartonero llega al centro de acopio, los materiales con los que arriba deben pesarse y registrarse en el sistema con el objetivo de llevar un registro de los kilos de cada material recolectado por el/la cartonero/a. Es importante destacar que el centro de acopio cuenta con una balanza con tecnología Bluetooth por lo que sería deseable que el peso se obtenga automáticamente de la misma. En el caso de que los datos del cartonero no estén en el sistema, el sistema deberá ofrecer la posibilidad de registrarlos.
Adicionalmente, el sistema deberá consultar cuáles domicilios de los que tenía el cartonero asignados en su listado de recorridos fueron visitados. El sistema deberá tener en cuenta aquellos domicilios no visitados para ser incluidos en la próxima generación de listado de recorridos.

- Como cartonero, deseo poder pesar los materiales para llevar un control de la cantidad de materiales.
	- Criterios de aceptación:
		- Si el cartonero no está registrado, el sistema debe poder registrarlos. **¿Se auto-registra o lo hace la secretaria en el momento?**
- Como secretaria deseo consultar los domicilios visitados por el cartonero para armar el próximo recorrido.

**Como cartonero tengo que poder registrar mis datos. ¿Esto sería un criterio de aceptación de 6) o una user story a parte? Si lo vemos como un caso de uso sería un flujo alternativo.**

## Párrafo 5:
De forma similar, suelen llegar al centro de acopio ciudadanos que llevan materiales reciclables. En este caso, también deben pesarse y registrarse cada tipo de material utilizando la balanza con tecnología Bluetooth (mismo proceso que se realiza para el
cartonero). A diferencia del caso anterior, en este caso, los materiales deben imputarse a un usuario genérico denominado “vecino buena onda”.

- Como ciudadano, deseo poder llevar los materiales reciclables para contribuir con el medio ambiente.
	- Criterios de aceptación:
		- Debe imputarse a un usuario “vecino buena onda”.
		- Debe poder utilizarse la balanza del acopio(depósito).

## Párrafo 6:

Cecilia también nos comenta que la página debería contar con una sección en la que se explique cómo se debe entregar el material. Por ejemplo, las latas de aluminio deben estar secas y aplastadas, las cajas de cartón desarmadas y limpias, etc. También deberían listarse en la página los materiales reciclables que son aceptados por la cooperativa y cuáles no. Según nos explica Cecilia, esto puede ser confuso para los ciudadanos dado que para algunos tipos de materiales existen restricciones. Por ejemplo, si bien se aceptan plásticos, algunos tipos de envases plásticos como los de yogur o queso blanco no son aceptados. Dado que la cooperativa genera nuevos convenios con empresas recicladoras de forma periódica, los materiales aceptados suelen variar. Por esta razón, la página deberá permitir cambiar a la secretaria los materiales aceptados.

- Como ciudadano quiero saber cómo se entregan los materiales para llevarlos en forma correcta.
- Como ciudadano quiero conocer el listado de los materiales reciclables aceptados para <objetivo>.
- Como secretaria quiero administrar una sección informativa para informar los materiales aceptados.
	- Criterios de aceptación:
		- La secretaria debe estar autenticada.

Párrafo 7:
Con el objetivo de generar comunidades de ciudadanos recicladores, la cooperativa nos ha solicitado que la página cuente también con una cartelera virtual. El objetivo de la misma será vincular a ciudadanos que van a acercar personalmente materiales
reciclables al centro de acopio (“vecino buena onda”) y que ofrecen el espacio sobrante de sus vehículos para transportar los materiales de otros ciudadanos. Para simplificar la operatoria, al momento de cargar una “oferta de transporte”, el sistema le solicitará al
ciudadano nombre, teléfono, email, dirección, espacio disponible y un espacio de texto libre. El sistema generará un post que solo incluirá (por motivos de privacidad) la zona geográfica (que se calculará a partir de la dirección), el espacio disponible y el texto libre.
Una vez publicada la oferta, los ciudadanos interesados podrán “postular” para hacer uso del servicio. En este caso el sistema solicitará al ciudadano postulante nombre, teléfono, dirección y el volumen de los materiales a retirar. Deben mostrarse las siguientes categorías, a) entra en una caja b) entra en el baúl de un auto, c) entra en la caja de una camioneta, d) es necesario un camión. Cuando se cargue una postulación, el sistema enviará un email al ciudadano que generó la oferta de transporte con los datos de la postulación. En este punto, el ciudadano que generó la oferta podrá aceptar o rechazar la postulación. En caso de aceptarla, los datos previamente cargados del ciudadano que generó la oferta se enviarán al postulante para que puedan coordinar el viaje. En caso de rechazarla, se enviará una notificación al postulante.

*Postulante = el que dice que puede llevar los materiales al centro de acoplo.*
*Solicitante = el que necesita comunicarse con el postulante.*

- Como ciudadano quiero poder vincularme como otros ciudadanos para generar una comunidad recicladora.
- Como ciudadano quiero poder publicar una oferta de transporte para (beneficiar a otra persona, conseguir participantes) simplificar la operatoria.
	- Criterios de aceptación:
		- Indicar nombre, teléfono, email, dirección, espacio disponible y espacio de texto libre.
- Como ciudadano quiero poder seleccionar el uso del servicio “vecino buena onda” para que retiren los residuos.
	- Criterios de aceptación:
		- El ciudadano debe estar autenticado.
		- Indicar dirección, nombre, teléfono y volumen de los materiales a retirar.
		- Enviar mail al ciudadano que generó la oferta.
- Como ciudadano quiero poder aceptar una oferta del postulante //de retiro de acoplo de vecino amigable// para “contribuir”. //DUDA
	- Criterios de aceptación:
		- El ciudadano debe estar autenticado.
		- Enviar datos del ciudadano solicitante al postulante.
- Como ciudadano quiero poder rechazar una oferta del postulante //retiro de acoplo de vecino amigable// para ...
	- Criterios de aceptación:
		- El ciudadano debe estar autenticado.
		- Enviar notificación al postulante.
**¿Cómo se autentica el ciudadano? ¿Tiene que tener una cuenta? En caso de que la necesite, ¿tenemos que hacerlo en una user story a parte?*

## Párrafo 8:
Cada vez que la cooperativa cierra una venta con una empresa recicladora por un cierto material, la secretaria necesita saber qué porcentaje le corresponde a cada cartonero.
Para ello, el sistema deberá listar por cada cartonero los kilos acopiados de un material dado junto con el porcentaje del total acopiado. Adicionalmente, el sistema deberá permitir a la secretaria registrar la cantidad de kilos vendidos los cuales se restarán de forma equitativa de lo acopiado por cada cartonero.

- Como secretaria quiero saber qué porcentaje le corresponde a cada cartonero para así saber cuánto tiene que pagarle.
	- Criterio de aceptación:
		- La secretaria debe estar autenticada.
- Como secretaria quiero conocer el listado de kilos por cada cartonero para restar los kilos de manera equitativa.
	- Criterio de aceptación:
		- La secretaria debe estar autenticada.
- Como secretaria quiero registrar la cantidad de kilos vendidos para <objetivo> (¿sería el mismo objetivo que 18?).
	- Criterio de aceptación:
	- La secretaria debe estar autenticada.










