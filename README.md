# :trophy: Challenge: Straumann Product Management Service

[![en](https://img.shields.io/badge/lang-en-yellow.svg)](https://github.com/stgsoftwarecentermadrid/coding-test-java/blob/main/README.md)
[![es](https://img.shields.io/badge/lang-es-green.svg)](https://github.com/stgsoftwarecentermadrid/coding-test-java/blob/main/README.es.md)

This repository hosts a partially developed API aimed at facilitating the management of Straumann products. Your objective will be to implement the user stories described below.

The assumptions are based on a hypothetical _Straumann product management team_, which requires a series of automated checks to classify products based on specific characteristics.

## :pencil: User Stories

- As a Straumann product management team, I want users not to see products that are discontinued. A product is considered discontinued if its status property is set to DISCONTINUED.

- As a Straumann product management team, I want to be able to add products to the catalog, specifying their name, brand, code, category, and price. By default, the product's currency will be in Euros (EUR), and the product's state will be in stock.

- As a Straumann product management team, I want to be able to modify the prices of current products and their availability.

- As a Straumann product management team, I want to have an automatic process that runs every night and deletes discontinued products from the system.

- As a customer of the Straumann product catalog, I want to be able to view all available products for purchase and filter them by product category, brand, and price order (from highest to lowest and from lowest to highest).

## :warning: Important Considerations

In this project, we provide you with a small Java _skeleton_ using [Spring Boot](https://spring.io/projects/spring-boot).

In this _skeleton_, we have left a [Controller](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html) and an in-memory [Repository](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Repository.html) for you to complete. You can create the classes and methods you deem necessary.

You can run the project using Gradle by executing the following command in the folder where the `build.gradle` file is located:


```bash
$ ./gradlew bootRun
```


**Data persistence is not part of the challenge objective**. If you are not going to use the provided skeleton, we suggest you simplify it as much as possible (using an embedded database, "persisting" objects in memory, using a file...).

**Designing a graphical interface** is also not within the scope of the challenge; therefore, it is not necessary to implement it.

**Note:** We prioritize having clean and quality code.

### Minimum Requirements

Below are the minimum requirements to run the project:

- Java 17
- Gradle 8.6

Other versions may work, but they have not been tested and may have errors.

## :white_check_mark: Acceptance Criteria

- The code must compile and be executable :dancer:

- You must provide 3 endpoints:

  - One for the retrieval of products by a Straumann catalog client, where they can view products and filter them by category, brand, and price order.

  - Another for the possible modification of prices or availability of one of the products by the Straumann product management team.

  - Another for the possible inclusion of new products by the Straumann product management team.

## Code Submission

- If selected as a candidate, you will receive instructions and hyperlinks via email to a Git repository on GitHub where you will need to deposit the code you have developed.

### Others

- The inclusion of automatic code tests or testing will be positively evaluated.

- You can add anything you find relevant for code readability or maintenance.

### Good luck :four_leaf_clover:
