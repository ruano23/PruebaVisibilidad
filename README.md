# README - VISIBILIDAD ALGORITMO
Primeramente se han leído los requisitos solicitados y analizado detenidamente que es lo que se pide implementar y qué 
se debía de entregar, en tiempo y fecha se ha dado prioridad a desarrollar el código, comprobar que funcionaba cada 
parte correctamente.
Se ha creado un proyecto en Spring Initializr con las dependencias y versión java con la que queríamos trabajar.
Se ha importado dicho proyecto en el entorno de trabajo de intelliJ y conectado en un repositorio de github, 
creando una rama principal y una rama secundaria en la que hemos ido trabajando y luego se ha realizado el conveniente
merge.

Con respecto al código se ha ido creando la base de la aplicación con los objetos que se solicitaban, posteriormente 
se ha ido creando de abajo hacia arriba, el repositorio, el sevicio y el controlador. De cada paquete de trabajo se ha
realizado su respectivo test unitario para ir comprobando fase a fase que lo construido iba funcionando.

En los repositorios se ha creado tres interfaces, una para cada objeto y se ha creado una llamada a la "base de datos", 
que en nuestro caso han sido los ".csv". En la capa servicio se ha creado un método que generaba la salida con las 
casuísticas solicitadas y desarrollado el algoritmo. En el controlador se crea el modelo para retornar la salida esperada.

Si hablamos del algoritmo en sí, segun el documento PDF donde se explica lo que hay que realizar hay un apartado que 
indica la "salida" supuestamente efectiva, pero una vez que se leen las casuísticas y requisitos, a mi entender 
todos los productos deben de salir y eso es lo que he generado, la salida de productos con su identificador en el orden 
de secuencia. En el documento los productos 2 y 4 no se muestran, pero en nuestro caso al tener cada uno de estros productos
la propiedad "backsoon" en TRUE y según el primer requisito que dice así:
"La primera es cuando una talla está marcada como back soon, en este caso, aunque la talla no tenga stock, el producto debe mostrarse igual, puesto que es un producto que va a volver a estar a la venta cuando vuelva a entrar stock.".

Con respecto a la dockerización, nunca la había realizado antes e intentado hacerlo, me he instado todo sobre docker, 
generado el archivo Dockerfile, pero no he logrado resolverlo más bien por el poco tiempo que he invertido al final.


