- ¿Que es Maven? -Maven es una herramienta open-source, que se 
creó en 2001 con el objetivo de simplificar los procesos de 
build (compilar y generar ejecutables a partir del código 
fuente).

- POM significa Project Object Model, sirve para describir el 
proyecto de software a construir, sus dependencias de otros 
módulos y componentes externos, y el orden de construcción de 
los elementos. Viene con objetivos predefinidos para realizar 
ciertas tareas claramente definidas, como la compilación del 
código y su empaquetado.

- Diferencia entre Archetype y ArtifactId: la diferencia es que
un archetype es una plantilla que se puede utilizar para crear 
proyectos, módulos, etc. que se basan en parámetros 
establecidos en la definición del archetype, mientras que 
artifactid es el nombre que le pondremos al proyecto maven, 
el dorectorio que genera maven al crear el proyecto tambien
lleva este nombre.

- Goals de Maven [clean,package,install,compile]: Primero, los
goals de maven son comandos que recibe maven como parametro 
para realizar algo, pluggins que se utilizan para ampliar la 
funcionalidad. La sintaxis seria: mvn plugin:comando.

  Clean: limpia todas las clases compiladas del proyecto.
  
  Package: empaqueta el proyecto (si es un proyecto java 
  simple, genera un jar).
  
  Install: instala el artefacto en el repositorio local.
  
  Compile: compila el proyecto.
  
- Scope en Maven [compile,providde,runtime,test,system]: El scope sirve 
para indicar el alcance de nuestra dependencia y su transitividad. 

  Compile:  es la que tenemos por defecto sino especificamos scope. 
  Indica que la dependencia es necesaria para compilar. La dependencia 
  además se propaga en los proyectos dependientes.  

  Provided: Es como la anterior, pero esperas que el contenedor ya tenga 
  esa libreria.
  
  Runtime: La dependencia es necesaria en tiempo de ejecución pero no es 
  necesaria para compilar.
  
  Test: La dependencia es solo para testing que es una de las fases de 
  compilación con maven.
  
  System:  Es como provided pero tienes que incluir la dependencia 
  explicitamente. Maven no buscará este artefacto en tu repositorio local. 
  Habrá que especificar la ruta de la dependencia mediante la etiqueta 
  systemPath 


