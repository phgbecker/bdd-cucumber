# SE Suite - Acceptance Tests

## :information_source: About

This project is just a place for me learn how automated UI with Java. If you have any suggestions, please, let me know!

## :book: Documentation

All scenarios are described with BDD and you can found them on path `src/test/resources/features`

## :rocket: Roadmap

### Done

- Acceptance test written with BDD and running with Cucumber
- Tests running only on Google Chrome yet.

### Undone

- Run Cucumber features in parallel
- Run tests in differents browsers (Google Chrome, Mozila Firefox, Internet Explore, Safari)
- Run mobile scenarios
- Configurate to run with Selenium-Grid

## :heavy_exclamation_mark: Requirements

- JDK 8
- Maven
- Google Chrome

## :arrow_forward: How to run

- Clone this project
- On path `selenium-java` execute `mvn install`
- Run all test with `mvn test -Dmaven.test.skip=false`
