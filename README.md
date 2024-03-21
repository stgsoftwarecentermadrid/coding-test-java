# Reto: Servicio de gestión de productos de Straumann

Este repositorio contiene una API parcialmente desarrollada para desarrollar un servicio que se encargue de gestionar los productos de Straumann. Tu objetivo será implementar las historias de usuario que se describen más adelante.

Los supuestos están basados en un hipotético _equipo de gestión de los productos de Straumann_, que demanda una serie de verificaciones automáticas para clasificar los productos en base a una serie de características concretas.

## Historias de usuario

- Yo como equipo de gestión de los productos de Straumann quiero que los usuarios no vean productos que estén descatalogados. Un producto se considera descatalogado si tiene su propiedad status como DISCONTINUED.

- Yo como equipo de gestión de los productos de Straumann quiero poder modificar los precios de los productos actuales e indicar si tienen una oferta.

- Yo como equipo de gestion de los productos de Straumann quiero tener un proceso automático que se ejecute todas las noches

- Yo como cliente del catálogo quiero poder ver todos los productos disponibles para su compra y poder filtrarlos por categoria de producto, o por marca.

## Consideraciones importantes

En este proyecto te proporcionamos un pequeño _esqueleto_ escrito en Java usando [Spring Boot](https://spring.io/projects/spring-boot).

En dicho _esqueleto_ hemos dejado para que completes un [Controller](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html) y un [Repository](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Repository.html) en memoria. Puedes crear las clases y métodos que consideres necesarios.

Podrás ejecutar el proyecto usando Gradle ejecutando el siguiente comando en la carpeta donde esté el fichero `build.gradle`:

```bash
$ ./gradlew bootRun
```

**La persistencia de datos no forma parte del objetivo del reto**. Si no vas a usar el esqueleto que te proporcionamos, te sugerimos que la simplifiques tanto como puedas (con una base de datos embebida, "persistiendo" los objetos en memoria, usando un fichero...).

**El diseño de una interfaz gráfica tampoco** forma parte del alcance del reto, por tanto no es necesario que la implementes.

**Nota:** A lo que más importancia damos es a tener un código limpio y de calidad.

### Requisitos mínimos

A continuación se enumeran los requisitos mínimos para ejecutar el proyecto:

- Java 17
- Gradle XXX

Otras versiones pueden funcionar, pero no han sido probadas y pueden presentar errores.

## Criterios de aceptación

- El código debe compilar y ser ejecutable :dancer:

- Debes proporcionar 3 endpoints: Uno para calcular la puntuación de todos los anuncios, otro para listar los anuncios para un usuario de idealista y otro para listar los anuncios para el responsable de del departamento de gestión de calidad.
