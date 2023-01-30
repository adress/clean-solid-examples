# Clean Code y SOLID

Este es un repositorio basado en el curso de Udemy [Principios SOLID y Clean Code. Escribe código de calidad](https://www.udemy.com/course/principios-solid-y-clean-code-escribe-codigo-de-calidad/) 

## Clean Code

Uno de los puntos más importante del clean code es el `nombramiento` el cual ayuda al programador entender el funcionamiento de un sistema incluso sin o poca documentación a la hora de nombrar una clase, función o variable se recomienda que el nombre sea claro y diciente además de pronunciable.
El nombre de las `clases` debe ser `Sustantivos` mientras el nombre de los `métodos` o `funciones` debe ser un `verbo`.

### Funciones
    - pequeñas
    - hacen una sola cosa
    - nivel de abstracción único
    - reciben pocos argumentos
    - no tienen efectos secundarios
    - retornan excepciones en lugar de errores
    - es recomendable no retornar ni pasar null como argumento

En las funciones es preferible lanzar Excepciones de tipo `unchecked exeptions` (extienden de RuntimeException) ya que estas ocurren en tiempo de ejecución y su manejo no es obligatorio y ni propagado.

### Otros Apuntes

- Es preferible el Clean code a los comentarios ya que estos últimos pueden quedar obsoletos rápidamente a medida que el Código cambia.
- Es preferible tener varios métodos que realicen una sola cosa a un método grande y monolítico.
- El uso de TDD es una buena práctica y ayuda al programador a refactorizar código y asegurar que no ha dañado el funcionamiento del mismo, además sirve como documentación.


## Code Smell

### En los comentarios
- Comentarios redundantes o que ya están almacenados en otro sistema como sistema de control de versiones o el gestor de proyectos
- Comentarios obsoletos
- Comentarios redundantes
- Comentarios mal redactados
- Alta cantidad de código comentado

### En el entorno de desarrollo
- La compilación requiere más de un paso
- Los test requieren más de un paso

### En las funciones
- Funciones con demasiados argumentos (evitar tener más de 3 argumentos)
- Argumentos de salida (evitar pasar variable por referencia para usarla como retorno)
- Funciones que reciben como parámetro una bandera o flag (esto indica que la función realiza más de una cosa)
- Funciones muertas (se debe borrar funciones que no se usa) 

### Smells generales
- Mezclar múltiples lenguajes en un único fechero
- Comportamiento Obvio no implementado
- Comportamiento incorrecto en los limites
- Anular mecanismos de seguridad
- Duplicidad
- Código en nivel de abstracción incorrecto
- Las clases base dependen de las derivadas (herencia)
- Demasiada información (se debe realizar un buen encapsulamiento)
- Código muerto
- Distancia vertical (las variables locales se deben declaran antes de usarlas, las funciones privadas deben estar justo después de la primera función que las usa y en el orden de llamado).
- Inconsistencia (realizar siempre las cosas de la misma forma)
- Código basura (evitar constructores sin implementar, variables que no se usan, etc....)
- acoplamiento artificial (evitar asociar algo genérico a algo especifico)
- Envidia del ámbito de otra clase (evitar usar demasiados métodos de otra clase)
- Funciones que reciben una bandera o Flag
- Código con intenciones ocultas o difíciles de apreciar (el código debe ser fácil de leer)
- Responsabilidad fuera de lugar (El código debe ser escrito en el lugar más natural para el lector)
- Métodos estáticos inapropiados 
- No usar variables exploratorias (es preferible crear variables intermedias para que el funcionamiento sea más claro para el lector)
- Funciones que no dicen lo que hacen (se debe nombrar de manera que sea entendible)
- No conocer el Algoritmo que se quiere implementar
- Tener dependencias lógicas en lugar de físicas (se debe solicitar información a la dependencia correspondiente)
- Usar If/Else en lugar de polimorfismo (Es preferible el uso del polimorfismo en lugar del if / else)
- No seguir las convenciones del lenguaje
- Usar números mágicos en lugar de constantes (al usar números en el código es preferible declararlos como constantes así se tiene la oportunidad de explicar para de donde salen)
- No ser preciso (se debe tratar el redondeo, concurrencia, excepciones, etc..)
- Darles más peso a convenciones que a la escritura
- No encapsular condiciones (crear funciones en la evaluación del condicional con la finalidad de que sea legible a la primera)
- Usar condicionales negativos (negados)
- Las funciones hacen más de una cosa
- Acoplamientos temporales escondidos
- Ser Arbitrario
- No encapsular las condiciones limite (es preferible usar una variable para que la condición quede más legible)
- Funciones con más de un nivel de abstracción
- Configuraciones no modificables a alto nivel
- Navegación transitiva (se debe escribir código tímido para evitar una arquitectura rígida)


### Code Smells en java
- listas de importaciones muy largas (si se usa más de dos clases de un paquete es preferible importar todo el paquete import package.*)
- Herencia de constantes (evitar especialmente las de las interfaces), (es recomendable crearlo en una clase de constantes)
- Usar constantes en lugar de enums (Se recomienda usar enums ya que son más potentes y aportan funcionalidad más clara)

### Code Smells en las en los nombres
 - Uso de nombre de variables no descriptivas
 - Nombres en nivel de abstracción incorrectos
 - No usar nomenclatura estándar (se debe usar nombres: controller, service etc...  además de sobre escribir métodos como toString en lugar crear nuevos)
 - Usar nombres ambiguos
 - No usar nombres largos para largos alcances
 - Usar codificaciones (evitar prefijos de tipado redundantes)
 - Ocultar efectos secundarios (el nombre de las funciones debe describir su comportamiento además de realizar una única función)

### Code Smell en los Test
- Test insuficientes
- No usar herramienta de cobertura
- Evitar los test triviales
- Test ignorados
- No testear las condiciones limite
- No buscar bugs de forma exhaustiva (los busgs tienen a estar cerca entre si)
- Los patrones de fallo son reveladores
- La cobertura de código es reveladora
- Test lentos

## SOLID

### Cohesión 
Es el grado en el que los elementos de un módulo están relacionados entre sí por tanto nos interesa que un módulo tenga una cohesión muy alta

### Acoplamiento
El grado en el que dos unidades de software están relacionados entre sí por tanto se recomienda un bajo acoplamiento para evitar afectar el funcionamiento de un módulo si se llega modificar otro.

- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

### Single Responsibility Principle (principio de responsabilidad única)
Una clase solo debe tener una razón para cambiar, esto incluye a los actores que hacen uso de la case, por eso si dos actores distintos no deben usar la misma clase.

### Open/Closed Principle (principio abierto cerrado)
Un artefacto de software debe estar abierto para su extensión pero cerrado para su modificación esto permitirá agregar funcionalidad sin modificar un comportamiento ya existente, en especial se deben proteger los componentes de alto nivel de los cambios surgidos en los componentes de bajo nivel.

### Liskov Substitution Principle (principio de substitucion de Liskov)
Todas las clases que hereden de otra podrán usarse indistintamente sin que esto rompa la aplicación, incluyendo en ello la clase padre.

### Interface Segregation Principle (principio de segregacion de la interfaz)
Una clase no debe implementar métodos que no use.

### Dependency Inversion Principle (principio de inversion de dependencia)
Los sistemas más flexibles son aquellos que dependen de abstracciones, y no de concreciones.
