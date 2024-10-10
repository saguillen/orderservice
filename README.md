# Implementación  del codigo de entrevista.

## Detalles de la Implementación:

* Creación de Service y Repository.

* Se realizaron inserciones a la base de datos con registros de prueba de la manera correcta.

* Me puse un poco creativo entonces guardé todos los Pedidos tanto en ArrayList como en un HashMap. 
De esta forma, guardando los ID y Pedidos como Llave y Valor respectivamente, se puede consultar más facilmente el Pedido con ID 100.
En caso de que no exista se devuelve un codigo de error de contenido no encontrado 204.

* Se busca un cliente especificado por defecto en el arreglo de Pedidos inicial. 

* Finalmente se valida que sí exista el pedido con el ID especificado y sea filtrado por Cliente.

* Se devuelve el Pedido especificado como ID 100 y Cliente.

* Endpoint funcional corregido.

