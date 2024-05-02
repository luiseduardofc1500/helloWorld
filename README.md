<h1 align="center">Hello Spring</h1>

<p align="center">
<a href="https://www.metropoledigital.ufrn.br/portal/"><img alt="UFRN - IMD" src="https://img.shields.io/badge/ufrn-imd-ufrn?style=for-the-badge&labelColor=%23164194&color=%230095DB&link=https%3A%2F%2Fwww.metropoledigital.ufrn.br%2Fportal%2F"></a>
<br>
<a href="https://spring.io/"><img alt="Spring Boot" src="https://img.shields.io/badge/Spring-grey?style=for-the-badge&logo=spring"></a>
</p>

API Rest de cumprimentos desenvolvida com Spring Boot.

## Iniciando

Essas instruções lhe darão uma cópia do projeto e um caminho para executá-lo localmente para fins de desenvolvimento e teste.

### Pré-Requisitos

O projeto não faz uso de nenhuma lib de fora da biblioteca padrão e, portanto, depende apenas de um ambiente de desenvolvimento Spring Web.

#### Docker Compose

Para facilitar o desenvolvimento e execução do projeto, foi criado um arquivo `docker-compose.yml` que contém a configuração de um container com o banco de dados MySQL.

### Endpoints

#### `GET /` Cumprimento padrão

##### Chamada cURL

```bash
curl --location --request GET 'http://localhost:8080/'
```

##### Resposta

```
Hello Spring!!!
```

#### `GET /greetings` Listar cumprimentos cadastrados

##### Chamada cURL

```bash
curl --location --request GET 'http://localhost:8080/greetings'
```

##### Resposta

```json
[
    {
        "id": 1,
        "message": "Hi!",
        "author": "Luís Cândido"
    }
]
```

#### `POST /greetings` Cadastrar cumprimento

##### Chamada cURL

```bash
curl --location --request POST 'http://localhost:8080/greetings' \
--header 'Content-Type: application/json' \
--data-raw '{
    "message": "Hi!",
     "author": "Luís Cândido"
}'
```

##### Resposta

```
Greeting stored with id 1
```
