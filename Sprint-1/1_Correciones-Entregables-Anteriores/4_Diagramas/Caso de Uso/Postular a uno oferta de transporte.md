
* **Nombre del caso de uso** : Postular para hacer uso de oferta de transporte.

* **Descripción breve** : Un ciudadano quiere postularse a una oferta de transporte para llevar materiales al acopio.

* **Actor primario**: Ciudadano.

* **Trigger**: El caso de uso comienza cuando un Ciudadano eligió una oferta de transporte.

* **Curso básico**: 
    1.  El caso de uso comienza cuando un Ciudadano eligió una oferta de transporte.
    2.  [INCLUDE] _Ingresar datos_.
    3.  Se envía un mail al ciudadano que generó la oferta de transporte.
    4.  El caso de uso finaliza.


* **Postcondición**: El ciudadano tuvo una respuesta sobre su postulación. 

* **Casos de uso que extiende**: Extiende el caso de uso ver cartelera de virtual, es insertado en el punto de extensión Postularse cuando se cumple la condición [el ciudadano eligió una oferta de transporte].

* **Casos de uso incluidos**: Ingersar datos.
