# RHVO Post - MongoDB4
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/renatohvo/rhvopost-mongodb4/blob/main/LICENSE) 

## Sobre o projeto
[Link Postman Collection](https://elements.getpostman.com/redirect?entityId=21956516-8e69ba20-0dc5-4306-9f08-1e704a40b20e&entityType=collection "Link Postman Collection")

Manutenção de Usuários, Postagens e Comentários. [DevSuperior](https://github.com/devsuperior/nosql/blob/main/workshop-springboot2-mongo4/README.md "https://github.com/devsuperior/nosql")

## Tecnologias utilizadas

- API REST
- Java
- Spring Boot
- DTO
- MongoDB & MongoDB Compass
- Docker
- Maven
- Postman
- Swagger
- Git

## Container Docker do MongoDB

```
docker run -d -p 27017:27017 -v /data/db --name mongo1 mongo:4.4.3-bionic
```
```
docker exec -it mongo1 bash
```

## Como executar o projeto

Pré-requisitos: Java 11 & Docker

```bash
# clonar repositório
git clone https://github.com/renatohvo/rhvopost-mongodb4.git

# entrar na pasta do projeto backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Modelo conceitual
![Modelo Conceitual](https://github.com/renatohvo/assets/raw/main/rhvopost-mongodb4/modeloconceitual-rhvopost-mongodb4.png)

## Print MongoDB Compass
![MongoDB Compass](https://github.com/renatohvo/assets/raw/main/rhvopost-mongodb4/print-rhvopost-mongodb4.png)

## Autor

Renato Henrique Vasconcelos

https://www.linkedin.com/in/renatohvo/

## 

<div display: inline-block>
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" width="50" heigth="50" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="Spring" width="50" heigth="50" />
    <img src="https://raw.githubusercontent.com/vscode-icons/vscode-icons/63a4a33b35b50d243716d03b95a955e49db97662/icons/file_type_maven.svg" alt="Maven" width="50" heigth="50" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-plain.svg" alt="Docker" width="55" heigth="55" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mongodb/mongodb-original.svg" alt="MongoDB" width="50" height="50" />
    <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="Postman" width="50" height="50" />
    <img src="https://raw.githubusercontent.com/vscode-icons/vscode-icons/63a4a33b35b50d243716d03b95a955e49db97662/icons/file_type_swagger.svg" alt="Swagger" alt="Swagger" width="55" heigth="55" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-plain.svg" alt="Git" width="50" heigth="50" />
</div>
