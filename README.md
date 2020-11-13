# desafio-backend

Projeto desenvolvido utilizando as seguintes tecnologias:

### Tecnologias Utilizadas

 - SpringBoot
 - Java 8
 - Liquibase
 - Hibernate
 - JPA
 - Lombok
 
### Banco de Dados utilizado
  - MySQL

## Para execução do projeto, é necessário uma instância de banco de dados do MySQL, abaixo está o comando a ser executado caso utilize o Docker

```sh
docker run -d -p 3306:3306 --name=mysql -e MYSQL_ROOT_PASSWORD=desafio2020 -e MYSQL_DATABASE=desafio -e MYSQL_ROOT_HOST=% mysql:latest \
--default-authentication-plugin=mysql_native_password
```

Após inicializado o container, executar o projeto do springboot.
