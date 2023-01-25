# Clean Code y SOLID

Este es un repositorio basado en el curso de Udemy [Principios SOLID y Clean Code. Escribe código de calidad](https://www.udemy.com/course/principios-solid-y-clean-code-escribe-codigo-de-calidad/) 

## Clean Code

Uno de los puntos mas importante de el clean code es el `nombramiento` el cual ayuda al programador enteder el funcianmiento de un sisitema incluso sin o poca documentación a la hora de nombrar una clase, función o variable se recomienda que el nombre sea claro y diciente además de pronunciable.
El nombre de las `clases` debe ser `Sustantivos` mientras el el nombre de los `metodos` o `funciones` debe ser un `verbo`.

### Funciones
    - pequenas
    - hacen un sola cosa
    - nivel de absrtracion unico
    - reciben pocos argumentos
    - no tienen efentos secuandarios
    - retornan exepciones en lugar de errores
    - es recomendabre no retornar ni pasar null como argumento

En las funciones es preferible lanzar Exepciones de tipo `unchecked exeptions` (extienden de RuntimeException) ya que  estas ocuerrenen tiempo de ejecucion y su manejo no es obligario y ni propagado.

### Otros Apuntes

- Es preferible el Clean code a los comentarios ya que estos ultimos puende quedar obsoletos rapidamente a medida que el codigo cambia.

- Espreferible tener varios metodos que relicen una sola cosa a un metodo grande y monolitico.

- El uso de TDD es una buena practica y ayuda al programdor a refactorizar codigo y asegurar que no ha dañado el funcionameinto del mismo, ademas sirve como docuemtnacion.


## Code Smell

### En los comentarios
- Conmentarios redundantes o que ya estan almacenados en otro sistema como sitema de control de versiones o el gestor de proyectos

- Comentarios obsoletos
- Comenarios redundantes
- Comentarios mal redactados
- Codigo comentado

### En el entorno de desarrollo
- La compilacion requiere mas de un paso
- Los test requieren mas de un paso

### En las funciones
- Funciones con demaciados argumentos (evitar tener mas de 3 agumentos)
- Argumetns de salida (evitar pasar variable por referencia para usarla como retorno)
- Funciones que reciben como parametro una bandera o flag (esto indica que la funcion realiza mas de una cosa)
- Funciones muertas (se debe borrar funciones que no se usa) 


### Smells generales
- Mezclar multiples lenguajes en un unico fechero
- Comportamieto Obvio no implementado
- Comportamiento incorrecto en los limites
- Anular mecanismos de seguridad
- Duplicidad
- Codigo en nivel de abstacion incorrecto
- Las clases base dependen de las derivadas (herencia)
- Demaciada informacion (se debe realizar un buen enpsulameinto)
- Codigo muerto
- Distancia vertical (las bariables locales se deben declaran antes de usarlas, las fuciones privadas deven estar justo despues de de la plicmara funcion que als usa y en el orden de llamado).
- Inconsistencia (realizar simpre las cosas de la misma forma)
- Codigo basura (evitar constructores sin implementar, varibles que no se usan, etc....)
- acoplamiento artificial (evitar asociar algo generico a algo especifico)
- Envidia del ambito de otra clase (evitar usar demaciados metodos de otra clase)
- Funciones que reciben una bandera o Flag
- Codigo con intenciones ocultas o dificiles de apreciar (el codigo debe ser facil de leer)
- Responsablidad fuera de lugar (El codigo debe ser escrito en el lugar mas natural para el lector)
- Metodos estaticos inaporpieados 
- No usar variables explicatorias (es preferible crear variables itnermedias para que el funcinamiento sea mas claro para el lector)
- Funciones que no dicen lo que hacen (se debe nombrar de manera que sea entendible)
- No conocer el Algoritomo que se quiere implementar
- Tener dependencias logicas en lugar de fisicas (se debe solicitar informacion a la depencia correspondiente)
- Usar If/Else en lugar de polimorfismo (Es preferible el uso del plimorfismo en lugar del if / else)
- No seguir las convenciones del lenguage
- Usar numeros magicos en lugar de constantes (Al usar numeros en el codigo es preferible declararlos como constantes asi se tiene la oportinidad de explicar para de donde salen)
- No se preciso (se debe tratar el redondeo, concurrenia, excepcioens, etc..)
- Darle mas peso a conveciones que a la escritura
- No encapsular condiciones (crear fucione en la evaluacion del condicional con la finalidad de que sea ligible a la primera)
- Usar condicionales negarivos (negados)
- Las funciones hacen mas de una cosa
- Acoplamientos temporales escondidos
- Ser Arbitrario
- No encapsular las condiciones limite (es preferible usar una variable para que la condicion quede mas legible)
- Funciones con mas de un nivel de abstraccion
- Configuraciones no modificables a alto nivel
- Navegacion transitiva (se debe escribir codigo timido para evitar una arquitecura rigida)


### Code Smells en java
- listas de importaciones muy largas (si se usa mas de dos clases de un paquete es preferible importar todo el paquete import package.*)
- Herencia de constantes (eviatar especialmente las de las interfaces), (es recomendable crearlo en una clase de constantes)
- Usar constantes en lugar de enums (Se recomienda usar enums ya que son mas potententes y aportan funcionalida mas clara)

### Code Smells en las en los nombres
 - Uso de nombre de variables no descriptivas
 - Nombres en nivel de abstración incorrectos
 - No usar nomenclatura estandar (se debe usar nombres: controller,service etc...  ademas de sobreescrir metodos como toString en lugar crear nuevos)
 - Usar nombres ambiguos
 - No usar nombres largos para largos alcances
 - Usar codificaciones (evitar prefijos de tipado redundantes)
 - Ocultar efectos secundarios (el nombre de las funciones debe describir su comportamiento ademas de realizar una unica funcion)

### Code Smell en los Test
- Test insificientes
- No usar herramienta de cobertura
- Evitar los test triviales
- Test ignorados
- No testear las condiciones limite
- No buscar bugs de forma exhaustiva (los busgs tienen a estar cerca entre si)
- Los patrones de fallo son reveladores
- La covertura de codigo es reveladora
- Test lentos

## SOLID

### Cohecion 
Es el grado en el que los elementos de un modulo estan relacioanados entre si por tanto nos interesa que un modulo tenga una cohecion muy alta

### Acoplamiento
El grado en el que dos unidades de software estan relacionados entre si por tanto se recomienda un bajo acoplamiento para evitar afectar el funcianamiento de un modulo si se llega modificar otro.

- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

### Single Responsibility Principle (principio de responsablidad unica)
Una clase solo debe tener una razon para cambiar, esto incluye a los actores que hacen uso de la case, por eso si dos actires distintos no deben usar la misma clase.

### Open/Closed Principle (principio abierto cerrado)
Un artefacto de sofware debe estar abierto para su extension pero cerrado para su modificadcion esto permitira agregar funcionalidad sin modificar un comporamiento ya existente, en especial se deben proteger los compoenntes de alto nivel de los cambios surgidos en los componentes de bajo nievel.

### Liskov Substitution Principle (principio de substitucion de Liskov)
Todas las clases que hereden de otra podran usarse indistintamente sin que esto riompa la aplicacion, incluyendo en ello la clase padre.

### LInterface Segregation Principle (principio de segregacion de la interfaz)
Una clase no debe implementar metodos que no use.

### Dependency Inversion Principle (principio de inversion de dependencia)
Los sistemas mas flexibles son aquellos que dependen de abstraciones, y no de concresiones.