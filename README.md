# springboot
---
Basico de Spring Boot, usando @RequestMapping, @PostMapping(), @RestController, @RestController, @GetMapping(path = "/qualquer")

[![Build Status](https://travis-ci.org/murilonerdx/springboot.svg?branch=main)](https://travis-ci.org/murilonerdx/springboot)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
---
- MAVEN & POM.XML
- Web Service
- Erros
-  Formato Json
- Postman
- Parametros WEB SERVICE
- Web Sevice calculadora
- Padrão Model - View - Controller ( MODEL = Regras de negocio, entidades, camada de acesso á dados, VIEW = Javascript, CSS, Html, Controller = Cordena o fluxo de dados entre Model e View ).
- JPA
- Inserir Produto, Injeção de Dependencia, Novos atributos, aplicando validações
--------
# Versões suportadas

- [JDK 11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
- [Maven 3](https://maven.apache.org)

```shell
./mvnw spring-boot:run
```
--------

### Basico

```
http://localhost:8080/ola
```

```
http://localhost:8080/api/produtos
```

JSON Request:

```json
[{"nome":"Abacate", "preco": 40.00, "desconto": 0.05}]
```
JSON Response:
```json
[{"id": 8,"nome": "Abacate","preco": 40.0,"desconto": 0.05,"precoDesconto": 38.0}]
```


