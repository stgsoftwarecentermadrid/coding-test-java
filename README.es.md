# :trophy: Reto: Servicio de gestión de productos de Straumann

[![en](https://img.shields.io/badge/lang-en-yellow.svg)](https://github.com/stgsoftwarecentermadrid/coding-test-java/blob/main/README.md)
[![es](https://img.shields.io/badge/lang-es-green.svg)](https://github.com/stgsoftwarecentermadrid/coding-test-java/blob/main/README.es.md)

Este repositorio alberga una API parcialmente desarrollada destinada a facilitar la gestión de productos de Straumann. Tu objetivo será implementar las historias de usuario que se describen más adelante.

Los supuestos están basados en un hipotético _equipo de gestión de los productos de Straumann_, que demanda una serie de verificaciones automáticas para clasificar los productos en base a una serie de características concretas.

## :pencil: Historias de usuario

- Yo como equipo de gestión de los productos de Straumann quiero que los usuarios no vean productos que estén descatalogados. Un producto se considera descatalogado si tiene su propiedad status como DISCONTINUED.

- Yo como equipo de gestión de los productos de Straumann quiero poder añadir productos al catálogo, pudiendo indicar su nombre, marca, código, categoría y precio. Por defecto, la moneda del producto será en Euros (EUR) y el estado del producto será en stock.

- Yo como equipo de gestión de los productos de Straumann quiero poder modificar los precios de los productos actuales y la disponibilidad del mismo.

- Yo como equipo de gestión de los productos de Straumann quiero tener un proceso automático que se ejecute todas las noches y que, aquellos productos que se encuentren descatalogados, se borren del sistema.

- Yo como cliente del catálogo de productos de Straumann quiero poder ver todos los productos disponibles para su compra y poder filtrarlos por categoría de producto, por marca, y por orden de precio (de mayor a menor y de menor a mayor).

## :warning: Consideraciones importantes

En este proyecto te proporcionamos un pequeño _esqueleto_ escrito en Java usando [Spring Boot](https://spring.io/projects/spring-boot).

En dicho _esqueleto_ hemos dejado para que completes un [Controller](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html) y un [Repository](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Repository.html) en memoria. Puedes crear las clases y métodos que consideres necesarios.

Podrás ejecutar el proyecto usando Gradle ejecutando el siguiente comando en la carpeta donde esté el fichero `build.gradle`:

```bash
$ ./gradlew bootRun
```

**La persistencia de datos no forma parte del objetivo del reto**. Si no vas a usar el esqueleto que te proporcionamos, te sugerimos que la simplifiques tanto como puedas (con una base de datos embebida, "persistiendo" los objetos en memoria, usando un fichero...).

**El diseño de una interfaz gráfica tampoco** forma parte del alcance del reto, por tanto, no es necesario que la implementes.

**Nota:** A lo que más importancia damos es a tener un código limpio y de calidad.

### Requisitos mínimos

A continuación se enumeran los requisitos mínimos para ejecutar el proyecto:

- Java 17
- Gradle 8.6

Otras versiones pueden funcionar, pero no han sido probadas y pueden presentar errores.

## :white_check_mark: Criterios de aceptación

- El código debe compilar y ser ejecutable :dancer:

- Debes proporcionar 3 endpoints:

  - Uno para la obtención de los productos por parte de un cliente del catálogo Straumann, donde pueda ver los productos y filtrarlos por categoría, por marca y por orden de precio.

  - Otro para la posible modificación de precios o disponibilidad de uno de los productos por parte del equipo de gestión de los productos de Straumann.

  - Otro para la posible inclusion de nuevos productos por parte del equipo de gestión de los productos de Straumann.

## Entrega del código

- En caso de ser seleccionado como candidato, recibirás por correo electrónico las instrucciones e hipervínculos con repositorio Git en GitHub donde deberás depositar el código que hayas desarrollado.

### Otras

- Se valorará de manera positiva la inclusión de pruebas automáticas de código o testing.

- Puedes añadir cualquier cosa que veas relevante para la legibilidad o mantenimiento del código.

### Good luck :four_leaf_clover:
