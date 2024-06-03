# Museo de Arte 

### Bienvenido al Museo de Arte

Introducción a los paquetes y sus respectivas clases: 
1. **artmuseum**
   * Lo compone la clase principal o **_Main_** donde se inicializan los métodos que dan vida a este proyecto.
   * Acompañado de un archivo txt, que permite probar el tratamiento de ficheros.
   
2. **excepciones**
   
3. **menu**
    * La interfaz **_MenuActions_** que implementa los métodos: agregar, listar, modificar, eliminar y buscar a las  clases **MenuArtistas y MenuObrasDeArte.**
    * La clase **_MenuArtistas_** permite realizar la búsqueda y registro de Artistas tanto por su ID asignado como por nombre.
    * La clase **_MenuObrasDeArte_** permite realizar la búsqueda y registro de Obras de Arte, cuenta con los métodos implementados y uno propio que permite conocer la Antigüedad de las Obras de Arte.
   
4. **obradearte**
    * La clase abstracta **_ObraDeArte_** extiende a las clases Fotografia, Escultura y Pintura. Cuenta con 4 métodos, 3 de ellos abstractos. Permitiendo que las subclases los implementen como  deseen.
    * La clase **_Escultura_** extiende de **ObraDeArte** cuenta con sus atributos propios y métodos sobrescritos.
    * La clase **_Fotografia_** extiende de **ObraDeArte** cuenta con sus atributos propios y métodos sobrescritos.
    * La clase **_Pintura_** extiende de **ObraDeArte** cuenta con sus atributos propios y métodos sobrescritos.
   
5. **persona**
    * La clase abstracta **_Persona_** extiende a las clases Artista, Celador y Visitante. Cada persona tiene su identificación que lo hace una persona, y una id que permite llevar registro de  
   su papel dentro del museo. Una forma de clasificar y gestionar la entrada de datos por cada objeto. 
    * La clase abstracta **_Artista_** extiende a las clases **Fotografo, Escultor y Pintor**.
    * La clase **_Fotografo_** cuenta con un atributo propio y los métodos necesarios para el proceso de la información.
    * La clase **_Escultor_** cuenta con un atributo propio y los métodos necesarios para el proceso de la información.
    * La clase **_Pintor_** cuenta con un atributo propio y los métodos necesarios para el proceso de la información.
    * La clase **_Celador_** cuenta con un sistema de Alarma, que permite identificar anomalias causadas por los visitantes. (Como lanzar sopa de tomate).
    * La clase **_Visitante_** más allá de permitir conocer el número de ingresos que recibe el Museo, los visitantes también son causantes de los dolores de cabeza de la clase Celador. 
   

¿Estás preparado para vivir la experiencia dentro de este museo? 
