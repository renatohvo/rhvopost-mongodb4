# RHVO Post - MongoDB4
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/renatohvo/rhvopost-mongodb4/blob/main/LICENSE) 

## Sobre o projeto

Manutenção de Usuários, Postagens e Comentários.

Em Construção!

## Tecnologias utilizadas

- API REST
- Java
- Spring Boot
- DTO
- MongoDB & MongoDB Compass
- Docker
- Maven
- Postman
- Git

## Container Docker do MongoDB

```
docker run -d -p 27017:27017 -v /data/db --name mongo1 mongo:4.4.3-bionic
```

## Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/renatohvo/rhvopost-mongodb4.git

# entrar na pasta do projeto backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Autor

Renato Henrique Vasconcelos

https://www.linkedin.com/in/renatohvo/
