# springboot
---
Basico de Spring Boot, usando @RequestMapping, @PostMapping(), @RestController, @RestController, @GetMapping(path = "/qualquer")
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

- [JDK 1.8](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

```shell
mvn spring-boot:run
```

--------

### Basico

```
http://localhost:8080/ola
```

```
http://localhost:8080/api/produtos
```

JSON Response:

```json
[{"nome":"Murilo", "preco": 40.00, "desconto": 0.05}]
```
### Resultado
```json
[{"id": 8,"nome": "Abacate","preco": 40.0,"desconto": 0.05,"precoDesconto": 38.0}]
```


